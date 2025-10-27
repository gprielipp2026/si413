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
	 * Enter a parse tree produced by the {@code ContextProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void enterContextProg(ParseRules.ContextProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContextProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void exitContextProg(ParseRules.ContextProgContext ctx);
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
	 * Enter a parse tree produced by the {@code EmptyStmtList}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmtList(ParseRules.EmptyStmtListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStmtList}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmtList(ParseRules.EmptyStmtListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolPrint}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolPrint(ParseRules.BoolPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolPrint}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolPrint(ParseRules.BoolPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrint}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStringPrint(ParseRules.StringPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrint}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStringPrint(ParseRules.StringPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAssignStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssignStmt(ParseRules.BoolAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAssignStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssignStmt(ParseRules.BoolAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAssignStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignStmt(ParseRules.StringAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAssignStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignStmt(ParseRules.StringAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(ParseRules.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(ParseRules.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(ParseRules.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(ParseRules.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReorderStrExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterReorderStrExpr(ParseRules.ReorderStrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReorderStrExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitReorderStrExpr(ParseRules.ReorderStrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterInputExpr(ParseRules.InputExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitInputExpr(ParseRules.InputExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLitExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringLitExpr(ParseRules.StringLitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLitExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringLitExpr(ParseRules.StringLitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RevStrExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterRevStrExpr(ParseRules.RevStrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RevStrExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitRevStrExpr(ParseRules.RevStrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringBinOpExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringBinOpExpr(ParseRules.StringBinOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringBinOpExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringBinOpExpr(ParseRules.StringBinOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringVar(ParseRules.StringVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringVar(ParseRules.StringVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLitExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLitExpr(ParseRules.BoolLitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLitExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLitExpr(ParseRules.BoolLitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReorderBoolExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterReorderBoolExpr(ParseRules.ReorderBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReorderBoolExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitReorderBoolExpr(ParseRules.ReorderBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolNotExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolNotExpr(ParseRules.BoolNotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolNotExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolNotExpr(ParseRules.BoolNotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringCompareExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringCompareExpr(ParseRules.StringCompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringCompareExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringCompareExpr(ParseRules.StringCompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolBinOpExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolBinOpExpr(ParseRules.BoolBinOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolBinOpExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolBinOpExpr(ParseRules.BoolBinOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(ParseRules.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(ParseRules.BoolVarContext ctx);
}