package assignment;

import java.util.Scanner;

public class QuestionNo11b {

	public static void main(String[] args) {
		
		System.out.println("Please enter digit no 1: ");
		Scanner keyboard = new Scanner(System.in);
		int digit1 = keyboard.nextInt();
		
		System.out.println("Please enter digit no 2: ");
		Scanner keyboard1 = new Scanner(System.in);
		int digit2 = keyboard1.nextInt();
		
		System.out.println("These are initial numbers");
		System.out.println("digit1 = " + digit1);
		System.out.println("digit2 = " +digit2);
		
		//without using temp variable
		digit1 = digit1 - digit2;
		digit2 = digit1 + digit2;
		digit1 = digit2 - digit1;
		
		System.out.println("These are numbers after swapping(without using temp)");
		System.out.println("digit1 = " + digit1);
		System.out.println("digit2 = " +digit2);

	}

}
