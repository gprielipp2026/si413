// Generated from si413/ParseRules.g4 by ANTLR 4.13.1
package si413;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParseRules}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParseRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code RegularProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularProg(ParseRules.RegularProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContextProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextProg(ParseRules.ContextProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyProg(ParseRules.EmptyProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolPrint}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolPrint(ParseRules.BoolPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrint}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrint(ParseRules.StringPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAssignStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssignStmt(ParseRules.BoolAssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAssignStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignStmt(ParseRules.StringAssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ParseRules.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElseStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(ParseRules.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(ParseRules.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReorderStrExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReorderStrExpr(ParseRules.ReorderStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpr(ParseRules.InputExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLitExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLitExpr(ParseRules.StringLitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RevStrExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevStrExpr(ParseRules.RevStrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringBinOpExpr}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringBinOpExpr(ParseRules.StringBinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link ParseRules#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVar(ParseRules.StringVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLitExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLitExpr(ParseRules.BoolLitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReorderBoolExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReorderBoolExpr(ParseRules.ReorderBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolNotExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNotExpr(ParseRules.BoolNotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringCompareExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCompareExpr(ParseRules.StringCompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolBinOpExpr}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBinOpExpr(ParseRules.BoolBinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link ParseRules#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(ParseRules.BoolVarContext ctx);
}