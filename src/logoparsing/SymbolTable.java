package logoparsing;

import java.util.HashMap;

public class SymbolTable {
	private HashMap<String, Double> symbols;
	
	public SymbolTable() {
		symbols = new HashMap<>();
	}
	
	public void setSymbol(String mnemonic, double value) {
		symbols.put(mnemonic, value);
	}
	
	public Double getSymbol(String mnemonic) {
		return symbols.get(mnemonic);
	}
}
