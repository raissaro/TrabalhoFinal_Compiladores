// Generated from MinhaGramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, ATRIB=2, QUAT_PT=3, DOIS_PT=4, END=5, PTV=6, ABRE_P=7, FECHA_P=8, 
		READ=9, WRITE=10, FUNCTION=11, IF=12, ELSE=13, ELSEIF=14, FOR=15, WHILE=16, 
		RETURN=17, DEFINE=18, VIRGULA=19, FALSE=20, TRUE=21, HASHTAG=22, MAIN=23, 
		OP_ARIT=24, OP_LOG=25, ID=26, NUM=27, TEXTO=28, WS=29, COMMENT=30, Error=31;
	public static final int
		RULE_inicio = 0, RULE_expressao = 1, RULE_chamada_funcao = 2, RULE_expressao_logica = 3, 
		RULE_declaracao = 4, RULE_define = 5, RULE_function = 6, RULE_atribuicao = 7, 
		RULE_write = 8, RULE_read = 9, RULE_t_if = 10, RULE_t_else = 11, RULE_t_elseif = 12, 
		RULE_t_for = 13, RULE_t_while = 14, RULE_t_return = 15, RULE_bloco = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "expressao", "chamada_funcao", "expressao_logica", "declaracao", 
			"define", "function", "atribuicao", "write", "read", "t_if", "t_else", 
			"t_elseif", "t_for", "t_while", "t_return", "bloco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'->'", "'::'", "':'", "'END'", "';'", "'('", "')'", "'READ'", 
			"'WRITE'", "'FUNCTION'", "'IF'", "'ELSE'", "'ELSEIF'", "'FOR'", "'WHILE'", 
			"'RETURN'", "'DEFINE'", "','", "'FALSE'", "'TRUE'", "'#'", "'MAIN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "ATRIB", "QUAT_PT", "DOIS_PT", "END", "PTV", "ABRE_P", 
			"FECHA_P", "READ", "WRITE", "FUNCTION", "IF", "ELSE", "ELSEIF", "FOR", 
			"WHILE", "RETURN", "DEFINE", "VIRGULA", "FALSE", "TRUE", "HASHTAG", "MAIN", 
			"OP_ARIT", "OP_LOG", "ID", "NUM", "TEXTO", "WS", "COMMENT", "Error"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinhaGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(34);
				atribuicao();
				}
			}

			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				function();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(MinhaGramaticaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MinhaGramaticaParser.NUM, i);
		}
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(MinhaGramaticaParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(MinhaGramaticaParser.OP_ARIT, i);
		}
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode ABRE_P() { return getToken(MinhaGramaticaParser.ABRE_P, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_P() { return getToken(MinhaGramaticaParser.FECHA_P, 0); }
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressao);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					match(OP_ARIT);
					setState(44);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==NUM) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARIT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				expressao_logica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(ABRE_P);
				setState(51);
				expressao();
				setState(52);
				match(FECHA_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				chamada_funcao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_funcaoContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MinhaGramaticaParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode ABRE_P() { return getToken(MinhaGramaticaParser.ABRE_P, 0); }
		public List<TerminalNode> TIPO() { return getTokens(MinhaGramaticaParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(MinhaGramaticaParser.TIPO, i);
		}
		public TerminalNode FECHA_P() { return getToken(MinhaGramaticaParser.FECHA_P, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MinhaGramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MinhaGramaticaParser.VIRGULA, i);
		}
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(FUNCTION);
			setState(58);
			match(ID);
			setState(59);
			match(ABRE_P);
			setState(60);
			match(TIPO);
			setState(61);
			match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(62);
				match(VIRGULA);
				setState(63);
				match(TIPO);
				setState(64);
				match(ID);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(FECHA_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_logicaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public List<TerminalNode> OP_LOG() { return getTokens(MinhaGramaticaParser.OP_LOG); }
		public TerminalNode OP_LOG(int i) {
			return getToken(MinhaGramaticaParser.OP_LOG, i);
		}
		public List<TerminalNode> NUM() { return getTokens(MinhaGramaticaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MinhaGramaticaParser.NUM, i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(MinhaGramaticaParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(MinhaGramaticaParser.OP_ARIT, i);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitExpressao_logica(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressao_logica);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(ID);
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					match(OP_LOG);
					setState(74);
					match(ID);
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_LOG );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(NUM);
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					match(OP_LOG);
					setState(81);
					match(NUM);
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_LOG );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(ID);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87);
					match(OP_LOG);
					setState(88);
					match(NUM);
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_LOG );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(NUM);
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94);
					match(OP_LOG);
					setState(95);
					match(ID);
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_LOG );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(NUM);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					match(OP_ARIT);
					setState(102);
					match(NUM);
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARIT );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(ID);
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					match(OP_ARIT);
					setState(109);
					match(ID);
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARIT );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				match(ID);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					_la = _input.LA(1);
					if ( !(_la==OP_ARIT || _la==OP_LOG) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(116);
					match(NUM);
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARIT || _la==OP_LOG );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(NUM);
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					match(OP_ARIT);
					setState(123);
					match(ID);
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARIT );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MinhaGramaticaParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TIPO);
			setState(131);
			match(ID);
			setState(132);
			match(PTV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(MinhaGramaticaParser.DEFINE, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(MinhaGramaticaParser.ATRIB, 0); }
		public TerminalNode NUM() { return getToken(MinhaGramaticaParser.NUM, 0); }
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DEFINE);
			setState(135);
			match(ID);
			setState(136);
			match(ATRIB);
			setState(137);
			match(NUM);
			setState(138);
			match(PTV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MinhaGramaticaParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode ABRE_P() { return getToken(MinhaGramaticaParser.ABRE_P, 0); }
		public TerminalNode FECHA_P() { return getToken(MinhaGramaticaParser.FECHA_P, 0); }
		public List<TerminalNode> TIPO() { return getTokens(MinhaGramaticaParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(MinhaGramaticaParser.TIPO, i);
		}
		public TerminalNode DOIS_PT() { return getToken(MinhaGramaticaParser.DOIS_PT, 0); }
		public TerminalNode END() { return getToken(MinhaGramaticaParser.END, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MinhaGramaticaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MinhaGramaticaParser.VIRGULA, i);
		}
		public TerminalNode MAIN() { return getToken(MinhaGramaticaParser.MAIN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(FUNCTION);
				setState(141);
				match(ID);
				setState(142);
				match(ABRE_P);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO) {
					{
					setState(143);
					match(TIPO);
					setState(144);
					match(ID);
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(145);
						match(VIRGULA);
						setState(146);
						match(TIPO);
						setState(147);
						match(ID);
						}
						}
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(155);
				match(FECHA_P);
				setState(156);
				match(TIPO);
				setState(157);
				match(DOIS_PT);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(158);
					bloco();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(FUNCTION);
				setState(166);
				match(MAIN);
				setState(167);
				match(ABRE_P);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO) {
					{
					setState(168);
					match(TIPO);
					setState(169);
					match(ID);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(170);
						match(VIRGULA);
						setState(171);
						match(TIPO);
						setState(172);
						match(ID);
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(180);
				match(FECHA_P);
				setState(181);
				match(TIPO);
				setState(182);
				match(DOIS_PT);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(183);
					bloco();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode ATRIB() { return getToken(MinhaGramaticaParser.ATRIB, 0); }
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode NUM() { return getToken(MinhaGramaticaParser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(MinhaGramaticaParser.TEXTO, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atribuicao);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(ID);
				setState(193);
				match(ATRIB);
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					expressao();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_P) | (1L << FUNCTION) | (1L << ID) | (1L << NUM))) != 0) );
				setState(199);
				match(PTV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(ID);
				setState(202);
				match(ATRIB);
				setState(203);
				match(ID);
				setState(204);
				match(PTV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(ID);
				setState(206);
				match(ATRIB);
				setState(207);
				match(NUM);
				setState(208);
				match(PTV);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(ID);
				setState(210);
				match(ATRIB);
				setState(211);
				match(TEXTO);
				setState(212);
				match(PTV);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MinhaGramaticaParser.WRITE, 0); }
		public TerminalNode QUAT_PT() { return getToken(MinhaGramaticaParser.QUAT_PT, 0); }
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public List<TerminalNode> TEXTO() { return getTokens(MinhaGramaticaParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(MinhaGramaticaParser.TEXTO, i);
		}
		public List<TerminalNode> NUM() { return getTokens(MinhaGramaticaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MinhaGramaticaParser.NUM, i);
		}
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(WRITE);
			setState(216);
			match(QUAT_PT);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << TEXTO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << TEXTO))) != 0) );
			setState(222);
			match(PTV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MinhaGramaticaParser.READ, 0); }
		public TerminalNode QUAT_PT() { return getToken(MinhaGramaticaParser.QUAT_PT, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(READ);
			setState(225);
			match(QUAT_PT);
			setState(226);
			match(ID);
			setState(227);
			match(PTV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MinhaGramaticaParser.IF, 0); }
		public TerminalNode ABRE_P() { return getToken(MinhaGramaticaParser.ABRE_P, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode FECHA_P() { return getToken(MinhaGramaticaParser.FECHA_P, 0); }
		public TerminalNode DOIS_PT() { return getToken(MinhaGramaticaParser.DOIS_PT, 0); }
		public TerminalNode END() { return getToken(MinhaGramaticaParser.END, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public T_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterT_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitT_if(this);
		}
	}

	public final T_ifContext t_if() throws RecognitionException {
		T_ifContext _localctx = new T_ifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_t_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IF);
			setState(230);
			match(ABRE_P);
			setState(231);
			expressao_logica();
			setState(232);
			match(FECHA_P);
			setState(233);
			match(DOIS_PT);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				bloco();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
			setState(239);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MinhaGramaticaParser.ELSE, 0); }
		public TerminalNode DOIS_PT() { return getToken(MinhaGramaticaParser.DOIS_PT, 0); }
		public TerminalNode END() { return getToken(MinhaGramaticaParser.END, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public T_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterT_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitT_else(this);
		}
	}

	public final T_elseContext t_else() throws RecognitionException {
		T_elseContext _localctx = new T_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_t_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ELSE);
			setState(242);
			match(DOIS_PT);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				bloco();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
			setState(248);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_elseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(MinhaGramaticaParser.ELSEIF, 0); }
		public TerminalNode ABRE_P() { return getToken(MinhaGramaticaParser.ABRE_P, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode FECHA_P() { return getToken(MinhaGramaticaParser.FECHA_P, 0); }
		public TerminalNode DOIS_PT() { return getToken(MinhaGramaticaParser.DOIS_PT, 0); }
		public TerminalNode END() { return getToken(MinhaGramaticaParser.END, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public T_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterT_elseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitT_elseif(this);
		}
	}

	public final T_elseifContext t_elseif() throws RecognitionException {
		T_elseifContext _localctx = new T_elseifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_t_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ELSEIF);
			setState(251);
			match(ABRE_P);
			setState(252);
			expressao_logica();
			setState(253);
			match(FECHA_P);
			setState(254);
			match(DOIS_PT);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				bloco();
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
			setState(260);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MinhaGramaticaParser.FOR, 0); }
		public TerminalNode ABRE_P() { return getToken(MinhaGramaticaParser.ABRE_P, 0); }
		public TerminalNode TIPO() { return getToken(MinhaGramaticaParser.TIPO, 0); }
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode ATRIB() { return getToken(MinhaGramaticaParser.ATRIB, 0); }
		public List<TerminalNode> NUM() { return getTokens(MinhaGramaticaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MinhaGramaticaParser.NUM, i);
		}
		public List<TerminalNode> PTV() { return getTokens(MinhaGramaticaParser.PTV); }
		public TerminalNode PTV(int i) {
			return getToken(MinhaGramaticaParser.PTV, i);
		}
		public TerminalNode OP_LOG() { return getToken(MinhaGramaticaParser.OP_LOG, 0); }
		public List<TerminalNode> OP_ARIT() { return getTokens(MinhaGramaticaParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(MinhaGramaticaParser.OP_ARIT, i);
		}
		public TerminalNode FECHA_P() { return getToken(MinhaGramaticaParser.FECHA_P, 0); }
		public TerminalNode DOIS_PT() { return getToken(MinhaGramaticaParser.DOIS_PT, 0); }
		public TerminalNode END() { return getToken(MinhaGramaticaParser.END, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public T_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterT_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitT_for(this);
		}
	}

	public final T_forContext t_for() throws RecognitionException {
		T_forContext _localctx = new T_forContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_t_for);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(FOR);
				setState(263);
				match(ABRE_P);
				setState(264);
				match(TIPO);
				setState(265);
				match(ID);
				setState(266);
				match(ATRIB);
				setState(267);
				match(NUM);
				setState(268);
				match(PTV);
				setState(269);
				match(ID);
				setState(270);
				match(OP_LOG);
				setState(271);
				match(NUM);
				setState(272);
				match(PTV);
				setState(273);
				match(ID);
				setState(274);
				match(OP_ARIT);
				setState(275);
				match(OP_ARIT);
				setState(276);
				match(FECHA_P);
				setState(277);
				match(DOIS_PT);
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(278);
					bloco();
					}
					}
					setState(281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
				setState(283);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(FOR);
				setState(286);
				match(ABRE_P);
				setState(287);
				match(TIPO);
				setState(288);
				match(ID);
				setState(289);
				match(ATRIB);
				setState(290);
				match(NUM);
				setState(291);
				match(PTV);
				setState(292);
				match(ID);
				setState(293);
				match(OP_LOG);
				setState(294);
				match(ID);
				setState(295);
				match(PTV);
				setState(296);
				match(ID);
				setState(297);
				match(OP_ARIT);
				setState(298);
				match(OP_ARIT);
				setState(299);
				match(FECHA_P);
				setState(300);
				match(DOIS_PT);
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(301);
					bloco();
					}
					}
					setState(304); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
				setState(306);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MinhaGramaticaParser.WHILE, 0); }
		public TerminalNode ABRE_P() { return getToken(MinhaGramaticaParser.ABRE_P, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode FECHA_P() { return getToken(MinhaGramaticaParser.FECHA_P, 0); }
		public TerminalNode DOIS_PT() { return getToken(MinhaGramaticaParser.DOIS_PT, 0); }
		public TerminalNode END() { return getToken(MinhaGramaticaParser.END, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public T_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterT_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitT_while(this);
		}
	}

	public final T_whileContext t_while() throws RecognitionException {
		T_whileContext _localctx = new T_whileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_t_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(WHILE);
			setState(311);
			match(ABRE_P);
			setState(312);
			expressao_logica();
			setState(313);
			match(FECHA_P);
			setState(314);
			match(DOIS_PT);
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(315);
				bloco();
				}
				}
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
			setState(320);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MinhaGramaticaParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public TerminalNode NUM() { return getToken(MinhaGramaticaParser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(MinhaGramaticaParser.TEXTO, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(MinhaGramaticaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MinhaGramaticaParser.FALSE, 0); }
		public T_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterT_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitT_return(this);
		}
	}

	public final T_returnContext t_return() throws RecognitionException {
		T_returnContext _localctx = new T_returnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_t_return);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(RETURN);
				setState(323);
				expressao();
				setState(324);
				match(PTV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(RETURN);
				setState(327);
				match(NUM);
				setState(328);
				match(PTV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(RETURN);
				setState(330);
				match(TEXTO);
				setState(331);
				match(PTV);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(RETURN);
				setState(333);
				match(ID);
				setState(334);
				match(PTV);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				match(RETURN);
				setState(336);
				match(TRUE);
				setState(337);
				match(PTV);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(RETURN);
				setState(339);
				match(FALSE);
				setState(340);
				match(PTV);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				match(RETURN);
				setState(342);
				match(PTV);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public T_ifContext t_if() {
			return getRuleContext(T_ifContext.class,0);
		}
		public T_elseContext t_else() {
			return getRuleContext(T_elseContext.class,0);
		}
		public T_elseifContext t_elseif() {
			return getRuleContext(T_elseifContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public T_forContext t_for() {
			return getRuleContext(T_forContext.class,0);
		}
		public T_whileContext t_while() {
			return getRuleContext(T_whileContext.class,0);
		}
		public T_returnContext t_return() {
			return getRuleContext(T_returnContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bloco);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				write();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				read();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				t_if();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
				t_else();
				}
				break;
			case ELSEIF:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				t_elseif();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				declaracao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(351);
				atribuicao();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(352);
				t_for();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 9);
				{
				setState(353);
				t_while();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 10);
				{
				setState(354);
				t_return();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 11);
				{
				setState(355);
				chamada_funcao();
				setState(356);
				match(PTV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\5\2&\n\2\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\3\6\3\60\n\3\r\3\16\3\61"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"D\n\4\f\4\16\4G\13\4\3\4\3\4\3\5\3\5\3\5\6\5N\n\5\r\5\16\5O\3\5\3\5\3"+
		"\5\6\5U\n\5\r\5\16\5V\3\5\3\5\3\5\6\5\\\n\5\r\5\16\5]\3\5\3\5\3\5\6\5"+
		"c\n\5\r\5\16\5d\3\5\3\5\3\5\6\5j\n\5\r\5\16\5k\3\5\3\5\3\5\6\5q\n\5\r"+
		"\5\16\5r\3\5\3\5\3\5\6\5x\n\5\r\5\16\5y\3\5\3\5\3\5\6\5\177\n\5\r\5\16"+
		"\5\u0080\5\5\u0083\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\5\b\u009c\n"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00a2\n\b\f\b\16\b\u00a5\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00b0\n\b\f\b\16\b\u00b3\13\b\5\b\u00b5\n\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00bb\n\b\f\b\16\b\u00be\13\b\3\b\5\b\u00c1\n\b\3\t\3"+
		"\t\3\t\6\t\u00c6\n\t\r\t\16\t\u00c7\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d8\n\t\3\n\3\n\3\n\6\n\u00dd\n\n\r\n\16"+
		"\n\u00de\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\6\f"+
		"\u00ee\n\f\r\f\16\f\u00ef\3\f\3\f\3\r\3\r\3\r\6\r\u00f7\n\r\r\r\16\r\u00f8"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0103\n\16\r\16\16\16\u0104"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\6\17\u011a\n\17\r\17\16\17\u011b\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\6\17\u0131\n\17\r\17\16\17\u0132\3\17\3\17\5\17\u0137\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u013f\n\20\r\20\16\20\u0140\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u015a\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0169\n\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\34\35\3\2\32"+
		"\33\3\2\34\36\2\u0192\2%\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b\u0082\3\2\2\2"+
		"\n\u0084\3\2\2\2\f\u0088\3\2\2\2\16\u00c0\3\2\2\2\20\u00d7\3\2\2\2\22"+
		"\u00d9\3\2\2\2\24\u00e2\3\2\2\2\26\u00e7\3\2\2\2\30\u00f3\3\2\2\2\32\u00fc"+
		"\3\2\2\2\34\u0136\3\2\2\2\36\u0138\3\2\2\2 \u0159\3\2\2\2\"\u0168\3\2"+
		"\2\2$&\5\20\t\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\5\16\b\2(\'\3\2\2\2)"+
		"*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\3\3\2\2\2,/\t\2\2\2-.\7\32\2\2.\60\t\2"+
		"\2\2/-\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62:\3\2\2\2\63"+
		":\5\b\5\2\64\65\7\t\2\2\65\66\5\4\3\2\66\67\7\n\2\2\67:\3\2\2\28:\5\6"+
		"\4\29,\3\2\2\29\63\3\2\2\29\64\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\7\r\2\2"+
		"<=\7\34\2\2=>\7\t\2\2>?\7\3\2\2?E\7\34\2\2@A\7\25\2\2AB\7\3\2\2BD\7\34"+
		"\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\n"+
		"\2\2I\7\3\2\2\2JM\7\34\2\2KL\7\33\2\2LN\7\34\2\2MK\3\2\2\2NO\3\2\2\2O"+
		"M\3\2\2\2OP\3\2\2\2P\u0083\3\2\2\2QT\7\35\2\2RS\7\33\2\2SU\7\35\2\2TR"+
		"\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\u0083\3\2\2\2X[\7\34\2\2YZ\7\33"+
		"\2\2Z\\\7\35\2\2[Y\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\u0083\3\2\2"+
		"\2_b\7\35\2\2`a\7\33\2\2ac\7\34\2\2b`\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2e\u0083\3\2\2\2fi\7\35\2\2gh\7\32\2\2hj\7\35\2\2ig\3\2\2\2jk\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2l\u0083\3\2\2\2mp\7\34\2\2no\7\32\2\2oq\7\34\2"+
		"\2pn\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\u0083\3\2\2\2tw\7\34\2\2u"+
		"v\t\3\2\2vx\7\35\2\2wu\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0083\3"+
		"\2\2\2{~\7\35\2\2|}\7\32\2\2}\177\7\34\2\2~|\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082J\3\2\2\2"+
		"\u0082Q\3\2\2\2\u0082X\3\2\2\2\u0082_\3\2\2\2\u0082f\3\2\2\2\u0082m\3"+
		"\2\2\2\u0082t\3\2\2\2\u0082{\3\2\2\2\u0083\t\3\2\2\2\u0084\u0085\7\3\2"+
		"\2\u0085\u0086\7\34\2\2\u0086\u0087\7\b\2\2\u0087\13\3\2\2\2\u0088\u0089"+
		"\7\24\2\2\u0089\u008a\7\34\2\2\u008a\u008b\7\4\2\2\u008b\u008c\7\35\2"+
		"\2\u008c\u008d\7\b\2\2\u008d\r\3\2\2\2\u008e\u008f\7\r\2\2\u008f\u0090"+
		"\7\34\2\2\u0090\u009b\7\t\2\2\u0091\u0092\7\3\2\2\u0092\u0098\7\34\2\2"+
		"\u0093\u0094\7\25\2\2\u0094\u0095\7\3\2\2\u0095\u0097\7\34\2\2\u0096\u0093"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\n\2\2\u009e\u009f\7\3\2\2\u009f"+
		"\u00a3\7\6\2\2\u00a0\u00a2\5\"\22\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00c1\7\7\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\7\31"+
		"\2\2\u00a9\u00b4\7\t\2\2\u00aa\u00ab\7\3\2\2\u00ab\u00b1\7\34\2\2\u00ac"+
		"\u00ad\7\25\2\2\u00ad\u00ae\7\3\2\2\u00ae\u00b0\7\34\2\2\u00af\u00ac\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8\7\3\2\2\u00b8"+
		"\u00bc\7\6\2\2\u00b9\u00bb\5\"\22\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c1\7\7\2\2\u00c0\u008e\3\2\2\2\u00c0\u00a7\3\2"+
		"\2\2\u00c1\17\3\2\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c5\7\4\2\2\u00c4\u00c6"+
		"\5\4\3\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\b\2\2\u00ca\u00d8\3\2"+
		"\2\2\u00cb\u00cc\7\34\2\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce\7\34\2\2\u00ce"+
		"\u00d8\7\b\2\2\u00cf\u00d0\7\34\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\7"+
		"\35\2\2\u00d2\u00d8\7\b\2\2\u00d3\u00d4\7\34\2\2\u00d4\u00d5\7\4\2\2\u00d5"+
		"\u00d6\7\36\2\2\u00d6\u00d8\7\b\2\2\u00d7\u00c2\3\2\2\2\u00d7\u00cb\3"+
		"\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\21\3\2\2\2\u00d9"+
		"\u00da\7\f\2\2\u00da\u00dc\7\5\2\2\u00db\u00dd\t\4\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7\b\2\2\u00e1\23\3\2\2\2\u00e2\u00e3\7\13\2"+
		"\2\u00e3\u00e4\7\5\2\2\u00e4\u00e5\7\34\2\2\u00e5\u00e6\7\b\2\2\u00e6"+
		"\25\3\2\2\2\u00e7\u00e8\7\16\2\2\u00e8\u00e9\7\t\2\2\u00e9\u00ea\5\b\5"+
		"\2\u00ea\u00eb\7\n\2\2\u00eb\u00ed\7\6\2\2\u00ec\u00ee\5\"\22\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\7\2\2\u00f2\27\3\2\2\2\u00f3\u00f4"+
		"\7\17\2\2\u00f4\u00f6\7\6\2\2\u00f5\u00f7\5\"\22\2\u00f6\u00f5\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\7\7\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\7\20\2\2\u00fd"+
		"\u00fe\7\t\2\2\u00fe\u00ff\5\b\5\2\u00ff\u0100\7\n\2\2\u0100\u0102\7\6"+
		"\2\2\u0101\u0103\5\"\22\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\7"+
		"\2\2\u0107\33\3\2\2\2\u0108\u0109\7\21\2\2\u0109\u010a\7\t\2\2\u010a\u010b"+
		"\7\3\2\2\u010b\u010c\7\34\2\2\u010c\u010d\7\4\2\2\u010d\u010e\7\35\2\2"+
		"\u010e\u010f\7\b\2\2\u010f\u0110\7\34\2\2\u0110\u0111\7\33\2\2\u0111\u0112"+
		"\7\35\2\2\u0112\u0113\7\b\2\2\u0113\u0114\7\34\2\2\u0114\u0115\7\32\2"+
		"\2\u0115\u0116\7\32\2\2\u0116\u0117\7\n\2\2\u0117\u0119\7\6\2\2\u0118"+
		"\u011a\5\"\22\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\7\2\2\u011e"+
		"\u0137\3\2\2\2\u011f\u0120\7\21\2\2\u0120\u0121\7\t\2\2\u0121\u0122\7"+
		"\3\2\2\u0122\u0123\7\34\2\2\u0123\u0124\7\4\2\2\u0124\u0125\7\35\2\2\u0125"+
		"\u0126\7\b\2\2\u0126\u0127\7\34\2\2\u0127\u0128\7\33\2\2\u0128\u0129\7"+
		"\34\2\2\u0129\u012a\7\b\2\2\u012a\u012b\7\34\2\2\u012b\u012c\7\32\2\2"+
		"\u012c\u012d\7\32\2\2\u012d\u012e\7\n\2\2\u012e\u0130\7\6\2\2\u012f\u0131"+
		"\5\"\22\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\7\2\2\u0135\u0137"+
		"\3\2\2\2\u0136\u0108\3\2\2\2\u0136\u011f\3\2\2\2\u0137\35\3\2\2\2\u0138"+
		"\u0139\7\22\2\2\u0139\u013a\7\t\2\2\u013a\u013b\5\b\5\2\u013b\u013c\7"+
		"\n\2\2\u013c\u013e\7\6\2\2\u013d\u013f\5\"\22\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0143\7\7\2\2\u0143\37\3\2\2\2\u0144\u0145\7\23\2\2\u0145\u0146"+
		"\5\4\3\2\u0146\u0147\7\b\2\2\u0147\u015a\3\2\2\2\u0148\u0149\7\23\2\2"+
		"\u0149\u014a\7\35\2\2\u014a\u015a\7\b\2\2\u014b\u014c\7\23\2\2\u014c\u014d"+
		"\7\36\2\2\u014d\u015a\7\b\2\2\u014e\u014f\7\23\2\2\u014f\u0150\7\34\2"+
		"\2\u0150\u015a\7\b\2\2\u0151\u0152\7\23\2\2\u0152\u0153\7\27\2\2\u0153"+
		"\u015a\7\b\2\2\u0154\u0155\7\23\2\2\u0155\u0156\7\26\2\2\u0156\u015a\7"+
		"\b\2\2\u0157\u0158\7\23\2\2\u0158\u015a\7\b\2\2\u0159\u0144\3\2\2\2\u0159"+
		"\u0148\3\2\2\2\u0159\u014b\3\2\2\2\u0159\u014e\3\2\2\2\u0159\u0151\3\2"+
		"\2\2\u0159\u0154\3\2\2\2\u0159\u0157\3\2\2\2\u015a!\3\2\2\2\u015b\u0169"+
		"\5\22\n\2\u015c\u0169\5\24\13\2\u015d\u0169\5\26\f\2\u015e\u0169\5\30"+
		"\r\2\u015f\u0169\5\32\16\2\u0160\u0169\5\n\6\2\u0161\u0169\5\20\t\2\u0162"+
		"\u0169\5\34\17\2\u0163\u0169\5\36\20\2\u0164\u0169\5 \21\2\u0165\u0166"+
		"\5\6\4\2\u0166\u0167\7\b\2\2\u0167\u0169\3\2\2\2\u0168\u015b\3\2\2\2\u0168"+
		"\u015c\3\2\2\2\u0168\u015d\3\2\2\2\u0168\u015e\3\2\2\2\u0168\u015f\3\2"+
		"\2\2\u0168\u0160\3\2\2\2\u0168\u0161\3\2\2\2\u0168\u0162\3\2\2\2\u0168"+
		"\u0163\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0169#\3\2\2\2"+
		"#%*\619EOV]dkry\u0080\u0082\u0098\u009b\u00a3\u00b1\u00b4\u00bc\u00c0"+
		"\u00c7\u00d7\u00de\u00ef\u00f8\u0104\u011b\u0132\u0136\u0140\u0159\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}