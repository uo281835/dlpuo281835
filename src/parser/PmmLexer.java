// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANK=1, COMMENT=2, MULTILINE_COMMENT=3, ID=4, CHAR_CONSTANT=5, REAL_CONSTANT=6, 
		INT_CONSTANT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "EXPONENTIAL", "DECIMAL_EXPONENTIAL", "NUMERO", "BLANK", "NEW_LINE", 
			"TABULATOR", "COMMENT", "MULTILINE_COMMENT", "ID", "CHAR_CONSTANT", "REAL_CONSTANT", 
			"DOUBLE_CONSTANT_ENTERO_EXPONENCIAL", "DOUBLE_CONSTANT_DOS_INTS", "DOUBLE_CONSTANT_ENTERO", 
			"DOUBLE_CONSTANT_FRACCION", "INT_CONSTANT", "ASCII_CHAR_CONSTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANK", "COMMENT", "MULTILINE_COMMENT", "ID", "CHAR_CONSTANT", 
			"REAL_CONSTANT", "INT_CONSTANT"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\u0004\u0000\u0007\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0004\u00034\b\u0003\u000b\u0003\f\u00035\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007H\b\u0007\n\u0007"+
		"\f\u0007K\t\u0007\u0001\u0007\u0003\u0007N\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bW\b\b\n\b\f\bZ\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\td\b"+
		"\t\n\t\f\tg\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\no\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bu\b"+
		"\u000b\u0001\f\u0001\f\u0003\fy\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0003"+
		"\u000f\u0086\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u008c\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0091"+
		"\b\u0010\u000b\u0010\f\u0010\u0092\u0003\u0010\u0095\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u009b\b\u0011\u000b\u0011"+
		"\f\u0011\u009c\u0001\u0011\u0001\u0011\u0002IX\u0000\u0012\u0001\u0000"+
		"\u0003\u0000\u0005\u0000\u0007\u0000\t\u0001\u000b\u0000\r\u0000\u000f"+
		"\u0002\u0011\u0003\u0013\u0004\u0015\u0005\u0017\u0006\u0019\u0000\u001b"+
		"\u0000\u001d\u0000\u001f\u0000!\u0007#\u0000\u0001\u0000\t\u0002\u0000"+
		"AZaz\u0002\u0000EEee\u0002\u0000++--\u0001\u000009\u0003\u0000\t\n\r\r"+
		"  \u0002\u0001\n\n\r\r\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000"+
		"19\u00a6\u0000\t\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003"+
		"\'\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00073\u0001"+
		"\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000"+
		"\u0000\r@\u0001\u0000\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011"+
		"Q\u0001\u0000\u0000\u0000\u0013a\u0001\u0000\u0000\u0000\u0015n\u0001"+
		"\u0000\u0000\u0000\u0017t\u0001\u0000\u0000\u0000\u0019v\u0001\u0000\u0000"+
		"\u0000\u001b}\u0001\u0000\u0000\u0000\u001d\u0081\u0001\u0000\u0000\u0000"+
		"\u001f\u008b\u0001\u0000\u0000\u0000!\u0094\u0001\u0000\u0000\u0000#\u0096"+
		"\u0001\u0000\u0000\u0000%&\u0007\u0000\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\')\u0007\u0001\u0000\u0000(*\u0007\u0002\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+,\u0003\u0007\u0003\u0000,\u0004\u0001\u0000\u0000\u0000-/\u0003\u0007"+
		"\u0003\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0003\u0003\u0001\u00001\u0006\u0001\u0000\u0000"+
		"\u000024\u0007\u0003\u0000\u000032\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\b\u0001"+
		"\u0000\u0000\u000078\u0007\u0004\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0006\u0004\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005\'\u0000"+
		"\u0000<=\u0005\\\u0000\u0000=>\u0005n\u0000\u0000>?\u0005\'\u0000\u0000"+
		"?\f\u0001\u0000\u0000\u0000@A\u0005\'\u0000\u0000AB\u0005\\\u0000\u0000"+
		"BC\u0005t\u0000\u0000CD\u0005\'\u0000\u0000D\u000e\u0001\u0000\u0000\u0000"+
		"EI\u0005#\u0000\u0000FH\t\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0007\u0005"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0006"+
		"\u0007\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QR\u0005\"\u0000\u0000"+
		"RS\u0005\"\u0000\u0000ST\u0005\"\u0000\u0000TX\u0001\u0000\u0000\u0000"+
		"UW\t\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\"\u0000\u0000\\]\u0005\"\u0000"+
		"\u0000]^\u0005\"\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0006\b\u0000"+
		"\u0000`\u0012\u0001\u0000\u0000\u0000ae\u0007\u0006\u0000\u0000bd\u0007"+
		"\u0007\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0014\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\'\u0000\u0000ij\t\u0000"+
		"\u0000\u0000jo\u0005\'\u0000\u0000ko\u0003\u000b\u0005\u0000lo\u0003\r"+
		"\u0006\u0000mo\u0003#\u0011\u0000nh\u0001\u0000\u0000\u0000nk\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0016"+
		"\u0001\u0000\u0000\u0000pu\u0003\u0019\f\u0000qu\u0003\u001b\r\u0000r"+
		"u\u0003\u001d\u000e\u0000su\u0003\u001f\u000f\u0000tp\u0001\u0000\u0000"+
		"\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000u\u0018\u0001\u0000\u0000\u0000vx\u0003\u0007\u0003\u0000"+
		"wy\u0005.\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z{\u0007\u0001\u0000\u0000{|\u0003\u0007\u0003"+
		"\u0000|\u001a\u0001\u0000\u0000\u0000}~\u0003\u0007\u0003\u0000~\u007f"+
		"\u0005.\u0000\u0000\u007f\u0080\u0003\u0007\u0003\u0000\u0080\u001c\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0003\u0007\u0003\u0000\u0082\u0083\u0005"+
		".\u0000\u0000\u0083\u001e\u0001\u0000\u0000\u0000\u0084\u0086\u0003!\u0010"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005.\u0000\u0000"+
		"\u0088\u008c\u0003\u0005\u0002\u0000\u0089\u008a\u0005.\u0000\u0000\u008a"+
		"\u008c\u0003\u0007\u0003\u0000\u008b\u0085\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c \u0001\u0000\u0000\u0000\u008d\u0095"+
		"\u00050\u0000\u0000\u008e\u0090\u0007\b\u0000\u0000\u008f\u0091\u0007"+
		"\u0003\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008d\u0001"+
		"\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0095\"\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\'\u0000\u0000\u0097\u0098\u0005\\\u0000"+
		"\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0007\u0003"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\'\u0000\u0000"+
		"\u009f$\u0001\u0000\u0000\u0000\u0010\u0000).5IMXentx\u0085\u008b\u0092"+
		"\u0094\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}