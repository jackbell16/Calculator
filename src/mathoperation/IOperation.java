package mathoperation;

public interface IOperation {
	/**
	 * This method allows to calculate the result of the operation
	 * @param p1
	 * @param p2
	 */
	public void calculate(Double p1, Double p2);
	/**
	 * This method let the user to retrive the result calculated
	 * @return
	 */
	public String getResut();
}
