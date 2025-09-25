// Generated from /home/johan/Dokument/MAU/Kurser/Systemprogramvara/2022/Inlämningsuppgifter/2/antlr-projekt/src/example/grammar/Xpres.g4 by ANTLR 4.10.1
package example.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XpresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XpresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XpresParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(XpresParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XpresParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(XpresParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XpresParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(XpresParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link XpresParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(XpresParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link XpresParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(XpresParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link XpresParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(XpresParser.ExprContext ctx);
}