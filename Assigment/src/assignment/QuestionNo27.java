package assignment;

import java.util.Scanner;

public class QuestionNo27 {

	public static void main(String[] args) {
		
		int number;
		int sum = 0;
		int multiplication = 1;
		
		System.out.println("Enter a number ");
		Scanner keyboard1 = new Scanner(System.in);
		number = keyboard1.nextInt();
		
		
		while(number>0) {
			sum = sum + (number%10);
			multiplication = multiplication * (number%10);
			number = number/10;
		}
		System.out.println("Summation of individual number is " + sum);
		System.out.println("Multiplication of individual number is " + multiplication);

	}

}
