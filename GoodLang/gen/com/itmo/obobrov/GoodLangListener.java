// Generated from D:/University/MT/GoodLang/src/com/itmo/obobrov\GoodLang.g4 by ANTLR 4.8
package com.itmo.obobrov;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoodLangParser}.
 */
public interface GoodLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GoodLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GoodLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#entities}.
	 * @param ctx the parse tree
	 */
	void enterEntities(GoodLangParser.EntitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#entities}.
	 * @param ctx the parse tree
	 */
	void exitEntities(GoodLangParser.EntitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GoodLangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GoodLangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GoodLangParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GoodLangParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GoodLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GoodLangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(GoodLangParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(GoodLangParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#whenBody}.
	 * @param ctx the parse tree
	 */
	void enterWhenBody(GoodLangParser.WhenBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#whenBody}.
	 * @param ctx the parse tree
	 */
	void exitWhenBody(GoodLangParser.WhenBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void enterElseBranch(GoodLangParser.ElseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#elseBranch}.
	 * @param ctx the parse tree
	 */
	void exitElseBranch(GoodLangParser.ElseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#whenCond}.
	 * @param ctx the parse tree
	 */
	void enterWhenCond(GoodLangParser.WhenCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#whenCond}.
	 * @param ctx the parse tree
	 */
	void exitWhenCond(GoodLangParser.WhenCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GoodLangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GoodLangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(GoodLangParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(GoodLangParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(GoodLangParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(GoodLangParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(GoodLangParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(GoodLangParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GoodLangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GoodLangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(GoodLangParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(GoodLangParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(GoodLangParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(GoodLangParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GoodLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GoodLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(GoodLangParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(GoodLangParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GoodLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GoodLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#multiplier}.
	 * @param ctx the parse tree
	 */
	void enterMultiplier(GoodLangParser.MultiplierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#multiplier}.
	 * @param ctx the parse tree
	 */
	void exitMultiplier(GoodLangParser.MultiplierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(GoodLangParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(GoodLangParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodLangParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(GoodLangParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodLangParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(GoodLangParser.CallContext ctx);
}