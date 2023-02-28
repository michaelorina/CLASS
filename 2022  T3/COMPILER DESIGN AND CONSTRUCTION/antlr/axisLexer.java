// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class axisLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, COMMENT=13, WS=14, ID=15, INT=16, CHAR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "COMMENT", "WS", "ID", "INT", "CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'{'", "'}'", "'while'", "'('", "')'", "'return'", 
			"','", "'int'", "'char'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "COMMENT", "WS", "ID", "INT", "CHAR"
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


	public axisLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "axis.g4"; }

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
		"\u0004\u0000\u0011{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\fQ\b\f\n\f\f\fT\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0004\r\\\b\r\u000b\r\f\r]\u0001\r\u0001\r"+
		"\u0001\u000e\u0004\u000ec\b\u000e\u000b\u000e\f\u000ed\u0001\u000e\u0005"+
		"\u000eh\b\u000e\n\u000e\f\u000ek\t\u000e\u0001\u000f\u0004\u000fn\b\u000f"+
		"\u000b\u000f\f\u000fo\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010v\b\u0010\u000b\u0010\f\u0010w\u0001\u0010\u0001\u0010\u0001"+
		"R\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0005\u0002"+
		"\u0000\t\n\r\r\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0001"+
		"\u0000\'\'\u0080\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003"+
		"%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007)\u0001"+
		"\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000"+
		"\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u0011"+
		"<\u0001\u0000\u0000\u0000\u0013>\u0001\u0000\u0000\u0000\u0015B\u0001"+
		"\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019L\u0001\u0000\u0000"+
		"\u0000\u001b[\u0001\u0000\u0000\u0000\u001db\u0001\u0000\u0000\u0000\u001f"+
		"m\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000#$\u0005;\u0000\u0000"+
		"$\u0002\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&\u0004\u0001\u0000"+
		"\u0000\u0000\'(\u0005{\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005"+
		"}\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005w\u0000\u0000,-\u0005"+
		"h\u0000\u0000-.\u0005i\u0000\u0000./\u0005l\u0000\u0000/0\u0005e\u0000"+
		"\u00000\n\u0001\u0000\u0000\u000012\u0005(\u0000\u00002\f\u0001\u0000"+
		"\u0000\u000034\u0005)\u0000\u00004\u000e\u0001\u0000\u0000\u000056\u0005"+
		"r\u0000\u000067\u0005e\u0000\u000078\u0005t\u0000\u000089\u0005u\u0000"+
		"\u00009:\u0005r\u0000\u0000:;\u0005n\u0000\u0000;\u0010\u0001\u0000\u0000"+
		"\u0000<=\u0005,\u0000\u0000=\u0012\u0001\u0000\u0000\u0000>?\u0005i\u0000"+
		"\u0000?@\u0005n\u0000\u0000@A\u0005t\u0000\u0000A\u0014\u0001\u0000\u0000"+
		"\u0000BC\u0005c\u0000\u0000CD\u0005h\u0000\u0000DE\u0005a\u0000\u0000"+
		"EF\u0005r\u0000\u0000F\u0016\u0001\u0000\u0000\u0000GH\u0005v\u0000\u0000"+
		"HI\u0005o\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005d\u0000\u0000K\u0018"+
		"\u0001\u0000\u0000\u0000LM\u0005&\u0000\u0000MN\u0005*\u0000\u0000NR\u0001"+
		"\u0000\u0000\u0000OQ\t\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005*\u0000\u0000"+
		"VW\u0005&\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0006\f\u0000\u0000"+
		"Y\u001a\u0001\u0000\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0006\r\u0001\u0000`\u001c"+
		"\u0001\u0000\u0000\u0000ac\u0007\u0001\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ei\u0001\u0000\u0000\u0000fh\u0007\u0002\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\u001e\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000ln\u0007\u0003\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"p \u0001\u0000\u0000\u0000qr\u0005\'\u0000\u0000rs\u0005 \u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tv\b\u0004\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0005\'\u0000\u0000z\"\u0001\u0000"+
		"\u0000\u0000\u0007\u0000R]diow\u0002\u0000\u0001\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}