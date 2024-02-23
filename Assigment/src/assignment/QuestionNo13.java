package assignment;

import java.util.Scanner;

public class QuestionNo13 {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Please enter a number ");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		
		if(number<0) {
			System.out.println("The number you entered is " + number);
		}
		else {
			System.out.println("I do not like positive number");
		}

	}

}
