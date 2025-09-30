// Generated from /Users/jabonfoca/Downloads/antlr-projekt/src/art/grammar/Art.g4 by ANTLR 4.13.2
package art.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArtParser}.
 */
public interface ArtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArtParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ArtParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ArtParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ArtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ArtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ArtParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ArtParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ArtParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ArtParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(ArtParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(ArtParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(ArtParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(ArtParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ArtParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ArtParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ArtParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ArtParser.ExprContext ctx);
}