// Generated from D:/University/MT/ParserGenerator/src\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULLABLE=1, TRASH=2, NONTERM=3, TERM=4, OR=5, DOT=6, OPENTRIANG=7, CLOSETRIANG=8, 
		ARROW=9, REGEXP=10, OPEN_ATTR=11, CLOSE_ATTR=12, ASSIGN=13, COMMA=14, 
		DOTS=15, CODE=16, ARGCODE=17, OPENBR=18, CLOSEBR=19, OPENPAR=20, CLOSEPAR=21, 
		WS=22, END=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NULLABLE", "TRASH", "NONTERM", "TERM", "OR", "DOT", "OPENTRIANG", "CLOSETRIANG", 
			"ARROW", "REGEXP", "OPEN_ATTR", "CLOSE_ATTR", "ASSIGN", "COMMA", "DOTS", 
			"CODE", "ARGCODE", "OPENBR", "CLOSEBR", "OPENPAR", "CLOSEPAR", "WS", 
			"END"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?'", "'skip'", null, null, "'|'", "'.'", "'<'", "'>'", "'=>'", 
			null, "'{{'", "'}}'", "':='", "','", "':'", null, null, "'('", "')'", 
			"'{'", "'}'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NULLABLE", "TRASH", "NONTERM", "TERM", "OR", "DOT", "OPENTRIANG", 
			"CLOSETRIANG", "ARROW", "REGEXP", "OPEN_ATTR", "CLOSE_ATTR", "ASSIGN", 
			"COMMA", "DOTS", "CODE", "ARGCODE", "OPENBR", "CLOSEBR", "OPENPAR", "CLOSEPAR", 
			"WS", "END"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\7\5B"+
		"\n\5\f\5\16\5E\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\7\13T\n\13\f\13\16\13W\13\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\6\21j\n\21\r\21\16\21k\3\21\5"+
		"\21o\n\21\7\21q\n\21\f\21\16\21t\13\21\3\21\3\21\3\22\3\22\6\22z\n\22"+
		"\r\22\16\22{\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6"+
		"\27\u0089\n\27\r\27\16\27\u008a\3\27\3\27\3\30\3\30\4U{\2\31\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\3\2\b\3\2c|\5\2\62;C\\c|\3\2C\\\4\2C\\c"+
		"|\4\2}}\177\177\5\2\13\f\17\17\"\"\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2"+
		"\78\3\2\2\2\t?\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2"+
		"\23N\3\2\2\2\25Q\3\2\2\2\27Z\3\2\2\2\31]\3\2\2\2\33`\3\2\2\2\35c\3\2\2"+
		"\2\37e\3\2\2\2!g\3\2\2\2#w\3\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0083"+
		"\3\2\2\2+\u0085\3\2\2\2-\u0088\3\2\2\2/\u008e\3\2\2\2\61\62\7A\2\2\62"+
		"\4\3\2\2\2\63\64\7u\2\2\64\65\7m\2\2\65\66\7k\2\2\66\67\7r\2\2\67\6\3"+
		"\2\2\28<\t\2\2\29;\t\3\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\b"+
		"\3\2\2\2><\3\2\2\2?C\t\4\2\2@B\t\5\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2D\n\3\2\2\2EC\3\2\2\2FG\7~\2\2G\f\3\2\2\2HI\7\60\2\2I\16\3\2"+
		"\2\2JK\7>\2\2K\20\3\2\2\2LM\7@\2\2M\22\3\2\2\2NO\7?\2\2OP\7@\2\2P\24\3"+
		"\2\2\2QU\7$\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3"+
		"\2\2\2WU\3\2\2\2XY\7$\2\2Y\26\3\2\2\2Z[\7}\2\2[\\\7}\2\2\\\30\3\2\2\2"+
		"]^\7\177\2\2^_\7\177\2\2_\32\3\2\2\2`a\7<\2\2ab\7?\2\2b\34\3\2\2\2cd\7"+
		".\2\2d\36\3\2\2\2ef\7<\2\2f \3\2\2\2gr\7}\2\2hj\n\6\2\2ih\3\2\2\2jk\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\5!\21\2nm\3\2\2\2no\3\2\2\2oq\3"+
		"\2\2\2pi\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7"+
		"\177\2\2v\"\3\2\2\2wy\5%\23\2xz\13\2\2\2yx\3\2\2\2z{\3\2\2\2{|\3\2\2\2"+
		"{y\3\2\2\2|}\3\2\2\2}~\5\'\24\2~$\3\2\2\2\177\u0080\7*\2\2\u0080&\3\2"+
		"\2\2\u0081\u0082\7+\2\2\u0082(\3\2\2\2\u0083\u0084\7}\2\2\u0084*\3\2\2"+
		"\2\u0085\u0086\7\177\2\2\u0086,\3\2\2\2\u0087\u0089\t\7\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\27\2\2\u008d.\3\2\2\2\u008e\u008f\7=\2\2"+
		"\u008f\60\3\2\2\2\13\2<CUknr{\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}