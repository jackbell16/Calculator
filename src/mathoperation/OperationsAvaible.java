package mathoperation;

import java.util.ArrayList;
import java.util.HashMap;

public class OperationsAvaible {
	
	private static OperationsAvaible avaible = new OperationsAvaible();
	private ArrayList<IOperation> operations = new ArrayList<>();
	private HashMap<IOperation, String> symbolOperations = new HashMap<>();
	
	private OperationsAvaible(){
		createList();
		setSymbol();
	}

	public void createList(){
		operations.add(new Sum());
		operations.add(new Subtraction());
		operations.add(new Multiplication());
		operations.add(new Division());
	}
	
	public void setSymbol(){
		String[] value = {"+","-","*","÷"};
		for (int i = 0; i < operations.size(); i++) {
			symbolOperations.put(operations.get(i), value[i]);
		}
	}

	public ArrayList<IOperation> getOperations() {
		return operations;
	}

	

	public static OperationsAvaible getAvaible() {
		return avaible;
	}

	public HashMap<IOperation, String> getSymbolOperations() {
		return symbolOperations;
	}
}
