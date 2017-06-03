package logoparsing;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import javafx.scene.canvas.Canvas;
import logogui.Log;
import logogui.Traceur;
import logoparsing.LogoParser.AppelfonctionContext;
import logoparsing.LogoParser.AppelprocedureContext;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.ClearContext;
import logoparsing.LogoParser.CondContext;
import logoparsing.LogoParser.CouleurContext;
import logoparsing.LogoParser.DeclarationContext;
import logoparsing.LogoParser.DonneContext;
import logoparsing.LogoParser.EtContext;
import logoparsing.LogoParser.ExpContext;
import logoparsing.LogoParser.HasardContext;
import logoparsing.LogoParser.IntContext;
import logoparsing.LogoParser.LeveContext;
import logoparsing.LogoParser.LoopContext;
import logoparsing.LogoParser.MulContext;
import logoparsing.LogoParser.OuContext;
import logoparsing.LogoParser.ParentheseContext;
import logoparsing.LogoParser.PoseContext;
import logoparsing.LogoParser.PositionContext;
import logoparsing.LogoParser.ReculeContext;
import logoparsing.LogoParser.RepeteContext;
import logoparsing.LogoParser.SiContext;
import logoparsing.LogoParser.SumContext;
import logoparsing.LogoParser.TantqueContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;
import logoparsing.LogoParser.VarContext;

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur traceur;
	ParseTreeProperty<Double> atts = new ParseTreeProperty<Double>();
	Stack<Integer> cpts = new Stack<>();
	Stack<SymbolTable> symbols = new Stack<>();
	Map<String, Procedure> procedures = new HashMap<>();

	public LogoTreeVisitor() {
		super();
		symbols.push(new SymbolTable());
	}
	public void initialize(Canvas g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
    }
	public void setAttValue(ParseTree node, double value) { 
		atts.put(node, value);
	}
	public double getAttValue(ParseTree node) { return atts.get(node); }
	
	@Override
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		traceur.avance(getAttValue(ctx.exp()));
		Log.append("visitAv " + getAttValue(ctx.exp()) + "\n");
		return 0;
	}
	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		traceur.td(getAttValue(ctx.exp()));
		Log.append("visitTd " + getAttValue(ctx.exp()) + "\n");
		return 0;
	}
	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		traceur.tg(getAttValue(ctx.exp()));
		Log.append("visitTg " + getAttValue(ctx.exp()) + "\n");
		return 0;
	}
	@Override
	public Integer visitLeve(LeveContext ctx) {
		traceur.leve();
		Log.append("visitLeve\n" );
		return 0;
	}
	@Override
	public Integer visitPose(PoseContext ctx) {
		traceur.pose();
		Log.append("visitPose\n" );
		return 0;
	}
	@Override
	public Integer visitClear(ClearContext ctx) {
		traceur.clear();
		Log.append("visitClear\n" );
		return 0;
	}
	@Override
	public Integer visitRecule(ReculeContext ctx) {
		visitChildren(ctx);
		traceur.recule(getAttValue(ctx.exp()));
		Log.append("visitRecule " + getAttValue(ctx.exp()) + "\n");
		return 0;
	}
	@Override
	public Integer visitCouleur(CouleurContext ctx) {
		visitChildren(ctx);
		traceur.couleur(getAttValue(ctx.exp()));
		Log.append("visitCouleur " + getAttValue(ctx.exp()) + "\n");
		return 0;
	}
	@Override
	public Integer visitPosition(PositionContext ctx) {
		visitChildren(ctx);
		traceur.pos(getAttValue(ctx.exp(0)), getAttValue(ctx.exp(1)));
		Log.append("visitPosition " + getAttValue(ctx.exp(0)) + " " + getAttValue(ctx.exp(1))+ "\n");
		return 0;
	}
	@Override
	public Integer visitMul(MulContext ctx) {
		visit(ctx.exp(0));
		double left = getAttValue(ctx.exp(0));
		visit(ctx.exp(1));
		double right = getAttValue(ctx.exp(1));
		double result = ctx.getChild(1).getText().equals("*") ? left * right : left / right;
		setAttValue(ctx, result);
		Log.append("visitMul " + left + " " + right + "\n");
		return 0;
	}
	
	@Override
	public Integer visitParenthese(ParentheseContext ctx) {
		visit(ctx.exp());
		setAttValue(ctx, getAttValue(ctx.exp()));
		Log.append("visitParenthese\n");
		return 0;
	}
	
	@Override
	public Integer visitSum(SumContext ctx) {
		visit(ctx.exp(0));
		double left = getAttValue(ctx.exp(0));
		visit(ctx.exp(1));
		double right = getAttValue(ctx.exp(1));
		double result = ctx.getChild(1).getText().equals("+") ? left + right : left - right;
		setAttValue(ctx, result);
		Log.append("visitSum " + left + " " + right + "\n");
		return 0;
	}
	
	@Override
	public Integer visitInt(IntContext ctx) {
		setAttValue(ctx, Integer.valueOf(ctx.INT().getText()));
		return 0;
	}
	@Override
	public Integer visitHasard(HasardContext ctx) {
		visit(ctx.exp());
		double value = Math.floor(Math.random() * getAttValue(ctx.exp()));
		setAttValue(ctx, value);
		Log.append("visitHasard " + value + "\n" );
		return 0;
	}
	@Override
	public Integer visitRepete(RepeteContext ctx) {
		visit(ctx.exp());
		int cpt = (int)getAttValue(ctx.exp());
		cpts.push(cpt);
		Log.append("visitRepete " + cpt + "\n" );
		for(int i = cpt; i > 0; --i) {
			cpts.pop();
			cpts.push(i);
			visit(ctx.liste_instructions());
		}
		cpts.pop();
		return 0;
	}
	
	@Override
	public Integer visitLoop(LoopContext ctx) {
		if(cpts.empty()) {
			System.err.println("ERROR : loop not set. Continuing with loop = 0");
			cpts.push(1);
		}
		setAttValue(ctx, cpts.peek());
		Log.append("loop is " + getAttValue(ctx) + "\n");
		return 0;
	}
	@Override
	public Integer visitDonne(DonneContext ctx) {
		String id = ctx.NOM().getText();
		visit(ctx.exp());
		double value = (double)getAttValue(ctx.exp());
		symbols.peek().setSymbol(id, value);
		Log.append("symbol " + id + " set to " + value + "\n");
		return 0;
	}
	@Override
	public Integer visitVar(VarContext ctx) {
		String id = ctx.NOM().getText();
		Double value = symbols.peek().getSymbol(id);
		if(value == null) {
			System.err.println("ERROR : mnemonic " + id + " not set. Continuing with " + id + " = 0");
			symbols.peek().setSymbol(id, 0);
			value = new Double(0);
		}
		setAttValue(ctx, value);
		Log.append("symbol " + id + " resolved to " + value + "\n");
		return 0;
	}
	@Override
	public Integer visitOu(OuContext ctx) {
		boolean left = visit(ctx.expbool(0)) == 1 ? true : false;
		boolean right = visit(ctx.expbool(1)) == 1 ? true : false;
		setAttValue(ctx, (left || right) ? 1 : 0);
		Log.append(left + " OU " + right + " = " + (left || right) + "\n");
		return 0;
	}
	@Override
	public Integer visitCond(CondContext ctx) {
		visit(ctx.exp(0));
		visit(ctx.exp(1));
		double left = getAttValue(ctx.exp(0));
		double right = getAttValue(ctx.exp(1));
		String op = ctx.getChild(1).getText();
		boolean res = false;
		if(op.equals("=")) res = (left == right); 
		else if(op.equals("!=")) res = (left != right);
		else if(op.equals(">")) res = (left > right);
		else if(op.equals("<")) res = (left < right);
		else if(op.equals("<=")) res = (left <= right);
		else if(op.equals(">=")) res = (left >= right);
		setAttValue(ctx, res ? 1 : 0);
		Log.append("" + left + " " + op + " " + right + " evaluated to " + res + "\n");
		return 0;
	}
	@Override
	public Integer visitEt(EtContext ctx) {
		visit(ctx.expbool(0));
		visit(ctx.expbool(1));
		boolean left = getAttValue(ctx.expbool(0)) == 1 ? true : false;
		boolean right = getAttValue(ctx.expbool(1)) == 1 ? true : false;
		setAttValue(ctx, (left && right) ? 1 : 0);
		Log.append(left + " ET " + right + " = " + (left && right)  + "\n");
		return 0;
	}
	@Override
	public Integer visitSi(SiContext ctx) {
		visit(ctx.expbool());
		boolean cond = getAttValue(ctx.expbool()) == 1 ? true : false;
		Log.append("if is " + cond + ", alternative exists : " + (ctx.liste_instructions().size() > 1) + "\n");
		if(cond) 
			visit(ctx.liste_instructions(0));
		//Existence d'une alternative, sinon on ne fait rien
		else if(!cond && ctx.liste_instructions().size() > 1) 
			visit(ctx.liste_instructions(1));
		return 0;
	}
	@Override
	public Integer visitTantque(TantqueContext ctx) {
		int cpt = 0;
		visit(ctx.expbool());
		while(getAttValue(ctx.expbool()) == 1) {
			visit(ctx.liste_instructions());
			visit(ctx.expbool());
			++cpt;
		}
		Log.append("tantque executed " + cpt + " times\n");
		return 0;
	}
	@Override
	public Integer visitDeclaration(DeclarationContext ctx) {
		String nom = ctx.NOM(0).getText();
		boolean isProcedure = (ctx.exp() == null);
		ExpContext exp = ctx.exp();
		Procedure proc = new Procedure(isProcedure, ctx.liste_instructions(), exp);
		for(int i = 1; i < ctx.NOM().size(); ++i)
			proc.getParameters().add(ctx.NOM(i).getText());
		procedures.put(nom, proc);
		String word = isProcedure ? "procedure" : "function";
		Log.append(word + " " + nom + " well declared\n");
		return 0;
	}
	@Override
	public Integer visitAppelprocedure(AppelprocedureContext ctx) {
		Procedure proc = procedures.get(ctx.NOM().getText());
		if(proc == null) {
			System.err.println("ERROR : " + ctx.NOM().getText() + " doesn't exist. Ignoring call.");
			return 0;
		}
		if(!proc.isProcedure) {
			System.err.println("ERROR : "  + ctx.NOM().getText() + " is a function. Ignoring call.");
			return 0;
		}
		
		if(proc.getParameters().size() != ctx.exp().size()) {
			System.err.println("ERROR : " + ctx.NOM().getText() + " wrong number of parameters. Ignoring call");
			return 0;
		}
		
		Log.append("procedure " + ctx.NOM().getText() + " called\n");
		SymbolTable params = new SymbolTable();
		for(int i = 0; i < proc.getParameters().size(); ++i) {
			visit(ctx.exp(i));
			params.setSymbol(proc.getParameters().get(i), getAttValue(ctx.exp(i)));
		}
		symbols.push(params);
		visit(proc.getInstructions());
		
		symbols.pop();
		return 0;
	}
	@Override
	public Integer visitAppelfonction(AppelfonctionContext ctx) {
		Procedure func = procedures.get(ctx.NOM().getText());
		if(func == null) {
			System.err.println("ERROR : " + ctx.NOM().getText() + " doesn't exist. Ignoring call. Setting pseudo-return value to 0");
			setAttValue(ctx, 0);
			return 0;
		}
		if(func.isProcedure) {
			System.err.println("ERROR : "  + ctx.NOM().getText() + " is a procedure. Ignoring call and setting return value to 0.");
			setAttValue(ctx, 0);
			return 0;
		}
		if(func.getParameters().size() != ctx.exp().size()) {
			System.err.println("ERROR : "  + ctx.NOM().getText() + " wrong number of parameters. Ignoring call and setting return value to 0.");
			setAttValue(ctx, 0);
			return 0;
		}
		
		Log.append("\nresolving parameters to call " + ctx.NOM().getText() + "...\n");
		SymbolTable params = new SymbolTable();
		for(int i = 0; i < func.getParameters().size(); ++i) {
			visit(ctx.exp(i));
			params.setSymbol(func.getParameters().get(i), getAttValue(ctx.exp(i)));
		}

		Log.append("function " + ctx.NOM().getText() + " called\n\n");
		
		symbols.push(params);
		visit(func.getInstructions());
		
		//Exécution de l'instruction return et enregistrement de la valeur
		visit(func.getRetInst());
		setAttValue(ctx, getAttValue(func.getRetInst()));
		Log.append("return value : " + getAttValue(func.getRetInst()) + "\n\n");
		
		symbols.pop();
		return 0;
	}
}
