package assignment;

import java.util.Scanner;

public class QuestionNo4 {

	public static void main(String[] args) {
		
		System.out.println("Enter the principle amount!");
		Scanner keyboard = new Scanner(System.in);
		int principalAmount= keyboard.nextInt();
		
		System.out.println("Enter the time period!");
		Scanner keyboard1 = new Scanner(System.in);
		int timePeriod= keyboard1.nextInt();
		
		System.out.println("Enter the rate of interest!");
		Scanner keyboard2 = new Scanner(System.in);
		int rateOfInterest= keyboard2.nextInt();
		
		System.out.println("The simple interest turns out to be " + 
		principalAmount * timePeriod * rateOfInterest/100 + ".");

	}

}
