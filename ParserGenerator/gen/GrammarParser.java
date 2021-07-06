// Generated from D:/University/MT/ParserGenerator/src\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULLABLE=1, TRASH=2, NONTERM=3, TERM=4, OR=5, DOT=6, OPENTRIANG=7, CLOSETRIANG=8, 
		ARROW=9, REGEXP=10, OPEN_ATTR=11, CLOSE_ATTR=12, ASSIGN=13, COMMA=14, 
		DOTS=15, CODE=16, ARGCODE=17, OPENBR=18, CLOSEBR=19, OPENPAR=20, CLOSEPAR=21, 
		WS=22, END=23;
	public static final int
		RULE_gram = 0, RULE_synth = 1, RULE_start = 2, RULE_rules = 3, RULE_rulee = 4, 
		RULE_skip = 5, RULE_terminal = 6, RULE_nonTerminal = 7, RULE_grammarRule = 8, 
		RULE_arg = 9, RULE_code = 10, RULE_terminalValue = 11, RULE_fields = 12, 
		RULE_field = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"gram", "synth", "start", "rules", "rulee", "skip", "terminal", "nonTerminal", 
			"grammarRule", "arg", "code", "terminalValue", "fields", "field"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GramContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public SynthContext synth() {
			return getRuleContext(SynthContext.class,0);
		}
		public GramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GramContext gram() throws RecognitionException {
		GramContext _localctx = new GramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			start();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENTRIANG) {
				{
				setState(29);
				synth();
				}
			}

			setState(32);
			rules();
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

	public static class SynthContext extends ParserRuleContext {
		public TerminalNode OPENTRIANG() { return getToken(GrammarParser.OPENTRIANG, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode CLOSETRIANG() { return getToken(GrammarParser.CLOSETRIANG, 0); }
		public SynthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSynth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSynth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSynth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthContext synth() throws RecognitionException {
		SynthContext _localctx = new SynthContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_synth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(OPENTRIANG);
			setState(35);
			fields();
			setState(36);
			match(CLOSETRIANG);
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode CLOSETRIANG() { return getToken(GrammarParser.CLOSETRIANG, 0); }
		public TerminalNode NONTERM() { return getToken(GrammarParser.NONTERM, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(CLOSETRIANG);
			setState(39);
			match(NONTERM);
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

	public static class RulesContext extends ParserRuleContext {
		public List<RuleeContext> rulee() {
			return getRuleContexts(RuleeContext.class);
		}
		public RuleeContext rulee(int i) {
			return getRuleContext(RuleeContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				rulee();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONTERM) | (1L << TERM) | (1L << REGEXP))) != 0) );
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

	public static class RuleeContext extends ParserRuleContext {
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public NonTerminalContext nonTerminal() {
			return getRuleContext(NonTerminalContext.class,0);
		}
		public SkipContext skip() {
			return getRuleContext(SkipContext.class,0);
		}
		public RuleeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRulee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRulee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRulee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleeContext rulee() throws RecognitionException {
		RuleeContext _localctx = new RuleeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rulee);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				terminal();
				}
				break;
			case NONTERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				nonTerminal();
				}
				break;
			case REGEXP:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				skip();
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

	public static class SkipContext extends ParserRuleContext {
		public TerminalNode REGEXP() { return getToken(GrammarParser.REGEXP, 0); }
		public TerminalNode ARROW() { return getToken(GrammarParser.ARROW, 0); }
		public TerminalNode TRASH() { return getToken(GrammarParser.TRASH, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public SkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipContext skip() throws RecognitionException {
		SkipContext _localctx = new SkipContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_skip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(REGEXP);
			setState(52);
			match(ARROW);
			setState(53);
			match(TRASH);
			setState(54);
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

	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public TerminalValueContext terminalValue() {
			return getRuleContext(TerminalValueContext.class,0);
		}
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public TerminalNode OPEN_ATTR() { return getToken(GrammarParser.OPEN_ATTR, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode CLOSE_ATTR() { return getToken(GrammarParser.CLOSE_ATTR, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(TERM);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_ATTR) {
				{
				setState(57);
				match(OPEN_ATTR);
				setState(58);
				fields();
				setState(59);
				match(CLOSE_ATTR);
				}
			}

			setState(63);
			match(ASSIGN);
			setState(64);
			terminalValue();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(65);
				code();
				}
			}

			setState(68);
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

	public static class NonTerminalContext extends ParserRuleContext {
		public TerminalNode NONTERM() { return getToken(GrammarParser.NONTERM, 0); }
		public TerminalNode ARROW() { return getToken(GrammarParser.ARROW, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public TerminalNode OPEN_ATTR() { return getToken(GrammarParser.OPEN_ATTR, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode CLOSE_ATTR() { return getToken(GrammarParser.CLOSE_ATTR, 0); }
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}
		public NonTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNonTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalContext nonTerminal() throws RecognitionException {
		NonTerminalContext _localctx = new NonTerminalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nonTerminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(NONTERM);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_ATTR) {
				{
				setState(71);
				match(OPEN_ATTR);
				setState(72);
				fields();
				setState(73);
				match(CLOSE_ATTR);
				}
			}

			setState(77);
			match(ARROW);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				grammarRule();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONTERM) | (1L << TERM) | (1L << CODE))) != 0) );
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(83);
				match(OR);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					grammarRule();
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONTERM) | (1L << TERM) | (1L << CODE))) != 0) );
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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

	public static class GrammarRuleContext extends ParserRuleContext {
		public TerminalNode NONTERM() { return getToken(GrammarParser.NONTERM, 0); }
		public TerminalNode OPEN_ATTR() { return getToken(GrammarParser.OPEN_ATTR, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode CLOSE_ATTR() { return getToken(GrammarParser.CLOSE_ATTR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_grammarRule);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONTERM:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(NONTERM);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_ATTR) {
					{
					setState(97);
					match(OPEN_ATTR);
					setState(98);
					arg();
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(99);
						match(COMMA);
						setState(100);
						arg();
						}
						}
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(106);
					match(CLOSE_ATTR);
					}
				}

				}
				break;
			case TERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(TERM);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_ATTR) {
					{
					setState(111);
					match(OPEN_ATTR);
					setState(112);
					arg();
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(113);
						match(COMMA);
						setState(114);
						arg();
						}
						}
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(120);
					match(CLOSE_ATTR);
					}
				}

				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				code();
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ARGCODE() { return getToken(GrammarParser.ARGCODE, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ARGCODE);
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

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(CODE);
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

	public static class TerminalValueContext extends ParserRuleContext {
		public TerminalNode REGEXP() { return getToken(GrammarParser.REGEXP, 0); }
		public TerminalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerminalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerminalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerminalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalValueContext terminalValue() throws RecognitionException {
		TerminalValueContext _localctx = new TerminalValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_terminalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(REGEXP);
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

	public static class FieldsContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			field();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				field();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode NONTERM() { return getToken(GrammarParser.NONTERM, 0); }
		public TerminalNode DOTS() { return getToken(GrammarParser.DOTS, 0); }
		public TerminalNode TERM() { return getToken(GrammarParser.TERM, 0); }
		public TerminalNode NULLABLE() { return getToken(GrammarParser.NULLABLE, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(NONTERM);
			setState(142);
			match(DOTS);
			setState(143);
			match(TERM);
			setState(144);
			match(NULLABLE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\5\2!\n\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6\5-\n\5\r\5\16\5.\3\6\3\6\3\6\5\6\64\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b@\n\b\3\b\3\b\3\b\5\bE\n\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\t\3\t\6\tR\n\t\r\t\16\tS\3\t\3"+
		"\t\6\tX\n\t\r\t\16\tY\7\t\\\n\t\f\t\16\t_\13\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\7\nh\n\n\f\n\16\nk\13\n\3\n\3\n\5\no\n\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"v\n\n\f\n\16\ny\13\n\3\n\3\n\5\n}\n\n\3\n\5\n\u0080\n\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16\u008e\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2"+
		"\2\2\u0097\2\36\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b,\3\2\2\2\n\63\3\2\2\2"+
		"\f\65\3\2\2\2\16:\3\2\2\2\20H\3\2\2\2\22\177\3\2\2\2\24\u0081\3\2\2\2"+
		"\26\u0083\3\2\2\2\30\u0085\3\2\2\2\32\u0087\3\2\2\2\34\u008f\3\2\2\2\36"+
		" \5\6\4\2\37!\5\4\3\2 \37\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\5\b\5\2#\3\3"+
		"\2\2\2$%\7\t\2\2%&\5\32\16\2&\'\7\n\2\2\'\5\3\2\2\2()\7\n\2\2)*\7\5\2"+
		"\2*\7\3\2\2\2+-\5\n\6\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\t\3\2"+
		"\2\2\60\64\5\16\b\2\61\64\5\20\t\2\62\64\5\f\7\2\63\60\3\2\2\2\63\61\3"+
		"\2\2\2\63\62\3\2\2\2\64\13\3\2\2\2\65\66\7\f\2\2\66\67\7\13\2\2\678\7"+
		"\4\2\289\7\31\2\29\r\3\2\2\2:?\7\6\2\2;<\7\r\2\2<=\5\32\16\2=>\7\16\2"+
		"\2>@\3\2\2\2?;\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\17\2\2BD\5\30\r\2CE\5\26"+
		"\f\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\31\2\2G\17\3\2\2\2HM\7\5\2\2IJ"+
		"\7\r\2\2JK\5\32\16\2KL\7\16\2\2LN\3\2\2\2MI\3\2\2\2MN\3\2\2\2NO\3\2\2"+
		"\2OQ\7\13\2\2PR\5\22\n\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T]\3\2"+
		"\2\2UW\7\7\2\2VX\5\22\n\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3"+
		"\2\2\2[U\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a"+
		"\7\31\2\2a\21\3\2\2\2bn\7\5\2\2cd\7\r\2\2di\5\24\13\2ef\7\20\2\2fh\5\24"+
		"\13\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7"+
		"\16\2\2mo\3\2\2\2nc\3\2\2\2no\3\2\2\2o\u0080\3\2\2\2p|\7\6\2\2qr\7\r\2"+
		"\2rw\5\24\13\2st\7\20\2\2tv\5\24\13\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx"+
		"\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\16\2\2{}\3\2\2\2|q\3\2\2\2|}\3\2\2\2"+
		"}\u0080\3\2\2\2~\u0080\5\26\f\2\177b\3\2\2\2\177p\3\2\2\2\177~\3\2\2\2"+
		"\u0080\23\3\2\2\2\u0081\u0082\7\23\2\2\u0082\25\3\2\2\2\u0083\u0084\7"+
		"\22\2\2\u0084\27\3\2\2\2\u0085\u0086\7\f\2\2\u0086\31\3\2\2\2\u0087\u008c"+
		"\5\34\17\2\u0088\u0089\7\20\2\2\u0089\u008b\5\34\17\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\33\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u0091\7\21\2"+
		"\2\u0091\u0092\7\6\2\2\u0092\u0093\7\3\2\2\u0093\35\3\2\2\2\21 .\63?D"+
		"MSY]inw|\177\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}