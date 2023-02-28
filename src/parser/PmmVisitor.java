// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#listaDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDef(PmmParser.ListaDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#defVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVar(PmmParser.DefVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#identificadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificadores(PmmParser.IdentificadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#defFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunc(PmmParser.DefFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#defParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefParams(PmmParser.DefParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#defParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefParam(PmmParser.DefParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#cuerpoFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoFun(PmmParser.CuerpoFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#listaDefVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDefVar(PmmParser.ListaDefVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PmmParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#sympleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSympleType(PmmParser.SympleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#listaDimensiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDimensiones(PmmParser.ListaDimensionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(PmmParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statementsNoOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementsNoOpt(PmmParser.StatementsNoOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#listaExpComas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpComas(PmmParser.ListaExpComasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
}