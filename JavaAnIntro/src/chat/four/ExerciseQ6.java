package chat.four;

import java.util.Scanner;

public class ExerciseQ6 {
	
	public static void main(String[] args) {
		
		double sum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a nth number");
		int naturalNumber = keyboard.nextInt();
		
		for(int i = 1; i<=naturalNumber; sum = sum + 1f/i, i++) 
			
		
		System.out.println("The sum is " + sum);
	}

}
