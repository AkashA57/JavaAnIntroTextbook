package assignment;

import java.util.Scanner;

public class QuestionNo9 {

	public static void main(String[] args) {
		
		System.out.println("Enter the weight in pounds");
		Scanner keyboard = new Scanner(System.in);
		int weightInPounds = keyboard.nextInt();
		float toKg = 0.45f * weightInPounds;
		System.out.println("The weight in kilograms is " + String.format("%.2f",toKg));
		

	}

}
