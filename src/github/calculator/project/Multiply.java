package github.calculator.project;

public class Multiply implements Operate {
	@Override
	public Double getResult(Double... numbers) {
		// TODO Auto-generated method stub
		Double result = 1.0;
		for (Double num : numbers) {
			result*=num;
			
		}
		return result;


}
}