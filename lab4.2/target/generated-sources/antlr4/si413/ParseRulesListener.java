// Generated from si413/ParseRules.g4 by ANTLR 4.13.1
package si413;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParseRules}.
 */
public interface ParseRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParseRules.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParseRules.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Display}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(ParseRules.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Display}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(ParseRules.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Store}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStore(ParseRules.StoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Store}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStore(ParseRules.StoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfOnly}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfOnly(ParseRules.IfOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfOnly}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfOnly(ParseRules.IfOnlyContext ctx);
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
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ParseRules.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ParseRules.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(ParseRules.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(ParseRules.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(ParseRules.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(ParseRules.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiStmts}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterMultiStmts(ParseRules.MultiStmtsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiStmts}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitMultiStmts(ParseRules.MultiStmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoStmts}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterNoStmts(ParseRules.NoStmtsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoStmts}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitNoStmts(ParseRules.NoStmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ManyParams}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void enterManyParams(ParseRules.ManyParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ManyParams}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void exitManyParams(ParseRules.ManyParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void enterOneParam(ParseRules.OneParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void exitOneParam(ParseRules.OneParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoParams}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void enterNoParams(ParseRules.NoParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoParams}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void exitNoParams(ParseRules.NoParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(ParseRules.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(ParseRules.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Reverse}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterReverse(ParseRules.ReverseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reverse}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitReverse(ParseRules.ReverseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(ParseRules.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(ParseRules.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterConcat(ParseRules.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitConcat(ParseRules.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(ParseRules.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(ParseRules.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(ParseRules.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(ParseRules.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AskString}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterAskString(ParseRules.AskStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AskString}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitAskString(ParseRules.AskStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AskBool}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterAskBool(ParseRules.AskBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AskBool}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitAskBool(ParseRules.AskBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ParseRules.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ParseRules.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Contains}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterContains(ParseRules.ContainsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Contains}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitContains(ParseRules.ContainsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreater(ParseRules.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreater(ParseRules.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ParseRules.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ParseRules.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(ParseRules.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(ParseRules.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Less}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterLess(ParseRules.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitLess(ParseRules.LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void enterStrLit(ParseRules.StrLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 */
	void exitStrLit(ParseRules.StrLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ManyArgs}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void enterManyArgs(ParseRules.ManyArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ManyArgs}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void exitManyArgs(ParseRules.ManyArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void enterOneArg(ParseRules.OneArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void exitOneArg(ParseRules.OneArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoArgs}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void enterNoArgs(ParseRules.NoArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoArgs}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void exitNoArgs(ParseRules.NoArgsContext ctx);
}