package mathoperation;

import java.util.Observable;

public class ProxyOperation extends Observable implements IOperation {
	
	private IOperation operation;

	public IOperation getOperation() {
		return operation;
	}

	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	
	@Override
	public void calculate(Double p1, Double p2) {
		operation.calculate(p1, p2);
		update();
	}
	
	@Override
	public String getResut() {
		return operation.getResut();
	}
	
	public void update(){
		setChanged();
		notifyObservers();
	}
}	
