package assignment;

import java.util.Scanner;

public class QuestionNo14 {

	public static void main(String[] args) {
		
		int number1;
		System.out.println("Please enter a number ");
		Scanner keyboard1 = new Scanner(System.in);
		number1 = keyboard1.nextInt();
		
		int number2;
		System.out.println("Please enter a number ");
		Scanner keyboard2 = new Scanner(System.in);
		number2 = keyboard2.nextInt();
		
		if(number1==number2) {
			System.out.println(number1 + " is equal to " + number2);
		}
		
		else if(number1 > number2) {
			System.out.println(number1 + " is greater than " + number2);
		}
		
		else {
			System.out.println(number1 + " is less than " + number2);
		}
		
		keyboard1.close();
		keyboard2.close();

	}
	

}
