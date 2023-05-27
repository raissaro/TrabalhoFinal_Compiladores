// Generated from MinhaGramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinhaGramaticaParser}.
 */
public interface MinhaGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MinhaGramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MinhaGramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(MinhaGramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(MinhaGramaticaParser.ExpressaoContext ctx);
}