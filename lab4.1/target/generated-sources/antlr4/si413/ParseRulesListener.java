// Generated from si413/ParseRules.g4 by ANTLR 4.13.1
package si413;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParseRules}.
 */
public interface ParseRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NormalProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void enterNormalProg(ParseRules.NormalProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void exitNormalProg(ParseRules.NormalProgContext ctx);
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
	 * Enter a parse tree produced by the {@code BoolVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolVarAssign(ParseRules.BoolVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolVarAssign(ParseRules.BoolVarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStrVarAssign(ParseRules.StrVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStrVarAssign(ParseRules.StrVarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncVarAssign(ParseRules.FuncVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncVarAssign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncVarAssign(ParseRules.FuncVarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolReassign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolReassign(ParseRules.BoolReassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolReassign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolReassign(ParseRules.BoolReassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrReassign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStrReassign(ParseRules.StrReassignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrReassign}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStrReassign(ParseRules.StrReassignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStr(ParseRules.PrintStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStr(ParseRules.PrintStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintBool(ParseRules.PrintBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintBool(ParseRules.PrintBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ParseRules.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ParseRules.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(ParseRules.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(ParseRules.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnBool(ParseRules.ReturnBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnBool(ParseRules.ReturnBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStr(ParseRules.ReturnStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStr(ParseRules.ReturnStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncParams}
	 * labeled alternative in {@link ParseRules#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFuncParams(ParseRules.FuncParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncParams}
	 * labeled alternative in {@link ParseRules#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFuncParams(ParseRules.FuncParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyParamList}
	 * labeled alternative in {@link ParseRules#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterEmptyParamList(ParseRules.EmptyParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyParamList}
	 * labeled alternative in {@link ParseRules#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitEmptyParamList(ParseRules.EmptyParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgList}
	 * labeled alternative in {@link ParseRules#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArgList(ParseRules.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgList}
	 * labeled alternative in {@link ParseRules#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArgList(ParseRules.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LastArg}
	 * labeled alternative in {@link ParseRules#arglist}.
	 * @param ctx the parse tree
	 */
	void enterLastArg(ParseRules.LastArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LastArg}
	 * labeled alternative in {@link ParseRules#arglist}.
	 * @param ctx the parse tree
	 */
	void exitLastArg(ParseRules.LastArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolParam}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void enterBoolParam(ParseRules.BoolParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolParam}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void exitBoolParam(ParseRules.BoolParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrParam}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void enterStrParam(ParseRules.StrParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrParam}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void exitStrParam(ParseRules.StrParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ParseRules#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprList(ParseRules.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ParseRules#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprList(ParseRules.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyExprList}
	 * labeled alternative in {@link ParseRules#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterEmptyExprList(ParseRules.EmptyExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyExprList}
	 * labeled alternative in {@link ParseRules#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitEmptyExprList(ParseRules.EmptyExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArgMoreList}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 */
	void enterBoolArgMoreList(ParseRules.BoolArgMoreListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArgMoreList}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 */
	void exitBoolArgMoreList(ParseRules.BoolArgMoreListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrArgMoreList}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 */
	void enterStrArgMoreList(ParseRules.StrArgMoreListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrArgMoreList}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 */
	void exitStrArgMoreList(ParseRules.StrArgMoreListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LastBoolArg}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 */
	void enterLastBoolArg(ParseRules.LastBoolArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LastBoolArg}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 */
	void exitLastBoolArg(ParseRules.LastBoolArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LastStrArg}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 */
	void enterLastStrArg(ParseRules.LastStrArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LastStrArg}
	 * labeled alternative in {@link ParseRules#exprliststuff}.
	 * @param ctx the parse tree
	 */
	void exitLastStrArg(ParseRules.LastStrArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FirstOrderCall}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void enterFirstOrderCall(ParseRules.FirstOrderCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FirstOrderCall}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void exitFirstOrderCall(ParseRules.FirstOrderCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolFuncDef(ParseRules.BoolFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolFuncDef(ParseRules.BoolFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void enterStrFuncDef(ParseRules.StrFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void exitStrFuncDef(ParseRules.StrFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void enterVoidFuncDef(ParseRules.VoidFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidFuncDef}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void exitVoidFuncDef(ParseRules.VoidFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FirstOrderFunc}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void enterFirstOrderFunc(ParseRules.FirstOrderFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FirstOrderFunc}
	 * labeled alternative in {@link ParseRules#funcexpr}.
	 * @param ctx the parse tree
	 */
	void exitFirstOrderFunc(ParseRules.FirstOrderFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolReorder}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolReorder(ParseRules.BoolReorderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolReorder}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolReorder(ParseRules.BoolReorderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolBinOp}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolBinOp(ParseRules.BoolBinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolBinOp}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolBinOp(ParseRules.BoolBinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrCmp}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterStrCmp(ParseRules.StrCmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrCmp}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitStrCmp(ParseRules.StrCmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolFuncCall}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolFuncCall(ParseRules.BoolFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFuncCall}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolFuncCall(ParseRules.BoolFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetBoolVar}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterGetBoolVar(ParseRules.GetBoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetBoolVar}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitGetBoolVar(ParseRules.GetBoolVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void enterInput(ParseRules.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void exitInput(ParseRules.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetStrVar}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void enterGetStrVar(ParseRules.GetStrVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetStrVar}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void exitGetStrVar(ParseRules.GetStrVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrBinOp}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void enterStrBinOp(ParseRules.StrBinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrBinOp}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void exitStrBinOp(ParseRules.StrBinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrFuncCall}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void enterStrFuncCall(ParseRules.StrFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrFuncCall}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void exitStrFuncCall(ParseRules.StrFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrReorder}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void enterStrReorder(ParseRules.StrReorderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrReorder}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void exitStrReorder(ParseRules.StrReorderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RevStr}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void enterRevStr(ParseRules.RevStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RevStr}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void exitRevStr(ParseRules.RevStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void enterStrLit(ParseRules.StrLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#strexpr}.
	 * @param ctx the parse tree
	 */
	void exitStrLit(ParseRules.StrLitContext ctx);
}