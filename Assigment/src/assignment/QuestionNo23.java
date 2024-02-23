package assignment;

import java.util.Scanner;

public class QuestionNo23 {

	public static void main(String[] args) {
		
		int natural;
		int sum = 0;
		
		System.out.println("Enter a number to find its' arithmetic sum : ");
		Scanner keyboard1 = new Scanner(System.in);
		natural = keyboard1.nextInt();
		
		for(int i = 1; i <=natural; i++) {
			sum +=i;
				
		}
		System.out.println("Sum of 1 to " + natural + " is " + sum);
	}

}
