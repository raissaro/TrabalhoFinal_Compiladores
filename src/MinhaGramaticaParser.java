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
		RETURN=17, ASP=18, DEFINE=19, VIRGULA=20, FALSE=21, TRUE=22, HASHTAG=23, 
		OP_ARIT=24, OP_LOG=25, ID=26, NUM=27, WS=28, COMMENT=29, Error=30;
	public static final int
		RULE_programa = 0, RULE_expressao = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "expressao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'->'", "'::'", "':'", "'END'", "';'", "'('", "')'", "'READ'", 
			"'WRITE'", "'FUNCTION'", "'IF'", "'ELSE'", "'ELSEIF'", "'FOR'", "'WHILE'", 
			"'RETURN'", "'\"'", "'DEFINE'", "','", "'FALSE'", "'TRUE'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "ATRIB", "QUAT_PT", "DOIS_PT", "END", "PTV", "ABRE_P", 
			"FECHA_P", "READ", "WRITE", "FUNCTION", "IF", "ELSE", "ELSEIF", "FOR", 
			"WHILE", "RETURN", "ASP", "DEFINE", "VIRGULA", "FALSE", "TRUE", "HASHTAG", 
			"OP_ARIT", "OP_LOG", "ID", "NUM", "WS", "COMMENT", "Error"
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

	public static class ProgramaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expressao(0);
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
		public TerminalNode ABRE_P() { return getToken(MinhaGramaticaParser.ABRE_P, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_P() { return getToken(MinhaGramaticaParser.FECHA_P, 0); }
		public TerminalNode READ() { return getToken(MinhaGramaticaParser.READ, 0); }
		public TerminalNode QUAT_PT() { return getToken(MinhaGramaticaParser.QUAT_PT, 0); }
		public TerminalNode WRITE() { return getToken(MinhaGramaticaParser.WRITE, 0); }
		public List<TerminalNode> ASP() { return getTokens(MinhaGramaticaParser.ASP); }
		public TerminalNode ASP(int i) {
			return getToken(MinhaGramaticaParser.ASP, i);
		}
		public List<TerminalNode> ID() { return getTokens(MinhaGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MinhaGramaticaParser.ID, i);
		}
		public TerminalNode ATRIB() { return getToken(MinhaGramaticaParser.ATRIB, 0); }
		public TerminalNode FUNCTION() { return getToken(MinhaGramaticaParser.FUNCTION, 0); }
		public TerminalNode DOIS_PT() { return getToken(MinhaGramaticaParser.DOIS_PT, 0); }
		public TerminalNode END() { return getToken(MinhaGramaticaParser.END, 0); }
		public TerminalNode OP_ARIT() { return getToken(MinhaGramaticaParser.OP_ARIT, 0); }
		public TerminalNode OP_LOG() { return getToken(MinhaGramaticaParser.OP_LOG, 0); }
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
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_P:
				{
				setState(7);
				match(ABRE_P);
				setState(8);
				expressao(0);
				setState(9);
				match(FECHA_P);
				}
				break;
			case READ:
				{
				setState(11);
				match(READ);
				setState(12);
				match(QUAT_PT);
				setState(13);
				expressao(4);
				}
				break;
			case WRITE:
				{
				setState(14);
				match(WRITE);
				setState(15);
				match(QUAT_PT);
				setState(16);
				match(ASP);
				setState(17);
				expressao(0);
				setState(18);
				match(ASP);
				}
				break;
			case ID:
				{
				setState(20);
				match(ID);
				setState(21);
				match(ATRIB);
				setState(22);
				expressao(2);
				}
				break;
			case FUNCTION:
				{
				setState(23);
				match(FUNCTION);
				setState(24);
				match(ID);
				setState(25);
				match(ABRE_P);
				setState(26);
				expressao(0);
				setState(27);
				match(FECHA_P);
				setState(28);
				match(ID);
				setState(29);
				match(DOIS_PT);
				setState(30);
				expressao(0);
				setState(31);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(41);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(35);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(36);
						match(OP_ARIT);
						setState(37);
						expressao(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(38);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(39);
						match(OP_LOG);
						setState(40);
						expressao(7);
						}
						break;
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \61\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\2\3\4\4\2\4\2\2\2\64\2\6\3\2"+
		"\2\2\4#\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\t\b\3\1\2\t\n\7\t\2\2\n\13\5"+
		"\4\3\2\13\f\7\n\2\2\f$\3\2\2\2\r\16\7\13\2\2\16\17\7\5\2\2\17$\5\4\3\6"+
		"\20\21\7\f\2\2\21\22\7\5\2\2\22\23\7\24\2\2\23\24\5\4\3\2\24\25\7\24\2"+
		"\2\25$\3\2\2\2\26\27\7\34\2\2\27\30\7\4\2\2\30$\5\4\3\4\31\32\7\r\2\2"+
		"\32\33\7\34\2\2\33\34\7\t\2\2\34\35\5\4\3\2\35\36\7\n\2\2\36\37\7\34\2"+
		"\2\37 \7\6\2\2 !\5\4\3\2!\"\7\7\2\2\"$\3\2\2\2#\b\3\2\2\2#\r\3\2\2\2#"+
		"\20\3\2\2\2#\26\3\2\2\2#\31\3\2\2\2$-\3\2\2\2%&\f\t\2\2&\'\7\32\2\2\'"+
		",\5\4\3\n()\f\b\2\2)*\7\33\2\2*,\5\4\3\t+%\3\2\2\2+(\3\2\2\2,/\3\2\2\2"+
		"-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/-\3\2\2\2\5#+-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}