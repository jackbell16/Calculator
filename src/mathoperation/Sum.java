package mathoperation;

public class Sum implements IOperation {
	
	private double result;

	@Override
	public void calculate(Double p1, Double p2) {
		result=p1+p2;
		
	}
	
	@Override
	public String getResut() {
		return "The result of the sum is "+result;
	}
	@Override
	public String toString(){
		return getClass().getSimpleName();
	}
}
