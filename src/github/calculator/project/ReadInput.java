package github.calculator.project;

import java.util.Scanner;

public class ReadInput {

	
	public static String read() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Input expression this format : 4*2/2");
		String inputLine=scanner.nextLine();
		scanner.close();
		return inputLine;
	}
}
