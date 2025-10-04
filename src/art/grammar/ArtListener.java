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
	 * Enter a parse tree produced by {@link ArtParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(ArtParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(ArtParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ArtParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ArtParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(ArtParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(ArtParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(ArtParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(ArtParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#mt}.
	 * @param ctx the parse tree
	 */
	void enterMt(ArtParser.MtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#mt}.
	 * @param ctx the parse tree
	 */
	void exitMt(ArtParser.MtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(ArtParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(ArtParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArtParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(ArtParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArtParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(ArtParser.SuiteContext ctx);
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