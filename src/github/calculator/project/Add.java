package github.calculator.project;

import java.util.Iterator;

public class Add  implements Operate{

	@Override
	public Double getResult(Double... numbers) {
		// TODO Auto-generated method stub
		Double sum = 0.0;
		for (Double num : numbers) {
			sum+=num;
			
		}
		return sum;
	}
	
	

}
