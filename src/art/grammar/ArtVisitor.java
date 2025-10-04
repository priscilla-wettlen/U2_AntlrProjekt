// Generated from /Users/jabonfoca/Downloads/antlr-projekt/src/art/grammar/Art.g4 by ANTLR 4.13.2
package art.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArtVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArtParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(ArtParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ArtParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ArtParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ArtParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(ArtParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ArtParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(ArtParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(ArtParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#mt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMt(ArtParser.MtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(ArtParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(ArtParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ArtParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ArtParser.ExprContext ctx);
}