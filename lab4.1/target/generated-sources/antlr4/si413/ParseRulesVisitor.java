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
	 * Visit a parse tree produced by the {@code FullProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullProg(ParseRules.FullProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalProg}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalProg(ParseRules.NormalProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyProg}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyProg(ParseRules.EmptyProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVarAssign(ParseRules.BoolVarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrVarAssign(ParseRules.StrVarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVarAssign(ParseRules.FuncVarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolReassign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolReassign(ParseRules.BoolReassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrReassign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrReassign(ParseRules.StrReassignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStr(ParseRules.PrintStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBool(ParseRules.PrintBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(ParseRules.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(ParseRules.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStmt(ParseRules.FunctionCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncParams}
	 * labeled alternative in {@link ParseRules#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(ParseRules.FuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyParamList}
	 * labeled alternative in {@link ParseRules#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyParamList(ParseRules.EmptyParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgList}
	 * labeled alternative in {@link ParseRules#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(ParseRules.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LastArg}
	 * labeled alternative in {@link ParseRules#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastArg(ParseRules.LastArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolParam}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParam(ParseRules.BoolParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrParam}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrParam(ParseRules.StrParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ParseRules#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(ParseRules.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyExprList}
	 * labeled alternative in {@link ParseRules#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyExprList(ParseRules.EmptyExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArgMoreList}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArgMoreList(ParseRules.BoolArgMoreListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrArgMoreList}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrArgMoreList(ParseRules.StrArgMoreListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LastBoolArg}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastBoolArg(ParseRules.LastBoolArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LastStrArg}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastStrArg(ParseRules.LastStrArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FirstOrderCall}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstOrderCall(ParseRules.FirstOrderCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFuncDef(ParseRules.BoolFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrFuncDef(ParseRules.StrFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFuncDef(ParseRules.VoidFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FirstOrderFunc}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstOrderFunc(ParseRules.FirstOrderFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionVarName}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVarName(ParseRules.FunctionVarNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolReorder}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolReorder(ParseRules.BoolReorderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotBoolExpr}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBoolExpr(ParseRules.NotBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolBinOp}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBinOp(ParseRules.BoolBinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrCmp}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrCmp(ParseRules.StrCmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolFuncCall}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFuncCall(ParseRules.BoolFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetBoolVar}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetBoolVar(ParseRules.GetBoolVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ParseRules.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetStrVar}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetStrVar(ParseRules.GetStrVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrBinOp}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrBinOp(ParseRules.StrBinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrFuncCall}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrFuncCall(ParseRules.StrFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrReorder}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrReorder(ParseRules.StrReorderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RevStr}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevStr(ParseRules.RevStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLit(ParseRules.StrLitContext ctx);
}