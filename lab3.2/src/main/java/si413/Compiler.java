package si413;

import java.nio.file.Path;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/** AST-based Compiler.
 * This class holds variables to manage the state of a running compiler.
 * It also has a main() to scan, parse, generate the AST, and then compile
 * that AST.
 */
public class Compiler {
    private record Pair(String reg, Boolean isStrVar, Integer numAssigned) {
    }

    // These objects are used to manage the state of the compiler
    // as it goes through the AST.
    private PrintWriter dest;
    private int nextRegNum = 1;
    private List<String> literals = new ArrayList<>();
    private Set<String> litRegs = new HashSet<>();
    private Map<String, Pair> vars = new HashMap<>();
    private int nextBlockNum = 1;
    private Set<String> strVarRegs = new HashSet<>();

    /** Returns the open writer to the destination .ll file. */
    public PrintWriter dest() { return dest; }

    /** Creates a new register name and returns it.
     * @return First "%reg1", then "%reg2", etc.
     */
    public String nextRegister() {
        return String.format("%%reg%d", nextRegNum++);
    }

    public boolean isLiteral(String reg) {
        return litRegs.contains(reg);
    }

    public String maybeDup(String reg) {
        if (isLiteral(reg)) {
            String dup = nextRegister();
            dest.format("  %s = call ptr @strdup(ptr %s)\n", dup, reg);
            return dup;
        }
        return reg;
    }

    public void free(List<String> regs) {
        for (String reg : regs) {
            // only want to free non-variables
            if (!strVarRegs.contains(reg)) {
                dest.format("  call void @free(ptr %s)\n", reg);
            }
        }
    }

    public int newBlock() { return nextBlockNum++; }

    /**
     * @param name name of the variable for future reference
     * @param isStrVar denotes if the variable being stored is a string (needs to be freed at the end)
     * @return the register used to store the variable
     */
    public String getVar(String name, Boolean isStrVar) {
        if(!vars.containsKey(name)) {
            String reg = String.format("%%%s_1", name);
            vars.put(name, new Pair(reg, isStrVar, 1));
            if (isStrVar) {
                strVarRegs.add(reg);
            }
        }
        return vars.get(name).reg();
    }

    public void addRegPtrToVar(String var, String reg) {
        strVarRegs.add(reg); // this is getting alloca'd and does not need freed
    }

    public void reassign(String name) {
        Pair var = vars.get(name);
        String reg = String.format("%%%s_%d", name, var.numAssigned() + 1);
        vars.put(name, new Pair(reg, var.isStrVar(), var.numAssigned() + 1));
    }

    public boolean containsStrVar(String name) {
        return vars.containsKey(name) && vars.get(name).isStrVar();
    }

    public boolean containsBoolVar(String name) {
        return vars.containsKey(name) && !vars.get(name).isStrVar();
    }

    /** Adds a new string to the list of literals.
     * @return The literal name, like @lit1, @lit2, etc.
     */
    public String addStringLit(String str) {
        literals.add(str);
        String litReg = String.format("@lit%d", literals.size());
        litRegs.add(litReg);
        return litReg;
    }

    /** Constructor for the Compiler object given the output ll file. */
    public Compiler(Path destFile) throws IOException {
        dest = new PrintWriter(destFile.toFile());
    }

    /** Performs the complete compilation for the program given by its AST. */
    public void compile(Stmt astRoot) throws IOException {
        // copy contents of preamble.ll in the resources directory
        try (BufferedReader preamble = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream("preamble.ll"))))
        {
            while (true) {
                String line = preamble.readLine();
                if (line == null) break;
                dest.println(line);
            }
            dest.println("declare ptr @strdup(ptr)");
        }

        dest.println("\ndefine i32 @main() {");

        // call the AST root node compile method to fill in
        // the contents of main()
        astRoot.compile(this);

        // free all of the str variables
        for (Pair var : vars.values()) {
            if (var.isStrVar()) {
                String reg = nextRegister();
                dest.format("  %s = load ptr, ptr %s\n", reg, var.reg());
                dest.format("  call void @free(ptr %s)\n", reg);
                // dest.format(" call void @free(ptr %s)\n", var.reg());
                // don't think I need to do since I alloca the ptr
            }
        }

        dest.println("  ret i32 0");
        dest.println("}");

        // output the string literal definitions
        int litNum = 0;
        for (String str : literals) {
            dest.format("@lit%d = constant [%d x i8] c\"", ++litNum, str.length()+1);
            for (int i = 0; i < str.length(); ++i) {
                char c = str.charAt(i);
                int cval = (int)c;
                if (c != '"' && c != '\\' && cval >= 0x20 && cval <= 0x7e)
                    dest.print(c);
                else
                    dest.format("\\%02X", cval);
            }
            dest.println("\\00\"");
        }

        dest.close();
    }

    /** Calls the Tokenizer to extract tokens from the source text file. */
    public static TokenStream getTokens(Path sourceFile) throws IOException {
        return new Tokenizer(
            Interpreter.class.getResourceAsStream("tokenSpec.txt"),
            ParseRules.VOCABULARY
        ).streamFrom(sourceFile);
    }

    /** Calls the ANTLR-generated parser to form the tokens into a parse tree. */
    public static ParseRules.ProgContext parse(TokenStream tokens) {
        ParseRules parser = new ParseRules(tokens);
        Errors.register(parser);
        return parser.prog();
    }

    /** Does scanning, parsing, AST generation, and finally code generation. */
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            Errors.error("need 2 command-line arg: source file and output file");
        }
        Path sourceFile = Path.of(args[0]);
        TokenStream tokens = getTokens(sourceFile);
        ParseRules.ProgContext ptreeRoot = parse(tokens);
        Stmt astRoot = ASTGen.gen(ptreeRoot);
        new Compiler(Path.of(args[1])).compile(astRoot);
    }
}
