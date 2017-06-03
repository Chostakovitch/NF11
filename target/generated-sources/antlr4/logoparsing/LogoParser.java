// Generated from Logo.g4 by ANTLR 4.4

  package logoparsing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, INT=37, NOM=38, WS=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'rends'", "'!='", "'fin'", "'='", "'pour'", "'<='", 
		"'\"'", "'fpos'", "'bc'", "'OU'", "'('", "'*'", "'td'", "'repete'", "'tantque'", 
		"'re'", "'tg'", "'fcc'", "'lc'", "'hasard'", "'si'", "'av'", "':'", "'>='", 
		"'donne'", "'['", "'<'", "']'", "'>'", "'loop'", "')'", "'ET'", "'+'", 
		"'ve'", "'-'", "INT", "NOM", "WS"
	};
	public static final int
		RULE_programme = 0, RULE_liste_instructions = 1, RULE_declaration = 2, 
		RULE_instruction = 3, RULE_exp = 4, RULE_expbool = 5;
	public static final String[] ruleNames = {
		"programme", "liste_instructions", "declaration", "instruction", "exp", 
		"expbool"
	};

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammeContext extends ParserRuleContext {
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProgramme(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(12); declaration();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18); liste_instructions();
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

	public static class Liste_instructionsContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public Liste_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterListe_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitListe_instructions(this);
		}
	}

	public final Liste_instructionsContext liste_instructions() throws RecognitionException {
		Liste_instructionsContext _localctx = new Liste_instructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_liste_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20); instruction();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__26) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__19) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__14) | (1L << T__13) | (1L << T__10) | (1L << T__1) | (1L << NOM))) != 0) );
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

	public static class DeclarationContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> NOM() { return getTokens(LogoParser.NOM); }
		public TerminalNode NOM(int i) {
			return getToken(LogoParser.NOM, i);
		}
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(T__30);
			setState(26); match(NOM);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(27); match(T__12);
				setState(28); match(NOM);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); liste_instructions();
			setState(37);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(35); match(T__34);
				setState(36); exp(0);
				}
			}

			setState(39); match(T__32);
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PoseContext extends InstructionContext {
		public PoseContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPose(this);
		}
	}
	public static class ClearContext extends InstructionContext {
		public ClearContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitClear(this);
		}
	}
	public static class AppelprocedureContext extends InstructionContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode NOM() { return getToken(LogoParser.NOM, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AppelprocedureContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAppelprocedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAppelprocedure(this);
		}
	}
	public static class CouleurContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CouleurContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCouleur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCouleur(this);
		}
	}
	public static class DonneContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NOM() { return getToken(LogoParser.NOM, 0); }
		public DonneContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDonne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDonne(this);
		}
	}
	public static class TdContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TdContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTd(this);
		}
	}
	public static class TgContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TgContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTg(this);
		}
	}
	public static class TantqueContext extends InstructionContext {
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public TantqueContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterTantque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitTantque(this);
		}
	}
	public static class AvContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AvContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAv(this);
		}
	}
	public static class RepeteContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Liste_instructionsContext liste_instructions() {
			return getRuleContext(Liste_instructionsContext.class,0);
		}
		public RepeteContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRepete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRepete(this);
		}
	}
	public static class SiContext extends InstructionContext {
		public Liste_instructionsContext liste_instructions(int i) {
			return getRuleContext(Liste_instructionsContext.class,i);
		}
		public List<Liste_instructionsContext> liste_instructions() {
			return getRuleContexts(Liste_instructionsContext.class);
		}
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public SiContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSi(this);
		}
	}
	public static class ReculeContext extends InstructionContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReculeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRecule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRecule(this);
		}
	}
	public static class LeveContext extends InstructionContext {
		public LeveContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLeve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLeve(this);
		}
	}
	public static class PositionContext extends InstructionContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PositionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPosition(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		int _la;
		try {
			int _alt;
			setState(92);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new AvContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41); match(T__13);
				setState(42); exp(0);
				}
				break;
			case T__22:
				_localctx = new TdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43); match(T__22);
				setState(44); exp(0);
				}
				break;
			case T__18:
				_localctx = new TgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45); match(T__18);
				setState(46); exp(0);
				}
				break;
			case T__16:
				_localctx = new LeveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47); match(T__16);
				}
				break;
			case T__26:
				_localctx = new PoseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48); match(T__26);
				}
				break;
			case T__1:
				_localctx = new ClearContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(49); match(T__1);
				}
				break;
			case T__19:
				_localctx = new ReculeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(50); match(T__19);
				setState(51); exp(0);
				}
				break;
			case T__17:
				_localctx = new CouleurContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(52); match(T__17);
				setState(53); exp(0);
				}
				break;
			case T__27:
				_localctx = new PositionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(54); match(T__27);
				setState(55); exp(0);
				setState(56); exp(0);
				}
				break;
			case T__21:
				_localctx = new RepeteContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(58); match(T__21);
				setState(59); exp(0);
				setState(60); match(T__9);
				setState(61); liste_instructions();
				setState(62); match(T__7);
				}
				break;
			case T__10:
				_localctx = new DonneContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(64); match(T__10);
				setState(65); match(T__28);
				setState(66); match(NOM);
				setState(67); exp(0);
				}
				break;
			case T__14:
				_localctx = new SiContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(68); match(T__14);
				setState(69); expbool(0);
				setState(70); match(T__9);
				setState(71); liste_instructions();
				setState(72); match(T__7);
				setState(77);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(73); match(T__9);
					setState(74); liste_instructions();
					setState(75); match(T__7);
					}
				}

				}
				break;
			case T__20:
				_localctx = new TantqueContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(79); match(T__20);
				setState(80); expbool(0);
				setState(81); match(T__9);
				setState(82); liste_instructions();
				setState(83); match(T__7);
				}
				break;
			case NOM:
				_localctx = new AppelprocedureContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(85); match(NOM);
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(86); exp(0);
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AppelfonctionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode NOM() { return getToken(LogoParser.NOM, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AppelfonctionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAppelfonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAppelfonction(this);
		}
	}
	public static class MulContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MulContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMul(this);
		}
	}
	public static class VarContext extends ExpContext {
		public TerminalNode NOM() { return getToken(LogoParser.NOM, 0); }
		public VarContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVar(this);
		}
	}
	public static class LoopContext extends ExpContext {
		public LoopContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLoop(this);
		}
	}
	public static class ParentheseContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParentheseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterParenthese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitParenthese(this);
		}
	}
	public static class SumContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SumContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSum(this);
		}
	}
	public static class HasardContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public HasardContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterHasard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitHasard(this);
		}
	}
	public static class IntContext extends ExpContext {
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
		public IntContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInt(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch (_input.LA(1)) {
			case T__15:
				{
				_localctx = new HasardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(95); match(T__15);
				setState(96); exp(7);
				}
				break;
			case T__12:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97); match(T__12);
				setState(98); match(NOM);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99); match(INT);
				}
				break;
			case T__5:
				{
				_localctx = new LoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); match(T__5);
				}
				break;
			case T__24:
				{
				_localctx = new ParentheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); match(T__24);
				setState(102); exp(0);
				setState(103); match(T__4);
				}
				break;
			case NOM:
				{
				_localctx = new AppelfonctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105); match(NOM);
				setState(106); match(T__24);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__15) | (1L << T__12) | (1L << T__5) | (1L << INT) | (1L << NOM))) != 0)) {
					{
					{
					setState(107); exp(0);
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113); match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(117);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(118); exp(7);
						}
						break;
					case 2:
						{
						_localctx = new SumContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(120);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__0) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(121); exp(6);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpboolContext extends ParserRuleContext {
		public ExpboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expbool; }
	 
		public ExpboolContext() { }
		public void copyFrom(ExpboolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OuContext extends ExpboolContext {
		public List<ExpboolContext> expbool() {
			return getRuleContexts(ExpboolContext.class);
		}
		public ExpboolContext expbool(int i) {
			return getRuleContext(ExpboolContext.class,i);
		}
		public OuContext(ExpboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitOu(this);
		}
	}
	public static class CondContext extends ExpboolContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CondContext(ExpboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCond(this);
		}
	}
	public static class EtContext extends ExpboolContext {
		public List<ExpboolContext> expbool() {
			return getRuleContexts(ExpboolContext.class);
		}
		public ExpboolContext expbool(int i) {
			return getRuleContext(ExpboolContext.class,i);
		}
		public EtContext(ExpboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterEt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitEt(this);
		}
	}

	public final ExpboolContext expbool() throws RecognitionException {
		return expbool(0);
	}

	private ExpboolContext expbool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpboolContext _localctx = new ExpboolContext(_ctx, _parentState);
		ExpboolContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expbool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CondContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(128); exp(0);
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__31) | (1L << T__29) | (1L << T__11) | (1L << T__8) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(130); exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new EtContext(new ExpboolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expbool);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133); match(T__3);
						setState(134); expbool(3);
						}
						break;
					case 2:
						{
						_localctx = new OuContext(new ExpboolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expbool);
						setState(135);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(136); match(T__25);
						setState(137); expbool(2);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return exp_sempred((ExpContext)_localctx, predIndex);
		case 5: return expbool_sempred((ExpboolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expbool_sempred(ExpboolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0092\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2"+
		"\3\2\3\2\3\3\6\3\30\n\3\r\3\16\3\31\3\4\3\4\3\4\3\4\7\4 \n\4\f\4\16\4"+
		"#\13\4\3\4\3\4\3\4\5\4(\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\5\5_\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\5\6u\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\2\4"+
		"\n\f\b\2\4\6\b\n\f\2\5\4\2\3\3\17\17\4\2$$&&\b\2\5\5\7\7\t\t\33\33\36"+
		"\36  \u00a8\2\21\3\2\2\2\4\27\3\2\2\2\6\33\3\2\2\2\b^\3\2\2\2\nt\3\2\2"+
		"\2\f\u0081\3\2\2\2\16\20\5\6\4\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2"+
		"\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\5\4\3\2\25\3\3\2"+
		"\2\2\26\30\5\b\5\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\5\3\2\2\2\33\34\7\b\2\2\34!\7(\2\2\35\36\7\32\2\2\36 \7(\2\2\37"+
		"\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$\'\5"+
		"\4\3\2%&\7\4\2\2&(\5\n\6\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\6\2\2*"+
		"\7\3\2\2\2+,\7\31\2\2,_\5\n\6\2-.\7\20\2\2._\5\n\6\2/\60\7\24\2\2\60_"+
		"\5\n\6\2\61_\7\26\2\2\62_\7\f\2\2\63_\7%\2\2\64\65\7\23\2\2\65_\5\n\6"+
		"\2\66\67\7\25\2\2\67_\5\n\6\289\7\13\2\29:\5\n\6\2:;\5\n\6\2;_\3\2\2\2"+
		"<=\7\21\2\2=>\5\n\6\2>?\7\35\2\2?@\5\4\3\2@A\7\37\2\2A_\3\2\2\2BC\7\34"+
		"\2\2CD\7\n\2\2DE\7(\2\2E_\5\n\6\2FG\7\30\2\2GH\5\f\7\2HI\7\35\2\2IJ\5"+
		"\4\3\2JO\7\37\2\2KL\7\35\2\2LM\5\4\3\2MN\7\37\2\2NP\3\2\2\2OK\3\2\2\2"+
		"OP\3\2\2\2P_\3\2\2\2QR\7\22\2\2RS\5\f\7\2ST\7\35\2\2TU\5\4\3\2UV\7\37"+
		"\2\2V_\3\2\2\2W[\7(\2\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2"+
		"\2\2\\_\3\2\2\2][\3\2\2\2^+\3\2\2\2^-\3\2\2\2^/\3\2\2\2^\61\3\2\2\2^\62"+
		"\3\2\2\2^\63\3\2\2\2^\64\3\2\2\2^\66\3\2\2\2^8\3\2\2\2^<\3\2\2\2^B\3\2"+
		"\2\2^F\3\2\2\2^Q\3\2\2\2^W\3\2\2\2_\t\3\2\2\2`a\b\6\1\2ab\7\27\2\2bu\5"+
		"\n\6\tcd\7\32\2\2du\7(\2\2eu\7\'\2\2fu\7!\2\2gh\7\16\2\2hi\5\n\6\2ij\7"+
		"\"\2\2ju\3\2\2\2kl\7(\2\2lp\7\16\2\2mo\5\n\6\2nm\3\2\2\2or\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2su\7\"\2\2t`\3\2\2\2tc\3\2\2\2te\3"+
		"\2\2\2tf\3\2\2\2tg\3\2\2\2tk\3\2\2\2u~\3\2\2\2vw\f\b\2\2wx\t\2\2\2x}\5"+
		"\n\6\tyz\f\7\2\2z{\t\3\2\2{}\5\n\6\b|v\3\2\2\2|y\3\2\2\2}\u0080\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\13\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\b"+
		"\7\1\2\u0082\u0083\5\n\6\2\u0083\u0084\t\4\2\2\u0084\u0085\5\n\6\2\u0085"+
		"\u008e\3\2\2\2\u0086\u0087\f\4\2\2\u0087\u0088\7#\2\2\u0088\u008d\5\f"+
		"\7\5\u0089\u008a\f\3\2\2\u008a\u008b\7\r\2\2\u008b\u008d\5\f\7\4\u008c"+
		"\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\r\3\2\2\2\u0090\u008e\3\2\2\2\17\21\31"+
		"!\'O[^pt|~\u008c\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}