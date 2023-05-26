// Generated from MinhaGramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, ATRIB=2, QUAT_PT=3, DOIS_PT=4, END=5, PTV=6, ABRE_P=7, FECHA_P=8, 
		COMENT=9, READ=10, WRITE=11, FUNCTION=12, IF=13, ELSE=14, ELSEIF=15, FOR=16, 
		WHILE=17, RETURN=18, OP_ARIT=19, OP_LOG=20, ID=21, NUM=22, IGNORA=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIPO", "ATRIB", "QUAT_PT", "DOIS_PT", "END", "PTV", "ABRE_P", "FECHA_P", 
			"COMENT", "READ", "WRITE", "FUNCTION", "IF", "ELSE", "ELSEIF", "FOR", 
			"WHILE", "RETURN", "OP_ARIT", "OP_LOG", "ID", "NUM", "LETRA", "DIGITO", 
			"IGNORA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'->'", "'::'", "':'", "'END'", "';'", "'('", "')'", "'--'", 
			"'READ'", "'WRITE'", "'FUNCTION'", "'IF'", "'ELSE'", "'ELSEIF'", "'FOR'", 
			"'WHILE'", "'RETURN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "ATRIB", "QUAT_PT", "DOIS_PT", "END", "PTV", "ABRE_P", 
			"FECHA_P", "COMENT", "READ", "WRITE", "FUNCTION", "IF", "ELSE", "ELSEIF", 
			"FOR", "WHILE", "RETURN", "OP_ARIT", "OP_LOG", "ID", "NUM", "IGNORA"
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


	public MinhaGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2E\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009b\n\25\3\26"+
		"\3\26\3\26\7\26\u00a0\n\26\f\26\16\26\u00a3\13\26\3\27\6\27\u00a6\n\27"+
		"\r\27\16\27\u00a7\3\27\3\27\6\27\u00ac\n\27\r\27\16\27\u00ad\5\27\u00b0"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\7\32\u00b7\n\32\f\32\16\32\u00ba\13\32"+
		"\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\31\3\2\7"+
		"\6\2,-//\61\61``\4\2>>@@\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00c7\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2"+
		"\2\3D\3\2\2\2\5F\3\2\2\2\7I\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rR\3\2\2\2"+
		"\17T\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25[\3\2\2\2\27`\3\2\2\2\31f\3\2\2"+
		"\2\33o\3\2\2\2\35r\3\2\2\2\37w\3\2\2\2!~\3\2\2\2#\u0082\3\2\2\2%\u0088"+
		"\3\2\2\2\'\u008f\3\2\2\2)\u009a\3\2\2\2+\u009c\3\2\2\2-\u00a5\3\2\2\2"+
		"/\u00b1\3\2\2\2\61\u00b3\3\2\2\2\63\u00b8\3\2\2\2\65\66\7k\2\2\66\67\7"+
		"p\2\2\67E\7v\2\289\7h\2\29:\7n\2\2:;\7q\2\2;<\7c\2\2<E\7v\2\2=>\7u\2\2"+
		">?\7v\2\2?E\7t\2\2@A\7d\2\2AB\7q\2\2BC\7q\2\2CE\7n\2\2D\65\3\2\2\2D8\3"+
		"\2\2\2D=\3\2\2\2D@\3\2\2\2E\4\3\2\2\2FG\7/\2\2GH\7@\2\2H\6\3\2\2\2IJ\7"+
		"<\2\2JK\7<\2\2K\b\3\2\2\2LM\7<\2\2M\n\3\2\2\2NO\7G\2\2OP\7P\2\2PQ\7F\2"+
		"\2Q\f\3\2\2\2RS\7=\2\2S\16\3\2\2\2TU\7*\2\2U\20\3\2\2\2VW\7+\2\2W\22\3"+
		"\2\2\2XY\7/\2\2YZ\7/\2\2Z\24\3\2\2\2[\\\7T\2\2\\]\7G\2\2]^\7C\2\2^_\7"+
		"F\2\2_\26\3\2\2\2`a\7Y\2\2ab\7T\2\2bc\7K\2\2cd\7V\2\2de\7G\2\2e\30\3\2"+
		"\2\2fg\7H\2\2gh\7W\2\2hi\7P\2\2ij\7E\2\2jk\7V\2\2kl\7K\2\2lm\7Q\2\2mn"+
		"\7P\2\2n\32\3\2\2\2op\7K\2\2pq\7H\2\2q\34\3\2\2\2rs\7G\2\2st\7N\2\2tu"+
		"\7U\2\2uv\7G\2\2v\36\3\2\2\2wx\7G\2\2xy\7N\2\2yz\7U\2\2z{\7G\2\2{|\7K"+
		"\2\2|}\7H\2\2} \3\2\2\2~\177\7H\2\2\177\u0080\7Q\2\2\u0080\u0081\7T\2"+
		"\2\u0081\"\3\2\2\2\u0082\u0083\7Y\2\2\u0083\u0084\7J\2\2\u0084\u0085\7"+
		"K\2\2\u0085\u0086\7N\2\2\u0086\u0087\7G\2\2\u0087$\3\2\2\2\u0088\u0089"+
		"\7T\2\2\u0089\u008a\7G\2\2\u008a\u008b\7V\2\2\u008b\u008c\7W\2\2\u008c"+
		"\u008d\7T\2\2\u008d\u008e\7P\2\2\u008e&\3\2\2\2\u008f\u0090\t\2\2\2\u0090"+
		"(\3\2\2\2\u0091\u009b\t\3\2\2\u0092\u0093\7@\2\2\u0093\u009b\7?\2\2\u0094"+
		"\u0095\7>\2\2\u0095\u009b\7?\2\2\u0096\u0097\7?\2\2\u0097\u009b\7?\2\2"+
		"\u0098\u0099\7#\2\2\u0099\u009b\7?\2\2\u009a\u0091\3\2\2\2\u009a\u0092"+
		"\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"*\3\2\2\2\u009c\u00a1\5/\30\2\u009d\u00a0\5\61\31\2\u009e\u00a0\5/\30"+
		"\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2,\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a6\5\61\31\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00af\3\2\2\2\u00a9\u00ab\7\60\2\2\u00aa"+
		"\u00ac\5\61\31\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0.\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2\60\3\2\2\2\u00b3"+
		"\u00b4\t\5\2\2\u00b4\62\3\2\2\2\u00b5\u00b7\t\6\2\2\u00b6\u00b5\3\2\2"+
		"\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\b\32\2\2\u00bc\64\3\2\2\2\13"+
		"\2D\u009a\u009f\u00a1\u00a7\u00ad\u00af\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}