// Generated from grammar/Logo.g4 by ANTLR 4.6

  package logoparsing;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(LogoParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(LogoParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void enterListe_instructions(LogoParser.Liste_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void exitListe_instructions(LogoParser.Liste_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LogoParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LogoParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAv(LogoParser.AvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAv(LogoParser.AvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTd(LogoParser.TdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTd(LogoParser.TdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTg(LogoParser.TgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTg(LogoParser.TgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLeve(LogoParser.LeveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLeve(LogoParser.LeveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pose}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPose(LogoParser.PoseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pose}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPose(LogoParser.PoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clear}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterClear(LogoParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitClear(LogoParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recule}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRecule(LogoParser.ReculeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recule}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRecule(LogoParser.ReculeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code couleur}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCouleur(LogoParser.CouleurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code couleur}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCouleur(LogoParser.CouleurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPosition(LogoParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPosition(LogoParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRepete(LogoParser.RepeteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRepete(LogoParser.RepeteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code donne}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDonne(LogoParser.DonneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code donne}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDonne(LogoParser.DonneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code si}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSi(LogoParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code si}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSi(LogoParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tantque}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTantque(LogoParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tantque}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTantque(LogoParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appelprocedure}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAppelprocedure(LogoParser.AppelprocedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appelprocedure}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAppelprocedure(LogoParser.AppelprocedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appelfonction}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAppelfonction(LogoParser.AppelfonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appelfonction}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAppelfonction(LogoParser.AppelfonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMul(LogoParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMul(LogoParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVar(LogoParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVar(LogoParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLoop(LogoParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLoop(LogoParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenthese(LogoParser.ParentheseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenthese(LogoParser.ParentheseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSum(LogoParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSum(LogoParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterHasard(LogoParser.HasardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitHasard(LogoParser.HasardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInt(LogoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInt(LogoParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ou}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void enterOu(LogoParser.OuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ou}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void exitOu(LogoParser.OuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void enterCond(LogoParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void exitCond(LogoParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code et}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void enterEt(LogoParser.EtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code et}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void exitEt(LogoParser.EtContext ctx);
}