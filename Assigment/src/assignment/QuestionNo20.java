package assignment;

import java.util.Scanner;

public class QuestionNo20 {

	public static void main(String[] args) {
		
		int number1;
		System.out.println("Enter a number 1: ");
		Scanner keyboard1 = new Scanner(System.in);
		number1 = keyboard1.nextInt();

		int number2;
		System.out.println("Enter a number 2: ");
		Scanner keyboard2 = new Scanner(System.in);
		number2 = keyboard2.nextInt();
		
		String operator;
		System.out.println("Enter an operator +(addition), -(subtraction), "
				+ "*(multiplication), /(division) ");
		Scanner keyboard3 = new Scanner(System.in);
		operator = keyboard3.nextLine();
		
		switch(operator) {
		
		case "+":
			System.out.println(number1+number2);
			break;
		
		case "-":
			System.out.println(number1-number2);
			break;
			
		case "*":
			System.out.println(number1*number2);
			break;
			
		case "/": 
			System.out.println(number1/number2);
			break;
		}
		
	}

}
