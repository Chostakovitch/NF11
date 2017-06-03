// Generated from grammar/Logo.g4 by ANTLR 4.6

  package logoparsing;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(LogoParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_instructions(LogoParser.Liste_instructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LogoParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAv(LogoParser.AvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTd(LogoParser.TdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTg(LogoParser.TgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeve(LogoParser.LeveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pose}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPose(LogoParser.PoseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClear(LogoParser.ClearContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recule}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecule(LogoParser.ReculeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code couleur}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCouleur(LogoParser.CouleurContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(LogoParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepete(LogoParser.RepeteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code donne}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDonne(LogoParser.DonneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code si}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LogoParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tantque}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTantque(LogoParser.TantqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appelprocedure}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppelprocedure(LogoParser.AppelprocedureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appelfonction}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppelfonction(LogoParser.AppelfonctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(LogoParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LogoParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LogoParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthese(LogoParser.ParentheseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(LogoParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasard(LogoParser.HasardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LogoParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ou}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOu(LogoParser.OuContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LogoParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code et}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEt(LogoParser.EtContext ctx);
}