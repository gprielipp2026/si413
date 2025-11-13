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
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParseRules.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Display}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(ParseRules.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Store}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore(ParseRules.StoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfOnly}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfOnly(ParseRules.IfOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(ParseRules.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ParseRules.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(ParseRules.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(ParseRules.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiStmts}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStmts(ParseRules.MultiStmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoStmts}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoStmts(ParseRules.NoStmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ManyParams}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyParams(ParseRules.ManyParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneParam(ParseRules.OneParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoParams}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoParams(ParseRules.NoParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ParseRules.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Reverse}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse(ParseRules.ReverseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ParseRules.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(ParseRules.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(ParseRules.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ParseRules.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AskString}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAskString(ParseRules.AskStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AskBool}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAskBool(ParseRules.AskBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ParseRules.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Contains}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains(ParseRules.ContainsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(ParseRules.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(ParseRules.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(ParseRules.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(ParseRules.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLit(ParseRules.StrLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ManyArgs}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyArgs(ParseRules.ManyArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneArg(ParseRules.OneArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoArgs}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoArgs(ParseRules.NoArgsContext ctx);
}