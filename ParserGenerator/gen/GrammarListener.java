// Generated from D:/University/MT/ParserGenerator/src\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void enterGram(GrammarParser.GramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void exitGram(GrammarParser.GramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#synth}.
	 * @param ctx the parse tree
	 */
	void enterSynth(GrammarParser.SynthContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#synth}.
	 * @param ctx the parse tree
	 */
	void exitSynth(GrammarParser.SynthContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rulee}.
	 * @param ctx the parse tree
	 */
	void enterRulee(GrammarParser.RuleeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rulee}.
	 * @param ctx the parse tree
	 */
	void exitRulee(GrammarParser.RuleeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#skip}.
	 * @param ctx the parse tree
	 */
	void enterSkip(GrammarParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#skip}.
	 * @param ctx the parse tree
	 */
	void exitSkip(GrammarParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(GrammarParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(GrammarParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminal(GrammarParser.NonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminal(GrammarParser.NonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(GrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(GrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(GrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(GrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terminalValue}.
	 * @param ctx the parse tree
	 */
	void enterTerminalValue(GrammarParser.TerminalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terminalValue}.
	 * @param ctx the parse tree
	 */
	void exitTerminalValue(GrammarParser.TerminalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(GrammarParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(GrammarParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(GrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(GrammarParser.FieldContext ctx);
}