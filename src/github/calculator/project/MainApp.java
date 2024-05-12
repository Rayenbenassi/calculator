package github.calculator.project;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {

	public static void main(String[] args) {
		 String inputExp=ReadInput.read();
		 Queue<String> opertaions;
		 Queue<String> numbers;
		 
		 String numberArr []=inputExp.split("[-+*/]");
		 String operArr []=inputExp.split("[0-9]+");
		 
		 numbers=new LinkedList<String>(Arrays.asList(numberArr));
		 opertaions = new LinkedList<String>(Arrays.asList(operArr));
		 Double result = Double.parseDouble(numbers.poll());
		 
		 while(!numbers.isEmpty()) {
			 String opr= opertaions.poll();
			 Operate operate;
			 
			 switch (opr) {
			 case "+":
				 operate = new Add();
				 break;
			 case "-":
				 operate = new Substract();
				 break;
			 case "*":
				 operate = new Multiply();
				 break;
			 case "/":
				 operate = new Devide();
				 break;
			default:
				continue;
			 }
			 Double nm = Double.parseDouble(numbers.poll());
			 result= operate.getResult(result,nm);
			 
		 }
		 System.out.println(result);
		 
		 
		 
		 
		 

	}

}
