package assignment;

import java.util.Scanner;

public class QuestionNo3 {

	public static void main(String[] args) {
		
		System.out.println("Please enter two digits");
		
		Scanner keyboard = new Scanner(System.in);
		int digit1 = keyboard.nextInt();
		
		
		Scanner keyboard1 = new Scanner(System.in);
		int digit2 = keyboard1.nextInt();
		
		int sum = digit1 + digit2;
		float average = sum/2f;
		
		System.out.println("The sum of the digits you entered is " + sum);
		
		System.out.println("The average of the digits you entered is " + average);
		
	}

}
