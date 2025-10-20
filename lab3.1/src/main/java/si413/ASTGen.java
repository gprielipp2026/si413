package si413;

import java.util.List;
import java.util.ArrayList;

/** This class is used to create the AST from a parse tree.
 * The static method ASTGen.gen(parseTree) is the specific function
 * to perform that conversion.
 */
public class ASTGen {
    /** Turns a parse tree Prog node into a complete AST.
     * This is the main external interface for the ASTGen class.
     */
    public static Stmt.Block gen(ParseRules.ProgContext ptreeRoot) {
        return new ASTGen().progVis.visit(ptreeRoot);
    }


    private class ProgVisitor extends Visitor<Stmt.Block> {
        @Override
        public Stmt.Block visitRegularProg(ParseRules.RegularProgContext ctx) {
            // recursively call visit to get the first statement and block for the rest
            Stmt first = stmtVis.visit(ctx.stmt());
            Stmt.Block rest = visit(ctx.prog());
            // combine those into a single block AST node
            List<Stmt> children = new ArrayList<>();
            children.add(first);
            children.addAll(rest.children());
            return new Stmt.Block(children);
        }

        @Override
        public Stmt.Block visitContextProg(ParseRules.ContextProgContext ctx) {
            Stmt.Block rest = visit(ctx.prog());
            List<Stmt> children = new ArrayList<>();
            children.addAll(rest.children());
            return new Stmt.Block(children);
        }

        @Override
        public Stmt.Block visitEmptyProg(ParseRules.EmptyProgContext ctx) {
            return new Stmt.Block(List.of());
        }
    }


    private class StmtVisitor extends Visitor<Stmt> {
        @Override
        public Stmt visitStringPrint(ParseRules.StringPrintContext ctx) {
            Expr<String> child = strExprVis.visit(ctx.strExpr());
            return new Stmt.PrintString(child);
        }

        @Override
        public Stmt visitBoolPrint(ParseRules.BoolPrintContext ctx) {
            Expr<Boolean> child = boolExprVis.visit(ctx.boolExpr());
            return new Stmt.PrintBool(child);
        }

        @Override
        public Stmt visitBoolAssignStmt(ParseRules.BoolAssignStmtContext ctx) {
            String id = ctx.ID().getText();
            Expr<Boolean> val = boolExprVis.visit(ctx.boolExpr());
            return new Stmt.AssignBool(id, val);
        }

        @Override
        public Stmt visitStringAssignStmt(ParseRules.StringAssignStmtContext ctx) {
            String id = ctx.ID().getText();
            Expr<String> val = strExprVis.visit(ctx.strExpr());
            return new Stmt.AssignString(id, val);
        }

        @Override
        public Stmt visitIfStmt(ParseRules.IfStmtContext ctx) {
            Expr<Boolean> condition = boolExprVis.visit(ctx.boolExpr());
            Stmt ifBody = progVis.visit(ctx.prog());
            Stmt elseBody = new Stmt.Block(null);
            return new Stmt.IfElse(condition, ifBody, elseBody);
        }

        @Override
        public Stmt visitIfElseStmt(ParseRules.IfElseStmtContext ctx) {
            Expr<Boolean> condition = boolExprVis.visit(ctx.boolExpr());
            Stmt ifBody = progVis.visit(ctx.prog(0));
            Stmt elseBody = progVis.visit(ctx.prog(1));
            return new Stmt.IfElse(condition, ifBody, elseBody);
        }

        @Override
        public Stmt visitWhileStmt(ParseRules.WhileStmtContext ctx) {
            Expr<Boolean> condition = boolExprVis.visit(ctx.boolExpr());
            Stmt body = progVis.visit(ctx.prog());
            return new Stmt.While(condition, body);
        }
    }


    private class StringExprVisitor extends Visitor<Expr<String>> {
        @Override
        public Expr<String> visitStringLitExpr(ParseRules.StringLitExprContext ctx) {
            // extract the actual string literal without escapes
            StringBuilder sb = new StringBuilder();
            String raw = ctx.LIT().getText();
            for (int i = 1; i < raw.length()-1; ++i) {
                if (raw.charAt(i) == '\\') ++i;
                sb.append(raw.charAt(i));
            }
            return new Expr.StringLit(sb.toString());
        }

        @Override
        public Expr<String> visitStringVar(ParseRules.StringVarContext ctx) {
            String id = ctx.ID().getText();
            return new Expr.StrVar(id);
        }

        @Override
        public Expr<String> visitStringBinOpExpr(ParseRules.StringBinOpExprContext ctx) {
            Expr<String> lhs = visit(ctx.strExpr(0));
            Expr<String> rhs = visit(ctx.strExpr(1));
            String op = ctx.STROP().getText();

            if(op.equals("+"))
                return new Expr.Concat(lhs, rhs);
            else 
                Errors.error("Cannot do string " + op + " string.");
            return null;
        }

        @Override
        public Expr<String> visitInputExpr(ParseRules.InputExprContext ctx) {
            return new Expr.Input();
        }

        @Override
        public Expr<String> visitRevStrExpr(ParseRules.RevStrExprContext ctx) {
            return new Expr.Reverse(visit(ctx.strExpr()));
        }

        @Override
        public Expr<String> visitReorderStrExpr(ParseRules.ReorderStrExprContext ctx) {
            return visit(ctx.strExpr());
        }
    }


    private class BoolExprVisitor extends Visitor<Expr<Boolean>> {
        @Override
        public Expr<Boolean> visitBoolLitExpr(ParseRules.BoolLitExprContext ctx) {
            return new Expr.BoolLit(ctx.BOOL().getText().equals("1"));
        }

        @Override
        public Expr<Boolean> visitBoolVar(ParseRules.BoolVarContext ctx) {
            String id = ctx.ID().getText();
            return new Expr.BoolVar(id);
        }

        @Override
        public Expr<Boolean> visitBoolBinOpExpr(ParseRules.BoolBinOpExprContext ctx) {
            Expr<Boolean> lhs = visit(ctx.boolExpr(0));
            Expr<Boolean> rhs = visit(ctx.boolExpr(1));

            String op = ctx.OP().getText();

            if(op.equals("&")) return new Expr.And(lhs, rhs);
            else if (op.equals("|")) return new Expr.Or(lhs, rhs);
            else Errors.error("Cannot do bool " + op + " bool.");
            return null;
        }

        @Override
        public Expr<Boolean> visitStringCompareExpr(ParseRules.StringCompareExprContext ctx) {
            Expr<String> lhs = strExprVis.visit(ctx.strExpr(0));
            Expr<String> rhs = strExprVis.visit(ctx.strExpr(1));

            String op = ctx.OP().getText();

            if(op.equals("<")) return new Expr.StrLess(lhs, rhs);
            else if (op.equals(">")) return new Expr.StrLess(rhs, lhs);
            else if (op.equals(":")) return new Expr.Contains(lhs, rhs);
            else Errors.error("Cannot do bool " + op + " bool.");
            return null;
        }

        @Override
        public Expr<Boolean> visitBoolNotExpr(ParseRules.BoolNotExprContext ctx) {
            Expr<Boolean> child = visit(ctx.boolExpr());
            return new Expr.Not(child);
        }

        @Override
        public Expr<Boolean> visitReorderBoolExpr(ParseRules.ReorderBoolExprContext ctx) {
            return visit(ctx.boolExpr());
        }
    }


    private ProgVisitor progVis = new ProgVisitor();
    private StmtVisitor stmtVis = new StmtVisitor();
    private StringExprVisitor strExprVis = new StringExprVisitor();
    private BoolExprVisitor boolExprVis = new BoolExprVisitor();


    /** Use this as the subclass for the visitor classes.
     * It overrides the default method to alert you if one of the
     * visit methods is missing.
     */
    private static class Visitor<T> extends ParseRulesBaseVisitor<T> {
        // This overrides the default behavior to alert if a visit method is missing.
        @Override
        public T visitChildren(org.antlr.v4.runtime.tree.RuleNode node) {
            return Errors.error(String.format(
                "class %s has no visit method for %s",
                getClass().getSimpleName(),
                node.getClass().getSimpleName()));
        }
    }
}
