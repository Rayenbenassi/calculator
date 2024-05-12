package github.calculator.project;

public class Substract implements Operate {
	@Override
	public Double getResult(Double... numbers) {
		// TODO Auto-generated method stub
		Double result = numbers[0];
		for (int i=1 ;i<numbers.length;i++) {
			result=result-numbers[i];
			
		}
		return result;

}
}