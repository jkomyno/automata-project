// Generated from /home/jkomyno/antlr4/swl/swlLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class swlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, INPUT=3, PRINT=4, ENDL=5, WHILE=6, IF=7, THEN=8, ELSE=9, 
		ELIF=10, FOR=11, VARIABLE=12, DECLARE=13, ASSIGN=14, TO=15, DO=16, BASIC_SEPARATOR=17, 
		EQUAL=18, N_EQUAL=19, GT_EQUAL=20, LT_EQUAL=21, GT=22, LT=23, AND=24, 
		OR=25, NOT=26, ADD=27, SUB=28, MUL=29, DIV=30, RANGE=31, OPEN_ROUND_BRACKET=32, 
		CLOSED_ROUND_BRACKET=33, STRING=34, BOOL=35, ID=36, NUMBER=37, WS=38, 
		ErrorChar=39, SINGLE_LINE_COMMENT=40, MULTI_LINE_COMMENT=41;
	public static final int
		COMMENTS=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "INPUT", "PRINT", "ENDL", "WHILE", "IF", "THEN", "ELSE", 
		"ELIF", "FOR", "VARIABLE", "DECLARE", "ASSIGN", "TO", "DO", "BASIC_SEPARATOR", 
		"EQUAL", "N_EQUAL", "GT_EQUAL", "LT_EQUAL", "GT", "LT", "AND", "OR", "NOT", 
		"ADD", "SUB", "MUL", "DIV", "RANGE", "OPEN_ROUND_BRACKET", "CLOSED_ROUND_BRACKET", 
		"STRING", "BOOL", "ID", "NUMBER", "WS", "ErrorChar", "SINGLE_LINE_COMMENT", 
		"MULTI_LINE_COMMENT", "STR_ESCAPE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'input'", "'print'", "'endl'", "'while'", "'if'", 
		"'then'", "'else'", "'elif'", "'for'", "'let'", "'declare'", "'be'", "'to'", 
		"'do'", "','", "'eq'", "'neq'", "'gte'", "'lte'", "'gt'", "'lt'", "'and'", 
		"'or'", "'not'", "'add'", "'sub'", "'mul'", "'div'", "'..'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "INPUT", "PRINT", "ENDL", "WHILE", "IF", "THEN", 
		"ELSE", "ELIF", "FOR", "VARIABLE", "DECLARE", "ASSIGN", "TO", "DO", "BASIC_SEPARATOR", 
		"EQUAL", "N_EQUAL", "GT_EQUAL", "LT_EQUAL", "GT", "LT", "AND", "OR", "NOT", 
		"ADD", "SUB", "MUL", "DIV", "RANGE", "OPEN_ROUND_BRACKET", "CLOSED_ROUND_BRACKET", 
		"STRING", "BOOL", "ID", "NUMBER", "WS", "ErrorChar", "SINGLE_LINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
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


	public swlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "swlLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\7#\u00e0\n#\f#\16#\u00e3"+
		"\13#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00f0\n$\3%\6%\u00f3\n%\r%\16"+
		"%\u00f4\3&\6&\u00f8\n&\r&\16&\u00f9\3\'\6\'\u00fd\n\'\r\'\16\'\u00fe\3"+
		"\'\3\'\3(\3(\3)\3)\7)\u0107\n)\f)\16)\u010a\13)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\7*\u0114\n*\f*\16*\u0117\13*\3*\3*\3*\3*\3*\3+\3+\5+\u0120\n+\3+\3+"+
		"\4\u0108\u0115\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2\3\2\6\4\2$$^^\3\2c|\3\2"+
		"\62;\5\2\13\f\17\17\"\"\2\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3W\3\2\2\2\5]\3\2\2\2\7a\3\2\2\2\tg\3\2"+
		"\2\2\13m\3\2\2\2\rr\3\2\2\2\17x\3\2\2\2\21{\3\2\2\2\23\u0080\3\2\2\2\25"+
		"\u0085\3\2\2\2\27\u008a\3\2\2\2\31\u008e\3\2\2\2\33\u0092\3\2\2\2\35\u009a"+
		"\3\2\2\2\37\u009d\3\2\2\2!\u00a0\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2"+
		"\'\u00a8\3\2\2\2)\u00ac\3\2\2\2+\u00b0\3\2\2\2-\u00b4\3\2\2\2/\u00b7\3"+
		"\2\2\2\61\u00ba\3\2\2\2\63\u00be\3\2\2\2\65\u00c1\3\2\2\2\67\u00c5\3\2"+
		"\2\29\u00c9\3\2\2\2;\u00cd\3\2\2\2=\u00d1\3\2\2\2?\u00d5\3\2\2\2A\u00d8"+
		"\3\2\2\2C\u00da\3\2\2\2E\u00dc\3\2\2\2G\u00ef\3\2\2\2I\u00f2\3\2\2\2K"+
		"\u00f7\3\2\2\2M\u00fc\3\2\2\2O\u0102\3\2\2\2Q\u0104\3\2\2\2S\u010f\3\2"+
		"\2\2U\u011d\3\2\2\2WX\7d\2\2XY\7g\2\2YZ\7i\2\2Z[\7k\2\2[\\\7p\2\2\\\4"+
		"\3\2\2\2]^\7g\2\2^_\7p\2\2_`\7f\2\2`\6\3\2\2\2ab\7k\2\2bc\7p\2\2cd\7r"+
		"\2\2de\7w\2\2ef\7v\2\2f\b\3\2\2\2gh\7r\2\2hi\7t\2\2ij\7k\2\2jk\7p\2\2"+
		"kl\7v\2\2l\n\3\2\2\2mn\7g\2\2no\7p\2\2op\7f\2\2pq\7n\2\2q\f\3\2\2\2rs"+
		"\7y\2\2st\7j\2\2tu\7k\2\2uv\7n\2\2vw\7g\2\2w\16\3\2\2\2xy\7k\2\2yz\7h"+
		"\2\2z\20\3\2\2\2{|\7v\2\2|}\7j\2\2}~\7g\2\2~\177\7p\2\2\177\22\3\2\2\2"+
		"\u0080\u0081\7g\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\u0084"+
		"\7g\2\2\u0084\24\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7k\2\2\u0088\u0089\7h\2\2\u0089\26\3\2\2\2\u008a\u008b\7h\2\2\u008b\u008c"+
		"\7q\2\2\u008c\u008d\7t\2\2\u008d\30\3\2\2\2\u008e\u008f\7n\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7v\2\2\u0091\32\3\2\2\2\u0092\u0093\7f\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7e\2\2\u0095\u0096\7n\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\34\3\2\2\2\u009a\u009b\7d\2\2\u009b"+
		"\u009c\7g\2\2\u009c\36\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f\7q\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7q\2\2\u00a2\"\3\2\2\2\u00a3"+
		"\u00a4\7.\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7s\2\2\u00a7"+
		"&\3\2\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7s\2\2\u00ab"+
		"(\3\2\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7g\2\2\u00af"+
		"*\3\2\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		",\3\2\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7v\2\2\u00b6.\3\2\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7v\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc"+
		"\7p\2\2\u00bc\u00bd\7f\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8"+
		"\7f\2\2\u00c88\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc"+
		"\7d\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0<\3\2\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4"+
		"\7x\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00d7\7\60\2\2\u00d7"+
		"@\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9B\3\2\2\2\u00da\u00db\7+\2\2\u00dbD"+
		"\3\2\2\2\u00dc\u00e1\7$\2\2\u00dd\u00e0\5U+\2\u00de\u00e0\n\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e5\7$\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7t\2\2\u00e8"+
		"\u00e9\7w\2\2\u00e9\u00f0\7g\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7c\2\2"+
		"\u00ec\u00ed\7n\2\2\u00ed\u00ee\7u\2\2\u00ee\u00f0\7g\2\2\u00ef\u00e6"+
		"\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0H\3\2\2\2\u00f1\u00f3\t\3\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5J\3\2\2\2\u00f6\u00f8\t\4\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faL\3\2\2\2\u00fb"+
		"\u00fd\t\5\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\'\2\2\u0101"+
		"N\3\2\2\2\u0102\u0103\13\2\2\2\u0103P\3\2\2\2\u0104\u0108\7%\2\2\u0105"+
		"\u0107\13\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\7\f\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b)\3\2\u010eR\3\2\2\2\u010f"+
		"\u0110\7\61\2\2\u0110\u0111\7,\2\2\u0111\u0115\3\2\2\2\u0112\u0114\13"+
		"\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7,"+
		"\2\2\u0119\u011a\7\61\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b*\3\2\u011c"+
		"T\3\2\2\2\u011d\u011f\7^\2\2\u011e\u0120\7\17\2\2\u011f\u011e\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\f\2\2\u0122V\3"+
		"\2\2\2\f\2\u00df\u00e1\u00ef\u00f4\u00f9\u00fe\u0108\u0115\u011f\4\b\2"+
		"\2\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}