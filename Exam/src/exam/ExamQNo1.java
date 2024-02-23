package exam;

import java.util.Scanner;

public class ExamQNo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter a digit no 1");
		Scanner keyboard1 = new Scanner(System.in);
		float digit1 = keyboard1.nextFloat();
		
		System.out.println("Enter a digit no 2");
		Scanner keyboard2 = new Scanner(System.in);
		float digit2 = keyboard2.nextFloat();
		
		System.out.print("What kind of operation do you want to perform"
				+ " between digit 1 and digit 2");
		System.out.println();
		System.out.println("1 for sum, 2 for subtract, 3 for multiplication "
				+ "and 4 for division");
		Scanner keyboard3 = new Scanner(System.in);
		int operation = keyboard3.nextInt();
		
		switch(operation) {
			case 1: 
				System.out.println(digit1 + digit2 + " is the result after adding digit 1 and digit 2.");
				
			case 2:
				System.out.println(digit1 - digit2 + " is the result after subtracting digit 2 from digit 1.");
				
			case 3:
				System.out.println(digit1 * digit2 + " is the result after multiplying digit 1 and digit 2.");
				
			case 4:
				System.out.println(digit1/digit2  + " is the result after dividing digit 1 by digit 2");
				
			default:
				System.out.println("Pleae try again");
		}
		

	}

}
