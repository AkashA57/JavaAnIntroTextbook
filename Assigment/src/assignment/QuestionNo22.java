package assignment;

import java.util.Scanner;

public class QuestionNo22 {

	public static void main(String[] args) {
		
		int mult;
		
		System.out.println("Enter a number to see its' multiplication table ");
		Scanner keyboard1 = new Scanner(System.in);
		mult = keyboard1.nextInt();
		
		for(int i =1; i<11;i++) {
			System.out.println(mult + " times " + i + " is " + i*mult);
		}

	}

}
