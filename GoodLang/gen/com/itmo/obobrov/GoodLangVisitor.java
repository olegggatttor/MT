// Generated from D:/University/MT/GoodLang/src/com/itmo/obobrov\GoodLang.g4 by ANTLR 4.8
package com.itmo.obobrov;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GoodLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GoodLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GoodLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#entities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntities(GoodLangParser.EntitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GoodLangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(GoodLangParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(GoodLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(GoodLangParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#whenBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenBody(GoodLangParser.WhenBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#elseBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBranch(GoodLangParser.ElseBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#whenCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCond(GoodLangParser.WhenCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(GoodLangParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(GoodLangParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(GoodLangParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(GoodLangParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(GoodLangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#orCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(GoodLangParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#andCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(GoodLangParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GoodLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(GoodLangParser.CmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GoodLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#multiplier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplier(GoodLangParser.MultiplierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(GoodLangParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodLangParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GoodLangParser.CallContext ctx);
}