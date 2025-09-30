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
	 * Visit a parse tree produced by {@link ArtParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(ArtParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArtParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(ArtParser.ForloopContext ctx);
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