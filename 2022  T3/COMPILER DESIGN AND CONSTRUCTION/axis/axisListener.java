// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link axisParser}.
 */
public interface axisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link axisParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(axisParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(axisParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(axisParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(axisParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(axisParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(axisParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(axisParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(axisParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(axisParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(axisParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(axisParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(axisParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(axisParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(axisParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#funcHeader}.
	 * @param ctx the parse tree
	 */
	void enterFuncHeader(axisParser.FuncHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#funcHeader}.
	 * @param ctx the parse tree
	 */
	void exitFuncHeader(axisParser.FuncHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(axisParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(axisParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link axisParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(axisParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link axisParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(axisParser.ArgContext ctx);
}