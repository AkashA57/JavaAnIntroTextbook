package assignment;

import java.util.Scanner;

public class QuestionNo17 {

	public static void main(String[] args) {
		
		int year;
		System.out.println("Please enter a year ");
		Scanner keyboard1 = new Scanner(System.in);
		year = keyboard1.nextInt();
		
		if(year%4==0) {
			System.out.println("The entered year is a leap year");
		}
		
		else {
			System.out.println("The entered number isn't a leap year");
		}


	}

}
