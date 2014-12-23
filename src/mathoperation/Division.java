package mathoperation;

import javax.swing.JOptionPane;

public class Division implements IOperation {
	
	private double quotient;
	private double remainder;

	@Override
	public void calculate(Double p1, Double p2) {
		if(!p2.equals(0)){
			quotient = p1/p2;
			remainder = p1%p2;
		}else{
			JOptionPane.showMessageDialog(null, "You can't divide per zero", "Not a valid operation" , 0);
		}
	}	
	
	@Override
	public String getResut() {
		return "The result of the division is q="+quotient+"\n r="+remainder;
	}
	@Override
	public String toString(){
		return getClass().getSimpleName();
	}
}
