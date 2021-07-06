// Generated from D:/University/MT/GoodLang/src/com/itmo/obobrov\GoodLang.g4 by ANTLR 4.8
package com.itmo.obobrov;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoodLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OTHERWISE=1, WHEN=2, DO=3, READ=4, WRITE=5, RET=6, ADD=7, SUB=8, MUL=9, 
		DIV=10, ASSIGN=11, WHILE=12, CONST=13, TRUE=14, FALSE=15, EQ=16, LT=17, 
		GT=18, LE=19, GE=20, NE=21, NOT=22, AND=23, OR=24, LSCOPE=25, RSCOPE=26, 
		LPAR=27, RPAR=28, DOTS=29, COMMA=30, AT=31, NAME=32, NL=33, BLANK=34;
	public static final int
		RULE_program = 0, RULE_entities = 1, RULE_function = 2, RULE_argument = 3, 
		RULE_body = 4, RULE_when = 5, RULE_whenBody = 6, RULE_elseBranch = 7, 
		RULE_whenCond = 8, RULE_read = 9, RULE_write = 10, RULE_ret = 11, RULE_assigment = 12, 
		RULE_loop = 13, RULE_orCondition = 14, RULE_andCondition = 15, RULE_condition = 16, 
		RULE_cmp = 17, RULE_expression = 18, RULE_multiplier = 19, RULE_element = 20, 
		RULE_call = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "entities", "function", "argument", "body", "when", "whenBody", 
			"elseBranch", "whenCond", "read", "write", "ret", "assigment", "loop", 
			"orCondition", "andCondition", "condition", "cmp", "expression", "multiplier", 
			"element", "call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'otherwise'", "'when'", "'do'", "'<-'", "'->'", "'ret'", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'while'", null, "'True'", "'False'", "'=='", 
			"'<'", "'>'", "'<='", "'>='", "'!='", "'!'", "'and'", "'or'", "'{'", 
			"'}'", "'('", "')'", "':'", "','", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OTHERWISE", "WHEN", "DO", "READ", "WRITE", "RET", "ADD", "SUB", 
			"MUL", "DIV", "ASSIGN", "WHILE", "CONST", "TRUE", "FALSE", "EQ", "LT", 
			"GT", "LE", "GE", "NE", "NOT", "AND", "OR", "LSCOPE", "RSCOPE", "LPAR", 
			"RPAR", "DOTS", "COMMA", "AT", "NAME", "NL", "BLANK"
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
	public String getGrammarFileName() { return "GoodLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoodLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> EOF() { return getTokens(GoodLangParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(GoodLangParser.EOF, i);
		}
		public List<TerminalNode> NL() { return getTokens(GoodLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GoodLangParser.NL, i);
		}
		public List<EntitiesContext> entities() {
			return getRuleContexts(EntitiesContext.class);
		}
		public EntitiesContext entities(int i) {
			return getRuleContext(EntitiesContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(44);
				match(NL);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(50);
				entities();
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NL:
					{
					setState(52); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(51);
						match(NL);
						}
						}
						setState(54); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NL );
					}
					break;
				case EOF:
					{
					setState(56);
					match(EOF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(EOF);
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

	public static class EntitiesContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public EntitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterEntities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitEntities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitEntities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntitiesContext entities() throws RecognitionException {
		EntitiesContext _localctx = new EntitiesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			function();
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
		public TerminalNode AT() { return getToken(GoodLangParser.AT, 0); }
		public TerminalNode NAME() { return getToken(GoodLangParser.NAME, 0); }
		public TerminalNode LSCOPE() { return getToken(GoodLangParser.LSCOPE, 0); }
		public TerminalNode RSCOPE() { return getToken(GoodLangParser.RSCOPE, 0); }
		public TerminalNode LPAR() { return getToken(GoodLangParser.LPAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(GoodLangParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoodLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoodLangParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(AT);
			setState(69);
			match(NAME);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(70);
				match(LPAR);
				setState(71);
				argument();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(72);
					match(COMMA);
					setState(73);
					argument();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(RPAR);
				}
			}

			setState(83);
			match(LSCOPE);
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(84);
				body();
				}
				break;
			}
			setState(87);
			match(RSCOPE);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GoodLangParser.NAME, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(NAME);
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

	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(GoodLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GoodLangParser.NL, i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<RetContext> ret() {
			return getRuleContexts(RetContext.class);
		}
		public RetContext ret(int i) {
			return getRuleContext(RetContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<ReadContext> read() {
			return getRuleContexts(ReadContext.class);
		}
		public ReadContext read(int i) {
			return getRuleContext(ReadContext.class,i);
		}
		public List<WriteContext> write() {
			return getRuleContexts(WriteContext.class);
		}
		public WriteContext write(int i) {
			return getRuleContext(WriteContext.class,i);
		}
		public List<WhenContext> when() {
			return getRuleContexts(WhenContext.class);
		}
		public WhenContext when(int i) {
			return getRuleContext(WhenContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(91);
						loop();
						}
						break;
					case 2:
						{
						setState(92);
						assigment();
						}
						break;
					case 3:
						{
						setState(93);
						ret();
						}
						break;
					case 4:
						{
						setState(94);
						call();
						}
						break;
					case 5:
						{
						setState(95);
						read();
						}
						break;
					case 6:
						{
						setState(96);
						write();
						}
						break;
					case 7:
						{
						setState(97);
						when();
						}
						break;
					case 8:
						{
						}
						break;
					}
					setState(101);
					match(NL);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(GoodLangParser.WHEN, 0); }
		public TerminalNode LSCOPE() { return getToken(GoodLangParser.LSCOPE, 0); }
		public WhenBodyContext whenBody() {
			return getRuleContext(WhenBodyContext.class,0);
		}
		public TerminalNode RSCOPE() { return getToken(GoodLangParser.RSCOPE, 0); }
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_when);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WHEN);
			setState(108);
			match(LSCOPE);
			setState(109);
			whenBody();
			setState(110);
			match(RSCOPE);
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

	public static class WhenBodyContext extends ParserRuleContext {
		public List<WhenCondContext> whenCond() {
			return getRuleContexts(WhenCondContext.class);
		}
		public WhenCondContext whenCond(int i) {
			return getRuleContext(WhenCondContext.class,i);
		}
		public ElseBranchContext elseBranch() {
			return getRuleContext(ElseBranchContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GoodLangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GoodLangParser.NL, i);
		}
		public WhenBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterWhenBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitWhenBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitWhenBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenBodyContext whenBody() throws RecognitionException {
		WhenBodyContext _localctx = new WhenBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whenBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					whenCond();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(118);
				elseBranch();
				}
				break;
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(121);
				match(NL);
				}
				}
				setState(126);
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

	public static class ElseBranchContext extends ParserRuleContext {
		public TerminalNode OTHERWISE() { return getToken(GoodLangParser.OTHERWISE, 0); }
		public TerminalNode DO() { return getToken(GoodLangParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LSCOPE() { return getToken(GoodLangParser.LSCOPE, 0); }
		public TerminalNode RSCOPE() { return getToken(GoodLangParser.RSCOPE, 0); }
		public TerminalNode NL() { return getToken(GoodLangParser.NL, 0); }
		public ElseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterElseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitElseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitElseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBranchContext elseBranch() throws RecognitionException {
		ElseBranchContext _localctx = new ElseBranchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseBranch);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OTHERWISE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(127);
				match(OTHERWISE);
				setState(128);
				match(DO);
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LSCOPE:
					{
					{
					setState(129);
					match(LSCOPE);
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(130);
						body();
						}
						break;
					}
					setState(133);
					match(RSCOPE);
					}
					}
					break;
				case WHEN:
				case RET:
				case ADD:
				case SUB:
				case WHILE:
				case CONST:
				case RSCOPE:
				case LPAR:
				case NAME:
				case NL:
					{
					setState(134);
					body();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(NL);
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

	public static class WhenCondContext extends ParserRuleContext {
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(GoodLangParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LSCOPE() { return getToken(GoodLangParser.LSCOPE, 0); }
		public TerminalNode RSCOPE() { return getToken(GoodLangParser.RSCOPE, 0); }
		public TerminalNode NL() { return getToken(GoodLangParser.NL, 0); }
		public WhenCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterWhenCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitWhenCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitWhenCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenCondContext whenCond() throws RecognitionException {
		WhenCondContext _localctx = new WhenCondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whenCond);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case CONST:
			case TRUE:
			case FALSE:
			case NOT:
			case LPAR:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(140);
				orCondition();
				setState(141);
				match(DO);
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LSCOPE:
					{
					{
					setState(142);
					match(LSCOPE);
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(143);
						body();
						}
						break;
					}
					setState(146);
					match(RSCOPE);
					}
					}
					break;
				case OTHERWISE:
				case WHEN:
				case RET:
				case ADD:
				case SUB:
				case WHILE:
				case CONST:
				case TRUE:
				case FALSE:
				case NOT:
				case RSCOPE:
				case LPAR:
				case NAME:
				case NL:
					{
					setState(147);
					body();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(NL);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GoodLangParser.NAME, 0); }
		public TerminalNode READ() { return getToken(GoodLangParser.READ, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(NAME);
			setState(154);
			match(READ);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(GoodLangParser.WRITE, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			expression();
			setState(157);
			match(WRITE);
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(GoodLangParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(RET);
			setState(160);
			expression();
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

	public static class AssigmentContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GoodLangParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodLangParser.NAME, i);
		}
		public TerminalNode ASSIGN() { return getToken(GoodLangParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoodLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoodLangParser.COMMA, i);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assigment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(NAME);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				match(NAME);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(ASSIGN);
			setState(171);
			expression();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				expression();
				}
				}
				setState(178);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GoodLangParser.WHILE, 0); }
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public TerminalNode LSCOPE() { return getToken(GoodLangParser.LSCOPE, 0); }
		public TerminalNode RSCOPE() { return getToken(GoodLangParser.RSCOPE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(WHILE);
			setState(180);
			orCondition();
			setState(181);
			match(LSCOPE);
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(182);
				body();
				}
				break;
			}
			setState(185);
			match(RSCOPE);
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

	public static class OrConditionContext extends ParserRuleContext {
		public List<AndConditionContext> andCondition() {
			return getRuleContexts(AndConditionContext.class);
		}
		public AndConditionContext andCondition(int i) {
			return getRuleContext(AndConditionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GoodLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GoodLangParser.OR, i);
		}
		public OrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitOrCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		OrConditionContext _localctx = new OrConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			andCondition();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(188);
				match(OR);
				setState(189);
				andCondition();
				}
				}
				setState(194);
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

	public static class AndConditionContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(GoodLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GoodLangParser.AND, i);
		}
		public AndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		AndConditionContext _localctx = new AndConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_andCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			condition();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(196);
				match(AND);
				setState(197);
				condition();
				}
				}
				setState(202);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GoodLangParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(GoodLangParser.LPAR, 0); }
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(GoodLangParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(GoodLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GoodLangParser.FALSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(NOT);
				setState(204);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(LPAR);
				setState(206);
				orCondition();
				setState(207);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				expression();
				setState(210);
				cmp();
				setState(211);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(FALSE);
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

	public static class CmpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(GoodLangParser.EQ, 0); }
		public TerminalNode LT() { return getToken(GoodLangParser.LT, 0); }
		public TerminalNode GT() { return getToken(GoodLangParser.GT, 0); }
		public TerminalNode LE() { return getToken(GoodLangParser.LE, 0); }
		public TerminalNode GE() { return getToken(GoodLangParser.GE, 0); }
		public TerminalNode NE() { return getToken(GoodLangParser.NE, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << GE) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplierContext> multiplier() {
			return getRuleContexts(MultiplierContext.class);
		}
		public MultiplierContext multiplier(int i) {
			return getRuleContext(MultiplierContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(GoodLangParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(GoodLangParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(GoodLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(GoodLangParser.DIV, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			multiplier();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(220);
					match(MUL);
					setState(221);
					multiplier();
					}
					break;
				case DIV:
					{
					setState(222);
					match(DIV);
					setState(223);
					multiplier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(228);
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

	public static class MultiplierContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(GoodLangParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(GoodLangParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(GoodLangParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(GoodLangParser.SUB, i);
		}
		public MultiplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterMultiplier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitMultiplier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitMultiplier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplierContext multiplier() throws RecognitionException {
		MultiplierContext _localctx = new MultiplierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			element();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				setState(234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(230);
					match(ADD);
					setState(231);
					element();
					}
					break;
				case SUB:
					{
					setState(232);
					match(SUB);
					setState(233);
					element();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(238);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(GoodLangParser.SUB, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GoodLangParser.ADD, 0); }
		public TerminalNode CONST() { return getToken(GoodLangParser.CONST, 0); }
		public TerminalNode NAME() { return getToken(GoodLangParser.NAME, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(GoodLangParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(GoodLangParser.RPAR, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_element);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(239);
				match(SUB);
				setState(240);
				element();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(241);
				match(ADD);
				setState(242);
				element();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(CONST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(LPAR);
				setState(247);
				expression();
				setState(248);
				match(RPAR);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GoodLangParser.NAME, 0); }
		public TerminalNode LPAR() { return getToken(GoodLangParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GoodLangParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GoodLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GoodLangParser.COMMA, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodLangListener ) ((GoodLangListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodLangVisitor ) return ((GoodLangVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(NAME);
			setState(253);
			match(LPAR);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << CONST) | (1L << LPAR) | (1L << NAME))) != 0)) {
				{
				setState(254);
				expression();
				}
			}

			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257);
				match(COMMA);
				setState(258);
				expression();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(RPAR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\6\2\67\n\2\r\2\16\28\3\2\5\2<\n\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13"+
		"\4\3\4\3\4\5\4T\n\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6f\n\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\7\bt\n\b\f\b\16\bw\13\b\3\b\5\bz\n\b\3\b\7\b}\n\b\f\b\16\b\u0080"+
		"\13\b\3\t\3\t\3\t\3\t\5\t\u0086\n\t\3\t\3\t\5\t\u008a\n\t\3\t\5\t\u008d"+
		"\n\t\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3\n\3\n\5\n\u0097\n\n\3\n\5\n\u009a"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00a8"+
		"\n\16\f\16\16\16\u00ab\13\16\3\16\3\16\3\16\3\16\7\16\u00b1\n\16\f\16"+
		"\16\16\u00b4\13\16\3\17\3\17\3\17\3\17\5\17\u00ba\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20\u00c1\n\20\f\20\16\20\u00c4\13\20\3\21\3\21\3\21\7\21"+
		"\u00c9\n\21\f\21\16\21\u00cc\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00da\n\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00e3\n\24\f\24\16\24\u00e6\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00ed\n\25\f\25\16\25\u00f0\13\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00fd\n\26\3\27\3\27\3\27\5\27\u0102\n"+
		"\27\3\27\3\27\7\27\u0106\n\27\f\27\16\27\u0109\13\27\3\27\3\27\3\27\2"+
		"\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\22\27\2\u0122"+
		"\2\61\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\b[\3\2\2\2\nj\3\2\2\2\fm\3\2\2\2\16"+
		"u\3\2\2\2\20\u008c\3\2\2\2\22\u0099\3\2\2\2\24\u009b\3\2\2\2\26\u009e"+
		"\3\2\2\2\30\u00a1\3\2\2\2\32\u00a4\3\2\2\2\34\u00b5\3\2\2\2\36\u00bd\3"+
		"\2\2\2 \u00c5\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00dd\3\2\2\2(\u00e7"+
		"\3\2\2\2*\u00fc\3\2\2\2,\u00fe\3\2\2\2.\60\7#\2\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62?\3\2\2\2\63\61\3\2\2\2\64;\5\4\3\2\65"+
		"\67\7#\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:"+
		"<\7\2\2\3;\66\3\2\2\2;:\3\2\2\2<>\3\2\2\2=\64\3\2\2\2>A\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DE\5\6\4\2E\5\3"+
		"\2\2\2FG\7!\2\2GS\7\"\2\2HI\7\35\2\2IN\5\b\5\2JK\7 \2\2KM\5\b\5\2LJ\3"+
		"\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\36\2\2RT"+
		"\3\2\2\2SH\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\7\33\2\2VX\5\n\6\2WV\3\2\2\2"+
		"WX\3\2\2\2XY\3\2\2\2YZ\7\34\2\2Z\7\3\2\2\2[\\\7\"\2\2\\\t\3\2\2\2]f\5"+
		"\34\17\2^f\5\32\16\2_f\5\30\r\2`f\5,\27\2af\5\24\13\2bf\5\26\f\2cf\5\f"+
		"\7\2df\3\2\2\2e]\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2eb\3\2"+
		"\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2gi\7#\2\2he\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2k\13\3\2\2\2lj\3\2\2\2mn\7\4\2\2no\7\33\2\2op\5\16\b\2p"+
		"q\7\34\2\2q\r\3\2\2\2rt\5\22\n\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2xz\5\20\t\2yx\3\2\2\2yz\3\2\2\2z~\3\2\2\2{}\7#\2"+
		"\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\17\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0082\7\3\2\2\u0082\u0089\7\5\2\2\u0083\u0085\7\33\2\2"+
		"\u0084\u0086\5\n\6\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u008a\7\34\2\2\u0088\u008a\5\n\6\2\u0089\u0083\3\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008d\7#\2\2\u008c\u0081"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008d\21\3\2\2\2\u008e\u008f\5\36\20\2\u008f"+
		"\u0096\7\5\2\2\u0090\u0092\7\33\2\2\u0091\u0093\5\n\6\2\u0092\u0091\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\7\34\2\2\u0095"+
		"\u0097\5\n\6\2\u0096\u0090\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u009a\7#\2\2\u0099\u008e\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\23\3\2\2\2\u009b\u009c\7\"\2\2\u009c\u009d\7\6\2\2\u009d\25\3\2\2\2\u009e"+
		"\u009f\5&\24\2\u009f\u00a0\7\7\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\7\b\2"+
		"\2\u00a2\u00a3\5&\24\2\u00a3\31\3\2\2\2\u00a4\u00a9\7\"\2\2\u00a5\u00a6"+
		"\7 \2\2\u00a6\u00a8\7\"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ad\7\r\2\2\u00ad\u00b2\5&\24\2\u00ae\u00af\7 \2\2\u00af"+
		"\u00b1\5&\24\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\33\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6"+
		"\7\16\2\2\u00b6\u00b7\5\36\20\2\u00b7\u00b9\7\33\2\2\u00b8\u00ba\5\n\6"+
		"\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\7\34\2\2\u00bc\35\3\2\2\2\u00bd\u00c2\5 \21\2\u00be\u00bf\7\32\2\2\u00bf"+
		"\u00c1\5 \21\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ca"+
		"\5\"\22\2\u00c6\u00c7\7\31\2\2\u00c7\u00c9\5\"\22\2\u00c8\u00c6\3\2\2"+
		"\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb!"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\30\2\2\u00ce\u00da\5\"\22\2"+
		"\u00cf\u00d0\7\35\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\7\36\2\2\u00d2"+
		"\u00da\3\2\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d5\5$\23\2\u00d5\u00d6\5&"+
		"\24\2\u00d6\u00da\3\2\2\2\u00d7\u00da\7\20\2\2\u00d8\u00da\7\21\2\2\u00d9"+
		"\u00cd\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da#\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc%\3\2"+
		"\2\2\u00dd\u00e4\5(\25\2\u00de\u00df\7\13\2\2\u00df\u00e3\5(\25\2\u00e0"+
		"\u00e1\7\f\2\2\u00e1\u00e3\5(\25\2\u00e2\u00de\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\'\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ee\5*\26\2\u00e8\u00e9\7\t\2\2"+
		"\u00e9\u00ed\5*\26\2\u00ea\u00eb\7\n\2\2\u00eb\u00ed\5*\26\2\u00ec\u00e8"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef)\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\n\2\2"+
		"\u00f2\u00fd\5*\26\2\u00f3\u00f4\7\t\2\2\u00f4\u00fd\5*\26\2\u00f5\u00fd"+
		"\7\17\2\2\u00f6\u00fd\7\"\2\2\u00f7\u00fd\5,\27\2\u00f8\u00f9\7\35\2\2"+
		"\u00f9\u00fa\5&\24\2\u00fa\u00fb\7\36\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f1"+
		"\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc"+
		"\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd+\3\2\2\2\u00fe\u00ff\7\"\2\2"+
		"\u00ff\u0101\7\35\2\2\u0100\u0102\5&\24\2\u0101\u0100\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0107\3\2\2\2\u0103\u0104\7 \2\2\u0104\u0106\5&\24\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\36\2\2\u010b"+
		"-\3\2\2\2!\618;?NSWejuy~\u0085\u0089\u008c\u0092\u0096\u0099\u00a9\u00b2"+
		"\u00b9\u00c2\u00ca\u00d9\u00e2\u00e4\u00ec\u00ee\u00fc\u0101\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}