// Generated from MinhaGramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinhaGramaticaParser}.
 */
public interface MinhaGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MinhaGramaticaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MinhaGramaticaParser.InicioContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(MinhaGramaticaParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(MinhaGramaticaParser.Chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(MinhaGramaticaParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(MinhaGramaticaParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(MinhaGramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(MinhaGramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(MinhaGramaticaParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(MinhaGramaticaParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MinhaGramaticaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MinhaGramaticaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(MinhaGramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(MinhaGramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(MinhaGramaticaParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(MinhaGramaticaParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(MinhaGramaticaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(MinhaGramaticaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#t_if}.
	 * @param ctx the parse tree
	 */
	void enterT_if(MinhaGramaticaParser.T_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#t_if}.
	 * @param ctx the parse tree
	 */
	void exitT_if(MinhaGramaticaParser.T_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#t_else}.
	 * @param ctx the parse tree
	 */
	void enterT_else(MinhaGramaticaParser.T_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#t_else}.
	 * @param ctx the parse tree
	 */
	void exitT_else(MinhaGramaticaParser.T_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#t_elseif}.
	 * @param ctx the parse tree
	 */
	void enterT_elseif(MinhaGramaticaParser.T_elseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#t_elseif}.
	 * @param ctx the parse tree
	 */
	void exitT_elseif(MinhaGramaticaParser.T_elseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#t_for}.
	 * @param ctx the parse tree
	 */
	void enterT_for(MinhaGramaticaParser.T_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#t_for}.
	 * @param ctx the parse tree
	 */
	void exitT_for(MinhaGramaticaParser.T_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#t_while}.
	 * @param ctx the parse tree
	 */
	void enterT_while(MinhaGramaticaParser.T_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#t_while}.
	 * @param ctx the parse tree
	 */
	void exitT_while(MinhaGramaticaParser.T_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#t_return}.
	 * @param ctx the parse tree
	 */
	void enterT_return(MinhaGramaticaParser.T_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#t_return}.
	 * @param ctx the parse tree
	 */
	void exitT_return(MinhaGramaticaParser.T_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MinhaGramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MinhaGramaticaParser.BlocoContext ctx);
}