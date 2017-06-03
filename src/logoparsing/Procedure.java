package logoparsing;

import java.util.ArrayList;
import java.util.List;

import logoparsing.LogoParser.ExpContext;
import logoparsing.LogoParser.Liste_instructionsContext;

public class Procedure {
	boolean isProcedure;
	List<String> parameters; 
	Liste_instructionsContext instructions;
	ExpContext retInst;

	public Procedure(boolean isProcedure, Liste_instructionsContext instructions, ExpContext retInst) {
		parameters = new ArrayList<>();
		this.isProcedure = isProcedure;
		this.instructions = instructions;
		this.retInst = retInst;
	}
	
	public Liste_instructionsContext getInstructions() {
		return instructions;
	}

	public void setInstructions(Liste_instructionsContext instructions) {
		this.instructions = instructions;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public boolean isProcedure() {
		return isProcedure;
	}

	public void setProcedure(boolean isProcedure) {
		this.isProcedure = isProcedure;
	}

	public ExpContext getRetInst() {
		return retInst;
	}

	public void setRetInst(ExpContext retInst) {
		this.retInst = retInst;
	}
}
