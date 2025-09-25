package si413;

import java.nio.file.Path;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

public class Compiler {
    /**
     * helper methods that output the desired code
     */

    private Boolean isstr(String reg) {
        return reg.contains("str") || reg.contains("lit");
    }

    private Boolean isbool(String reg) {
        return reg.contains("bool");
    }

    private String revstr(String reg) {
        String res = addReg("str");

        dest.println( String.format("\t%s = call ptr @reverse_string(ptr %s)", res, reg) );

        return res;
    }

    private String not(String reg) {
        String res = addReg("bool");

        dest.println( String.format("\t%s = call i1 @not(i1 %s)", res, reg) );

        return res;
    }

    private String or(String reg1, String reg2) {
        String res = addReg("bool");

        dest.println( String.format("\t%s = or i1 %s, %s", res, reg1, reg2) );

        return res;
    }

    private String and(String reg1, String reg2) {
        String res = addReg("bool");

        dest.println( String.format("\t%s = and i1 %s, %s", res, reg1, reg2) );

        return res;
    }

    private String input() {
        String reg = addReg("str");

        dest.println( String.format("\t%s = call ptr @getinput()", reg) );

        return reg;
    }

    private String addStrLit(String lit) { 
        int size = strlits.size();
        strlits.add(lit);
        return String.format("@lit%d", size);
    }

    private String addBool(Boolean val) {
        String reg = addReg("bool");

        dest.println( String.format("\t%s = add i1 %d, 0", reg, (val ? 1:0)) );

        return reg;
    }

    private String addReg() {
        return String.format("%%reg%d", numregs++);
    }

    private String addReg(String type) {
        return String.format("%%%s%d", type, numregs++);
    }

    
    private String strLT(String reg1, String reg2) {
        String reg = addReg("bool");
        
        dest.println( String.format("\t%s = call i1 @str_lt(ptr %s, ptr %s)", reg, reg1, reg2) );
        
        return reg;
    }
    
    
    private String strGT(String reg1, String reg2) {
        String reg = addReg("bool");

        dest.println( String.format("\t%s = call i1 @str_gt(ptr %s, ptr %s)", reg, reg1, reg2) );

        return reg;
    }

    private String substr(String reg1, String reg2) {
        String reg = addReg("bool");

        dest.println( String.format("\t%s = call i1 @substr(ptr %s, ptr %s)", reg, reg1, reg2) );

        return reg;
    }

    private String concat(String reg1, String reg2) {
        String reg = addReg("str");

        dest.println( String.format("\t%s = call ptr @concat(ptr %s, ptr %s)", reg, reg1, reg2) );

        return reg;
    }

    private void print(String reg) {
        if(isstr(reg))
            dest.println( String.format("\tcall i32 @puts(ptr %s)", reg) );
        else if(isbool(reg)) {
            String str = addReg("str");
            dest.println( String.format("\t%s = call ptr @bool_to_str(i1 %s)", str, reg) );
            print(str);
        }
    }

    private class StmtVisitor extends ParseRulesBaseVisitor<Void> {
        @Override
        public Void visitRegularProg(ParseRules.RegularProgContext ctx) {
            visit(ctx.stat());
            visit(ctx.prog());
            return null;
        }

        @Override
        public Void visitPrintStmt(ParseRules.PrintStmtContext ctx) {
            String register = evisitor.visit(ctx.expr());

            print(register);

            return null;
        }

        @Override
        public Void visitAssignStmt(ParseRules.AssignStmtContext ctx) {
            String id = ctx.ID().getText();
            String reg = evisitor.visit(ctx.expr());

            varmap.put(id, reg);

            return null;
        }
    }

    private class ExprVisitor extends ParseRulesBaseVisitor<String> {
        @Override
        public String visitLitExpr(ParseRules.LitExprContext ctx) {
            String lit = ctx.LIT().getText();

            // have to extract the string literal
            // find all special characters
            Matcher matcher = Pattern.compile("(\\$[\\[\\]])").matcher(lit);

            String result = "";
            int ind = 1; // remove the first '['

            // removing the escape sequence for the special characters
            while(matcher.find()) {
                MatchResult match = matcher.toMatchResult();
                int startind = match.start();
                int nextind = match.end();
                String seq = match.group(0);
                result += lit.substring(ind, startind) + seq.substring(1);
                ind = nextind;
            }

            // get the last bit of the string
            // remove the last ']'
            result += lit.substring(ind, lit.length()-1);

            String reg = addStrLit(result);

            return reg;
        }

        @Override
        public String visitBoolExpr(ParseRules.BoolExprContext ctx) {
            Boolean val = ctx.BOOL().getText().equals("1");

            return addBool(val);
        }

        /**
         * handle the different types of binary operations
         */
        private String binOpStr(String lhs, String rhs, String op)
        {
            if(op.equals("<")) return strLT(lhs, rhs);
            else if(op.equals(">")) return strGT(lhs, rhs);
            else if(op.equals("?")) return substr(lhs, rhs);
            else if(op.equals("+")) return concat(lhs, rhs);

            Errors.error("String comparison operations do not include '" + op + "'");
            return null;
        }

        private String binOpBool(String lhs, String rhs, String op)
        {
            if(op.equals("&")) return and(lhs, rhs);
            else if(op.equals("|")) return or(lhs, rhs);

            Errors.error("Unknown boolean operation '" + op + "'");
            return null;
        }

        @Override
        public String visitBinaryOpExpr(ParseRules.BinaryOpExprContext ctx) {
            String lhs = visit(ctx.expr(0));
            String rhs = visit(ctx.expr(1));
            String op = ctx.OP().getText();

            // I am "cheating" by putting the types in the register name...
            if (isstr(lhs) && isstr(rhs)) {
                return binOpStr(lhs, rhs, op);
            }
            else if(isbool(lhs) && isbool(rhs)) {
                return binOpBool(lhs, rhs, op);
            }

            Errors.error("Mismatched types when trying to apply '" + lhs + " " + op + " " + rhs + "' on line: " + ctx.getStart().getLine());
            return null;
        }

        @Override
        public String visitInputExpr(ParseRules.InputExprContext ctx) {
            return input();
        }

        @Override
        public String visitRevExpr(ParseRules.RevExprContext ctx) {
            String reg = visit(ctx.expr());

            if( isstr(reg) ) {
                return revstr(reg);
            }
            else if(isbool(reg)) {
                return not(reg);
            }

            return "ERROR revexpr";
        }

        @Override
        public String visitVarExpr(ParseRules.VarExprContext ctx) {
            String id = ctx.ID().getText();
            if(varmap.containsKey(id)) {
                return varmap.get(id);
            }

            Errors.error(id + " has not been declared yet.");

            // it wont hit here
            return null;
        }
    }

    // TODO probably need a few more fields here
    private StmtVisitor svisitor = new StmtVisitor();
    private ExprVisitor evisitor = new ExprVisitor();
    private PrintWriter dest;

    private List<String> strlits = new ArrayList<>();
    private Map<String, String> varmap = new HashMap<>();
    private int numregs = 0;

    public Compiler(Path destFile) throws IOException {
        dest = new PrintWriter(destFile.toFile());
    }

    public void compile(ParseTree ptree) throws IOException {
        // copy contents of preamble.ll in the resources directory
        try (BufferedReader preamble = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream("preamble.ll"))))
        {
            while (true) {
                String line = preamble.readLine();
                if (line == null) break;
                dest.println(line);
            }
        }

        dest.println("\ndefine i32 @main() {");

        // this calls all of your visit methods to walk the parse tree
        // note that the code emitted goes inside main()
        svisitor.visit(ptree);

        dest.println("  ret i32 0");
        dest.println("}\n");

        // TODO you probably want to put the string literal definitions
        // down here. They can't be directly emitted from the visit methods
        // because they have to be outside of main().
        for(int i = 0; i < strlits.size(); i++)
        {
            String lit = strlits.get(i);
            dest.println( String.format("@lit%d = constant [%d x i8] c\"%s\\00\"", i, lit.length() + 1, lit) );
        }

        dest.flush();

        dest.close();
    }

    public static TokenStream getTokens(Path sourceFile) throws IOException {
        return new Tokenizer(
            Compiler.class.getResourceAsStream("tokenSpec.txt"),
            ParseRules.VOCABULARY
        ).streamFrom(sourceFile);
    }

    public static ParseTree parse(TokenStream tokens) throws IOException {
        ParseRules parser = new ParseRules(tokens);
        Errors.register(parser);
        return parser.prog();
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            Errors.error("need 2 command-line args: source_file dest_file");
        }
        Path sourceFile = Path.of(args[0]);
        Path destFile = Path.of(args[1]);

        TokenStream tokens = getTokens(sourceFile);
        ParseTree ptree = parse(tokens);
        new Compiler(destFile).compile(ptree);
    }
}
