package si413;

import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.management.RuntimeErrorException;

import java.util.regex.Matcher;
import org.antlr.v4.runtime.TokenStream;

/** Interpreter for truffle language.
 * The tokens and grammar come from src/main/resource/si413/tokenSpec.txt
 * and src/main/antlr4/si413/ParseRules.g4 respectively.
 */
public class Interpreter {

    /** Methods in this class will execute statements.
     * Return type is Void because statements do not return anything.
     * Note that this is Void and not void, so we still have to return null
     * in each function. (This is a consequence of Java generics.)
     */
    private class StatementVisitor extends ParseRulesBaseVisitor<Void> {
        @Override
        public Void visitRegularProg(ParseRules.RegularProgContext ctx) {
            visit(ctx.stat());
            visit(ctx.prog());
            return null;
        }

        @Override
        public Void visitPrintStmt(ParseRules.PrintStmtContext ctx) {
            Value value = evisitor.visit(ctx.expr());
            System.out.println(value.getValue());
            return null;
        }

        @Override
        public Void visitAssignStmt(ParseRules.AssignStmtContext ctx) {
            String id = ctx.ID().getText();
            Value value = evisitor.visit(ctx.expr());
            varMap.put(id, value);
            return null;
        }
    }

    /** Methods in this class will execute expressions and return the result.
     */
    private class ExpressionVisitor extends ParseRulesBaseVisitor<Value> {
        @Override
        public Value visitLitExpr(ParseRules.LitExprContext ctx) {
            String lit = ctx.LIT().getText();

            // have to extract the string literal
            Matcher matcher = Pattern.compile("([^\\[\\]\\$])+|(\\$\\[|\\$\\]|\\$\\$)").matcher(lit);

            while(matcher.find()) {
                for(int i = 0; i < matcher.groupCount(); i++)
                {
                    System.out.println(String.format("%d %s", i, matcher.group(i)));
                }
                System.out.println();
            }

            return new StrValue( "placeholder" );
        }

        @Override
        public Value visitBoolExpr(ParseRules.BoolExprContext ctx) {
            return new BoolValue( ctx.BOOL().getText().equals("1") );
        }

        /**
         * handle the different types of binary operations
         */
        private Value binOpStr(Value lhs, Value rhs, String op)
        {
            if(op.equals("<")) {
                String left = lhs.getValue().toString();
                String right = rhs.getValue().toString();
                return new BoolValue(left.length() < right.length());
            }
            else if(op.equals(">"))
            {
                String left = lhs.getValue().toString();
                String right = rhs.getValue().toString();
                return new BoolValue(right.contains(left));
            }
            else if(op.equals("?"))
            {
                String left = lhs.getValue().toString();
                String right = rhs.getValue().toString();
                return new BoolValue(left.length() > right.length());
            }
            else if(op.equals("+"))
            {
                String left = lhs.getValue().toString();
                String right = rhs.getValue().toString();
                return new StrValue(left + right);
            }

            throw new RuntimeException("String comparison operations do not include '" + op + "'");
        }

        private BoolValue binOpBool(Value lhs, Value rhs, String op)
        {
            if(op.equals("&")) {
                boolean left = lhs.getValue().toString().equals("true") ? true:false; // should only ever be 0, or 1 in the lhs
                boolean right = rhs.getValue().toString().equals("true") ? true:false; // should only ever be 0, or 1 in the rhs
                return new BoolValue(left && right);
            }
            else if(op.equals("|"))
            {
                boolean left = lhs.getValue().toString().equals("true") ? true:false; // should only ever be 0, or 1 in the lhs
                boolean right = rhs.getValue().toString().equals("true") ? true:false; // should only ever be 0, or 1 in the rhs
                return new BoolValue(left || right);
            }

            throw new RuntimeException("Boolean logic operations do not include '" + op + "'");
        }

        @Override
        public Value visitBinaryOpExpr(ParseRules.BinaryOpExprContext ctx) {
            Value lhs = visit(ctx.expr(0));
            Value rhs = visit(ctx.expr(1));
            String op = ctx.OP().getText();

            // check types:
            if(lhs.getType() != rhs.getType()) throw new RuntimeException("Trying to perform an operation on two different types");
            else if(lhs.getType() == Value.Type.string) return binOpStr(lhs, rhs, op);
            else if(lhs.getType() == Value.Type.bool) return binOpBool(lhs, rhs, op);

            return null;
        }

        @Override
        public Value visitInputExpr(ParseRules.InputExprContext ctx) {
            String userInput = input.nextLine();

            return new StrValue(userInput);
        }

        @Override
        public Value visitRevStrExpr(ParseRules.RevStrExprContext ctx) {
            Value value = visit(ctx.expr());

            if(value.getType() != Value.Type.string) {
                throw new RuntimeException("Expected a string, instead got a " + value.getType().toString());
            }

            String rev = new StringBuilder(value.getValue().toString()).reverse().toString();
            
            return new StrValue(rev);
        }

        @Override
        public Value visitVarExpr(ParseRules.VarExprContext ctx) {
            String id = ctx.ID().getText();
            if(varMap.containsKey(id)) {
                return varMap.get(id);
            }

            throw new RuntimeException(id + " has not been declared yet.");
        }
    }

    private StatementVisitor svisitor = new StatementVisitor();
    private ExpressionVisitor evisitor = new ExpressionVisitor();
    private Tokenizer tokenizer;

    private Scanner input = new Scanner(System.in);
    private Map<String, Value> varMap = new HashMap<>();

    public Interpreter() throws IOException {
        this.tokenizer = new Tokenizer(
            getClass().getResourceAsStream("tokenSpec.txt"),
            ParseRules.VOCABULARY
        );
    }

    public ParseRules.ProgContext parse(Path sourceFile) throws IOException {
        TokenStream tokenStream = tokenizer.streamFrom(sourceFile);
        ParseRules parser = new ParseRules(tokenStream);
        Errors.register(parser);
        return parser.prog();
    }

    public void execute(ParseRules.ProgContext parseTree) {
        // to execute the whole program, we just call visit() on the  root
        // node of the parse tree!
        svisitor.visit(parseTree);
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("ERROR: need 1 command-line arg, input source file");
            System.exit(1);
        }
        Path sourceFile = Path.of(args[0]);
        Interpreter interp = new Interpreter();
        ParseRules.ProgContext parseTree = interp.parse(sourceFile);
        interp.execute(parseTree);
    }
}
