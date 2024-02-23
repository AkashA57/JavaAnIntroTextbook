package assignment;

import java.util.Scanner;

public class QuestionNo16 {

	public static void main(String[] args) {
		
		int number1;
		System.out.println("Please enter a number ");
		Scanner keyboard1 = new Scanner(System.in);
		number1 = keyboard1.nextInt();
		
		if(number1%2==0) {
			System.out.println("The entered number is an even number");
		}
		
		else {
			System.out.println("The entered number is an odd number");
		}

	}

}
