package chat.four;

import java.util.Scanner;

public class SelfTest16 {

	public static void main(String[] args) {
		

		System.out.println("Enter a positive number greater than 1"
				+ " to find its average");
		System.out.println("To signal end of the loop enter a value "
				+ "less than 1");
		
		Scanner keyboard = new Scanner(System.in);
		double input = keyboard.nextDouble();
		double sum = 0;
		int count;
		for(count = 0; input > 1; count++) {
			sum = sum + input;
			input = keyboard.nextDouble();
		}
		System.out.println("Average : " + sum/count);
	}
}
