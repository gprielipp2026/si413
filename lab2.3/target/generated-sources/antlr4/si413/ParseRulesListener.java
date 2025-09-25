// Generated from si413/ParseRules.g4 by ANTLR 4.13.1
package si413;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParseRules}.
 */
public interface ParseRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code RegularProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void enterRegularProg(ParseRules.RegularProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void exitRegularProg(ParseRules.RegularProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void enterEmptyProg(ParseRules.EmptyProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void exitEmptyProg(ParseRules.EmptyProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link ParseRules#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(ParseRules.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link ParseRules#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(ParseRules.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link ParseRules#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(ParseRules.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link ParseRules#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(ParseRules.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RevExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterRevExpr(ParseRules.RevExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RevExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitRevExpr(ParseRules.RevExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(ParseRules.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(ParseRules.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LitExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterLitExpr(ParseRules.LitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LitExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitLitExpr(ParseRules.LitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterInputExpr(ParseRules.InputExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitInputExpr(ParseRules.InputExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(ParseRules.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(ParseRules.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOpExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOpExpr(ParseRules.BinaryOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOpExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOpExpr(ParseRules.BinaryOpExprContext ctx);
}