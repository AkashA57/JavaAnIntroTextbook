package assignment;

import java.util.Scanner;

public class QuestionNo24 {

	public static void main(String[] args) {
		
		int number;
		int factorial = 1;
		
		System.out.println("Enter a number to find its' factorial: ");
		Scanner keyboard1 = new Scanner(System.in);
		number = keyboard1.nextInt();
		
		for(int i = 1; i <=number; i++) {
			factorial *=i;
			
		}
		System.out.println("Factorial of " + number + " is " + factorial);
	}

}
