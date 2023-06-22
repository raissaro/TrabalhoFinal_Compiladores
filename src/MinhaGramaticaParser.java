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
				match(NUM);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					match(OP_ARIT);
					setState(44);
					match(NUM);
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
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
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
			setState(71);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(ID);
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					match(OP_LOG);
					setState(75);
					match(ID);
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_LOG );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(NUM);
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					match(OP_LOG);
					setState(82);
					match(NUM);
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_LOG );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(ID);
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					match(OP_LOG);
					setState(89);
					match(NUM);
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_LOG );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(NUM);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					match(OP_LOG);
					setState(96);
					match(ID);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_LOG );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(NUM);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102);
					match(OP_ARIT);
					setState(103);
					match(NUM);
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARIT );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				match(ID);
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109);
					match(OP_ARIT);
					setState(110);
					match(ID);
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARIT );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(ID);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					_la = _input.LA(1);
					if ( !(_la==OP_ARIT || _la==OP_LOG) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(117);
					match(NUM);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARIT || _la==OP_LOG );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				match(NUM);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123);
					match(OP_ARIT);
					setState(124);
					match(ID);
					}
					}
					setState(127); 
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
			setState(131);
			match(TIPO);
			setState(132);
			match(ID);
			setState(133);
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
			setState(135);
			match(DEFINE);
			setState(136);
			match(ID);
			setState(137);
			match(ATRIB);
			setState(138);
			match(NUM);
			setState(139);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(FUNCTION);
				setState(142);
				match(ID);
				setState(143);
				match(ABRE_P);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO) {
					{
					setState(144);
					match(TIPO);
					setState(145);
					match(ID);
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(146);
						match(VIRGULA);
						setState(147);
						match(TIPO);
						setState(148);
						match(ID);
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(156);
				match(FECHA_P);
				setState(157);
				match(TIPO);
				setState(158);
				match(DOIS_PT);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(159);
					bloco();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(FUNCTION);
				setState(167);
				match(MAIN);
				setState(168);
				match(ABRE_P);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TIPO) {
					{
					setState(169);
					match(TIPO);
					setState(170);
					match(ID);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(171);
						match(VIRGULA);
						setState(172);
						match(TIPO);
						setState(173);
						match(ID);
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(181);
				match(FECHA_P);
				setState(182);
				match(TIPO);
				setState(183);
				match(DOIS_PT);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0)) {
					{
					{
					setState(184);
					bloco();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ID);
				setState(194);
				match(ATRIB);
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					expressao();
					}
					}
					setState(198); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_P) | (1L << FUNCTION) | (1L << ID) | (1L << NUM))) != 0) );
				setState(200);
				match(PTV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(ID);
				setState(203);
				match(ATRIB);
				setState(204);
				match(ID);
				setState(205);
				match(PTV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(ID);
				setState(207);
				match(ATRIB);
				setState(208);
				match(NUM);
				setState(209);
				match(PTV);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(ID);
				setState(211);
				match(ATRIB);
				setState(212);
				match(TEXTO);
				setState(213);
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
		public TerminalNode TEXTO() { return getToken(MinhaGramaticaParser.TEXTO, 0); }
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(WRITE);
			setState(217);
			match(QUAT_PT);
			setState(218);
			match(TEXTO);
			setState(219);
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
			setState(221);
			match(READ);
			setState(222);
			match(QUAT_PT);
			setState(223);
			match(ID);
			setState(224);
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
			setState(226);
			match(IF);
			setState(227);
			match(ABRE_P);
			setState(228);
			expressao_logica();
			setState(229);
			match(FECHA_P);
			setState(230);
			match(DOIS_PT);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				bloco();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
			setState(236);
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
			setState(238);
			match(ELSE);
			setState(239);
			match(DOIS_PT);
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				bloco();
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
			setState(245);
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
			setState(247);
			match(ELSEIF);
			setState(248);
			match(ABRE_P);
			setState(249);
			expressao_logica();
			setState(250);
			match(FECHA_P);
			setState(251);
			match(DOIS_PT);
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				bloco();
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
			setState(257);
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
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(FOR);
				setState(260);
				match(ABRE_P);
				setState(261);
				match(TIPO);
				setState(262);
				match(ID);
				setState(263);
				match(ATRIB);
				setState(264);
				match(NUM);
				setState(265);
				match(PTV);
				setState(266);
				match(ID);
				setState(267);
				match(OP_LOG);
				setState(268);
				match(NUM);
				setState(269);
				match(PTV);
				setState(270);
				match(ID);
				setState(271);
				match(OP_ARIT);
				setState(272);
				match(OP_ARIT);
				setState(273);
				match(FECHA_P);
				setState(274);
				match(DOIS_PT);
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					bloco();
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
				setState(280);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(FOR);
				setState(283);
				match(ABRE_P);
				setState(284);
				match(TIPO);
				setState(285);
				match(ID);
				setState(286);
				match(ATRIB);
				setState(287);
				match(NUM);
				setState(288);
				match(PTV);
				setState(289);
				match(ID);
				setState(290);
				match(OP_LOG);
				setState(291);
				match(ID);
				setState(292);
				match(PTV);
				setState(293);
				match(ID);
				setState(294);
				match(OP_ARIT);
				setState(295);
				match(OP_ARIT);
				setState(296);
				match(FECHA_P);
				setState(297);
				match(DOIS_PT);
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					bloco();
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
				setState(303);
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
			setState(307);
			match(WHILE);
			setState(308);
			match(ABRE_P);
			setState(309);
			expressao_logica();
			setState(310);
			match(FECHA_P);
			setState(311);
			match(DOIS_PT);
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				bloco();
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << READ) | (1L << WRITE) | (1L << FUNCTION) | (1L << IF) | (1L << ELSE) | (1L << ELSEIF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << ID))) != 0) );
			setState(317);
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
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
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
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(RETURN);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_P) | (1L << FUNCTION) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(320);
					expressao();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				match(PTV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(RETURN);
				setState(328);
				match(NUM);
				setState(329);
				match(PTV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(RETURN);
				setState(331);
				match(TEXTO);
				setState(332);
				match(PTV);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(RETURN);
				setState(334);
				match(ID);
				setState(335);
				match(PTV);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(RETURN);
				setState(337);
				match(TRUE);
				setState(338);
				match(PTV);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(RETURN);
				setState(340);
				match(FALSE);
				setState(341);
				match(PTV);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				match(RETURN);
				setState(343);
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
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				write();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				read();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				t_if();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				t_else();
				}
				break;
			case ELSEIF:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				t_elseif();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				declaracao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(352);
				atribuicao();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(353);
				t_for();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 9);
				{
				setState(354);
				t_while();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 10);
				{
				setState(355);
				t_return();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 11);
				{
				setState(356);
				chamada_funcao();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u016a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\5\2&\n\2\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\3\6\3\60\n\3\r\3\16\3\61"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"D\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5O\n\5\r\5\16\5P\3\5\3"+
		"\5\3\5\6\5V\n\5\r\5\16\5W\3\5\3\5\3\5\6\5]\n\5\r\5\16\5^\3\5\3\5\3\5\6"+
		"\5d\n\5\r\5\16\5e\3\5\3\5\3\5\6\5k\n\5\r\5\16\5l\3\5\3\5\3\5\6\5r\n\5"+
		"\r\5\16\5s\3\5\3\5\3\5\6\5y\n\5\r\5\16\5z\3\5\3\5\3\5\6\5\u0080\n\5\r"+
		"\5\16\5\u0081\5\5\u0084\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\5\b\u009d"+
		"\n\b\3\b\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00b1\n\b\f\b\16\b\u00b4\13\b\5\b\u00b6\n\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00bc\n\b\f\b\16\b\u00bf\13\b\3\b\5\b\u00c2\n\b\3\t"+
		"\3\t\3\t\6\t\u00c7\n\t\r\t\16\t\u00c8\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00eb\n\f\r\f\16\f\u00ec\3\f"+
		"\3\f\3\r\3\r\3\r\6\r\u00f4\n\r\r\r\16\r\u00f5\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\6\16\u0100\n\16\r\16\16\16\u0101\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\6\17\u0117\n\17\r\17\16\17\u0118\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u012e"+
		"\n\17\r\17\16\17\u012f\3\17\3\17\5\17\u0134\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\6\20\u013c\n\20\r\20\16\20\u013d\3\20\3\20\3\21\3\21\7\21\u0144"+
		"\n\21\f\21\16\21\u0147\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u015b\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0168\n\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\32\33\2\u0191"+
		"\2%\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b\u0083\3\2\2\2\n\u0085\3\2\2\2\f\u0089"+
		"\3\2\2\2\16\u00c1\3\2\2\2\20\u00d8\3\2\2\2\22\u00da\3\2\2\2\24\u00df\3"+
		"\2\2\2\26\u00e4\3\2\2\2\30\u00f0\3\2\2\2\32\u00f9\3\2\2\2\34\u0133\3\2"+
		"\2\2\36\u0135\3\2\2\2 \u015a\3\2\2\2\"\u0167\3\2\2\2$&\5\20\t\2%$\3\2"+
		"\2\2%&\3\2\2\2&(\3\2\2\2\')\5\16\b\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+"+
		"\3\2\2\2+\3\3\2\2\2,/\7\35\2\2-.\7\32\2\2.\60\7\35\2\2/-\3\2\2\2\60\61"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62:\3\2\2\2\63:\5\b\5\2\64\65\7\t\2"+
		"\2\65\66\5\4\3\2\66\67\7\n\2\2\67:\3\2\2\28:\5\6\4\29,\3\2\2\29\63\3\2"+
		"\2\29\64\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\7\r\2\2<=\7\34\2\2=>\7\t\2\2>"+
		"?\7\3\2\2?E\7\34\2\2@A\7\25\2\2AB\7\3\2\2BD\7\34\2\2C@\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\n\2\2IJ\7\b\2\2J\7\3\2"+
		"\2\2KN\7\34\2\2LM\7\33\2\2MO\7\34\2\2NL\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ"+
		"\3\2\2\2Q\u0084\3\2\2\2RU\7\35\2\2ST\7\33\2\2TV\7\35\2\2US\3\2\2\2VW\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X\u0084\3\2\2\2Y\\\7\34\2\2Z[\7\33\2\2[]\7\35"+
		"\2\2\\Z\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\u0084\3\2\2\2`c\7\35\2"+
		"\2ab\7\33\2\2bd\7\34\2\2ca\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\u0084"+
		"\3\2\2\2gj\7\35\2\2hi\7\32\2\2ik\7\35\2\2jh\3\2\2\2kl\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2m\u0084\3\2\2\2nq\7\34\2\2op\7\32\2\2pr\7\34\2\2qo\3\2\2\2"+
		"rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\u0084\3\2\2\2ux\7\34\2\2vw\t\2\2\2wy\7"+
		"\35\2\2xv\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0084\3\2\2\2|\177\7"+
		"\35\2\2}~\7\32\2\2~\u0080\7\34\2\2\177}\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083K\3\2\2\2\u0083"+
		"R\3\2\2\2\u0083Y\3\2\2\2\u0083`\3\2\2\2\u0083g\3\2\2\2\u0083n\3\2\2\2"+
		"\u0083u\3\2\2\2\u0083|\3\2\2\2\u0084\t\3\2\2\2\u0085\u0086\7\3\2\2\u0086"+
		"\u0087\7\34\2\2\u0087\u0088\7\b\2\2\u0088\13\3\2\2\2\u0089\u008a\7\24"+
		"\2\2\u008a\u008b\7\34\2\2\u008b\u008c\7\4\2\2\u008c\u008d\7\35\2\2\u008d"+
		"\u008e\7\b\2\2\u008e\r\3\2\2\2\u008f\u0090\7\r\2\2\u0090\u0091\7\34\2"+
		"\2\u0091\u009c\7\t\2\2\u0092\u0093\7\3\2\2\u0093\u0099\7\34\2\2\u0094"+
		"\u0095\7\25\2\2\u0095\u0096\7\3\2\2\u0096\u0098\7\34\2\2\u0097\u0094\3"+
		"\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u0092\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\n\2\2\u009f\u00a0\7\3\2\2\u00a0"+
		"\u00a4\7\6\2\2\u00a1\u00a3\5\"\22\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00c2\7\7\2\2\u00a8\u00a9\7\r\2\2\u00a9\u00aa\7\31"+
		"\2\2\u00aa\u00b5\7\t\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00b2\7\34\2\2\u00ad"+
		"\u00ae\7\25\2\2\u00ae\u00af\7\3\2\2\u00af\u00b1\7\34\2\2\u00b0\u00ad\3"+
		"\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\7\3\2\2\u00b9"+
		"\u00bd\7\6\2\2\u00ba\u00bc\5\"\22\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c2\7\7\2\2\u00c1\u008f\3\2\2\2\u00c1\u00a8\3\2"+
		"\2\2\u00c2\17\3\2\2\2\u00c3\u00c4\7\34\2\2\u00c4\u00c6\7\4\2\2\u00c5\u00c7"+
		"\5\4\3\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00d9\3\2"+
		"\2\2\u00cc\u00cd\7\34\2\2\u00cd\u00ce\7\4\2\2\u00ce\u00cf\7\34\2\2\u00cf"+
		"\u00d9\7\b\2\2\u00d0\u00d1\7\34\2\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\7"+
		"\35\2\2\u00d3\u00d9\7\b\2\2\u00d4\u00d5\7\34\2\2\u00d5\u00d6\7\4\2\2\u00d6"+
		"\u00d7\7\36\2\2\u00d7\u00d9\7\b\2\2\u00d8\u00c3\3\2\2\2\u00d8\u00cc\3"+
		"\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\21\3\2\2\2\u00da"+
		"\u00db\7\f\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd\7\36\2\2\u00dd\u00de\7"+
		"\b\2\2\u00de\23\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\7\5\2\2\u00e1"+
		"\u00e2\7\34\2\2\u00e2\u00e3\7\b\2\2\u00e3\25\3\2\2\2\u00e4\u00e5\7\16"+
		"\2\2\u00e5\u00e6\7\t\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\7\n\2\2\u00e8"+
		"\u00ea\7\6\2\2\u00e9\u00eb\5\"\22\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\7\7\2\2\u00ef\27\3\2\2\2\u00f0\u00f1\7\17\2\2\u00f1\u00f3\7\6\2"+
		"\2\u00f2\u00f4\5\"\22\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\7"+
		"\2\2\u00f8\31\3\2\2\2\u00f9\u00fa\7\20\2\2\u00fa\u00fb\7\t\2\2\u00fb\u00fc"+
		"\5\b\5\2\u00fc\u00fd\7\n\2\2\u00fd\u00ff\7\6\2\2\u00fe\u0100\5\"\22\2"+
		"\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\7\2\2\u0104\33\3\2\2\2\u0105"+
		"\u0106\7\21\2\2\u0106\u0107\7\t\2\2\u0107\u0108\7\3\2\2\u0108\u0109\7"+
		"\34\2\2\u0109\u010a\7\4\2\2\u010a\u010b\7\35\2\2\u010b\u010c\7\b\2\2\u010c"+
		"\u010d\7\34\2\2\u010d\u010e\7\33\2\2\u010e\u010f\7\35\2\2\u010f\u0110"+
		"\7\b\2\2\u0110\u0111\7\34\2\2\u0111\u0112\7\32\2\2\u0112\u0113\7\32\2"+
		"\2\u0113\u0114\7\n\2\2\u0114\u0116\7\6\2\2\u0115\u0117\5\"\22\2\u0116"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\7\2\2\u011b\u0134\3\2\2\2\u011c"+
		"\u011d\7\21\2\2\u011d\u011e\7\t\2\2\u011e\u011f\7\3\2\2\u011f\u0120\7"+
		"\34\2\2\u0120\u0121\7\4\2\2\u0121\u0122\7\35\2\2\u0122\u0123\7\b\2\2\u0123"+
		"\u0124\7\34\2\2\u0124\u0125\7\33\2\2\u0125\u0126\7\34\2\2\u0126\u0127"+
		"\7\b\2\2\u0127\u0128\7\34\2\2\u0128\u0129\7\32\2\2\u0129\u012a\7\32\2"+
		"\2\u012a\u012b\7\n\2\2\u012b\u012d\7\6\2\2\u012c\u012e\5\"\22\2\u012d"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7\7\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0105\3\2\2\2\u0133\u011c\3\2\2\2\u0134\35\3\2\2\2\u0135\u0136\7\22\2"+
		"\2\u0136\u0137\7\t\2\2\u0137\u0138\5\b\5\2\u0138\u0139\7\n\2\2\u0139\u013b"+
		"\7\6\2\2\u013a\u013c\5\"\22\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140"+
		"\7\7\2\2\u0140\37\3\2\2\2\u0141\u0145\7\23\2\2\u0142\u0144\5\4\3\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u015b\7\b\2\2\u0149"+
		"\u014a\7\23\2\2\u014a\u014b\7\35\2\2\u014b\u015b\7\b\2\2\u014c\u014d\7"+
		"\23\2\2\u014d\u014e\7\36\2\2\u014e\u015b\7\b\2\2\u014f\u0150\7\23\2\2"+
		"\u0150\u0151\7\34\2\2\u0151\u015b\7\b\2\2\u0152\u0153\7\23\2\2\u0153\u0154"+
		"\7\27\2\2\u0154\u015b\7\b\2\2\u0155\u0156\7\23\2\2\u0156\u0157\7\26\2"+
		"\2\u0157\u015b\7\b\2\2\u0158\u0159\7\23\2\2\u0159\u015b\7\b\2\2\u015a"+
		"\u0141\3\2\2\2\u015a\u0149\3\2\2\2\u015a\u014c\3\2\2\2\u015a\u014f\3\2"+
		"\2\2\u015a\u0152\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"!\3\2\2\2\u015c\u0168\5\22\n\2\u015d\u0168\5\24\13\2\u015e\u0168\5\26"+
		"\f\2\u015f\u0168\5\30\r\2\u0160\u0168\5\32\16\2\u0161\u0168\5\n\6\2\u0162"+
		"\u0168\5\20\t\2\u0163\u0168\5\34\17\2\u0164\u0168\5\36\20\2\u0165\u0168"+
		"\5 \21\2\u0166\u0168\5\6\4\2\u0167\u015c\3\2\2\2\u0167\u015d\3\2\2\2\u0167"+
		"\u015e\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0160\3\2\2\2\u0167\u0161\3\2"+
		"\2\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168#\3\2\2\2#%*\619EPW^elsz\u0081"+
		"\u0083\u0099\u009c\u00a4\u00b2\u00b5\u00bd\u00c1\u00c8\u00d8\u00ec\u00f5"+
		"\u0101\u0118\u012f\u0133\u013d\u0145\u015a\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}