// Generated from Logo.g4 by ANTLR 4.4

  package logoparsing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull LogoParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull LogoParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appelprocedure}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAppelprocedure(@NotNull LogoParser.AppelprocedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appelprocedure}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAppelprocedure(@NotNull LogoParser.AppelprocedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code couleur}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCouleur(@NotNull LogoParser.CouleurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code couleur}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCouleur(@NotNull LogoParser.CouleurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenthese(@NotNull LogoParser.ParentheseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenthese(@NotNull LogoParser.ParentheseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSum(@NotNull LogoParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSum(@NotNull LogoParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull LogoParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull LogoParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code donne}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDonne(@NotNull LogoParser.DonneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code donne}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDonne(@NotNull LogoParser.DonneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRepete(@NotNull LogoParser.RepeteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRepete(@NotNull LogoParser.RepeteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code si}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSi(@NotNull LogoParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code si}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSi(@NotNull LogoParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull LogoParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull LogoParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recule}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRecule(@NotNull LogoParser.ReculeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recule}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRecule(@NotNull LogoParser.ReculeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLeve(@NotNull LogoParser.LeveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLeve(@NotNull LogoParser.LeveContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(@NotNull LogoParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(@NotNull LogoParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pose}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPose(@NotNull LogoParser.PoseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pose}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPose(@NotNull LogoParser.PoseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull LogoParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull LogoParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ou}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void enterOu(@NotNull LogoParser.OuContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ou}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void exitOu(@NotNull LogoParser.OuContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clear}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterClear(@NotNull LogoParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clear}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitClear(@NotNull LogoParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull LogoParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull LogoParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull LogoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull LogoParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code et}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void enterEt(@NotNull LogoParser.EtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code et}
	 * labeled alternative in {@link LogoParser#expbool}.
	 * @param ctx the parse tree
	 */
	void exitEt(@NotNull LogoParser.EtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTd(@NotNull LogoParser.TdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTd(@NotNull LogoParser.TdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void enterListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void exitListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTg(@NotNull LogoParser.TgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTg(@NotNull LogoParser.TgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tantque}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTantque(@NotNull LogoParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tantque}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTantque(@NotNull LogoParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appelfonction}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAppelfonction(@NotNull LogoParser.AppelfonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appelfonction}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAppelfonction(@NotNull LogoParser.AppelfonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAv(@NotNull LogoParser.AvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAv(@NotNull LogoParser.AvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPosition(@NotNull LogoParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPosition(@NotNull LogoParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterHasard(@NotNull LogoParser.HasardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitHasard(@NotNull LogoParser.HasardContext ctx);
}