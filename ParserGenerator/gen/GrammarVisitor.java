// Generated from D:/University/MT/ParserGenerator/src\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGram(GrammarParser.GramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#synth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynth(GrammarParser.SynthContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(GrammarParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rulee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulee(GrammarParser.RuleeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#skip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(GrammarParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(GrammarParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#nonTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminal(GrammarParser.NonTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(GrammarParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(GrammarParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#terminalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalValue(GrammarParser.TerminalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(GrammarParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(GrammarParser.FieldContext ctx);
}