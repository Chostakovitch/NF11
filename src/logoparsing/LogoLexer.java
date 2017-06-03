// Generated from grammar/Logo.g4 by ANTLR 4.6

  package logoparsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT=37, NOM=38, WS=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "INT", "NOM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pour'", "':'", "'rends'", "'fin'", "'av'", "'td'", "'tg'", "'lc'", 
		"'bc'", "'ve'", "'re'", "'fcc'", "'fpos'", "'repete'", "'['", "']'", "'donne'", 
		"'\"'", "'si'", "'tantque'", "'hasard'", "'*'", "'/'", "'+'", "'-'", "'loop'", 
		"'('", "')'", "'<'", "'>'", "'>='", "'<='", "'='", "'!='", "'ET'", "'OU'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT", "NOM", "WS"
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


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\7&\u00cf\n&\f&\16&\u00d2\13&"+
		"\5&\u00d4\n&\3\'\6\'\u00d7\n\'\r\'\16\'\u00d8\3(\6(\u00dc\n(\r(\16(\u00dd"+
		"\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\6\3\2\63;\3\2\62;\3\2c|\5\2\13\f"+
		"\17\17\"\"\u00e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2"+
		"\2\2\5V\3\2\2\2\7X\3\2\2\2\t^\3\2\2\2\13b\3\2\2\2\re\3\2\2\2\17h\3\2\2"+
		"\2\21k\3\2\2\2\23n\3\2\2\2\25q\3\2\2\2\27t\3\2\2\2\31w\3\2\2\2\33{\3\2"+
		"\2\2\35\u0080\3\2\2\2\37\u0087\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%"+
		"\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0096\3\2\2\2+\u009e\3\2\2\2-\u00a5\3"+
		"\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad\3\2\2"+
		"\2\67\u00b2\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00b8\3\2\2\2?\u00ba"+
		"\3\2\2\2A\u00bd\3\2\2\2C\u00c0\3\2\2\2E\u00c2\3\2\2\2G\u00c5\3\2\2\2I"+
		"\u00c8\3\2\2\2K\u00d3\3\2\2\2M\u00d6\3\2\2\2O\u00db\3\2\2\2QR\7r\2\2R"+
		"S\7q\2\2ST\7w\2\2TU\7t\2\2U\4\3\2\2\2VW\7<\2\2W\6\3\2\2\2XY\7t\2\2YZ\7"+
		"g\2\2Z[\7p\2\2[\\\7f\2\2\\]\7u\2\2]\b\3\2\2\2^_\7h\2\2_`\7k\2\2`a\7p\2"+
		"\2a\n\3\2\2\2bc\7c\2\2cd\7x\2\2d\f\3\2\2\2ef\7v\2\2fg\7f\2\2g\16\3\2\2"+
		"\2hi\7v\2\2ij\7i\2\2j\20\3\2\2\2kl\7n\2\2lm\7e\2\2m\22\3\2\2\2no\7d\2"+
		"\2op\7e\2\2p\24\3\2\2\2qr\7x\2\2rs\7g\2\2s\26\3\2\2\2tu\7t\2\2uv\7g\2"+
		"\2v\30\3\2\2\2wx\7h\2\2xy\7e\2\2yz\7e\2\2z\32\3\2\2\2{|\7h\2\2|}\7r\2"+
		"\2}~\7q\2\2~\177\7u\2\2\177\34\3\2\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7r\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085"+
		"\u0086\7g\2\2\u0086\36\3\2\2\2\u0087\u0088\7]\2\2\u0088 \3\2\2\2\u0089"+
		"\u008a\7_\2\2\u008a\"\3\2\2\2\u008b\u008c\7f\2\2\u008c\u008d\7q\2\2\u008d"+
		"\u008e\7p\2\2\u008e\u008f\7p\2\2\u008f\u0090\7g\2\2\u0090$\3\2\2\2\u0091"+
		"\u0092\7$\2\2\u0092&\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7k\2\2\u0095"+
		"(\3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098\7c\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7s\2\2\u009b\u009c\7w\2\2\u009c\u009d\7g\2\2"+
		"\u009d*\3\2\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7u\2"+
		"\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7f\2\2\u00a4,\3\2"+
		"\2\2\u00a5\u00a6\7,\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8\60\3"+
		"\2\2\2\u00a9\u00aa\7-\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\64"+
		"\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7r\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7*\2\2\u00b38\3\2\2\2\u00b4"+
		"\u00b5\7+\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7<\3\2\2\2\u00b8\u00b9"+
		"\7@\2\2\u00b9>\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc\7?\2\2\u00bc@\3"+
		"\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7?\2\2\u00bfB\3\2\2\2\u00c0\u00c1"+
		"\7?\2\2\u00c1D\3\2\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4\7?\2\2\u00c4F\3"+
		"\2\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7\7V\2\2\u00c7H\3\2\2\2\u00c8\u00c9"+
		"\7Q\2\2\u00c9\u00ca\7W\2\2\u00caJ\3\2\2\2\u00cb\u00d4\7\62\2\2\u00cc\u00d0"+
		"\t\2\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d4L\3\2\2\2\u00d5\u00d7"+
		"\t\4\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9N\3\2\2\2\u00da\u00dc\t\5\2\2\u00db\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\b(\2\2\u00e0P\3\2\2\2\7\2\u00d0\u00d3\u00d8\u00dd"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}