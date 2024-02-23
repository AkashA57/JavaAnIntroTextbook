package chat.four;

import java.util.Scanner;

public class ExerciseQ3 {

	public static void main(String[] args) {
		
		final String secretNumber = "43251";
		int counter = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		String inputNumber;
		
		do{
		System.out.println("Enter a five digit number");
		inputNumber = keyboard.next();
		
		for(int x = 0; x < 5; x++) {
			if(secretNumber.charAt(x)==inputNumber.charAt(x)) {
				System.out.println("Number "+ inputNumber.charAt(x)
						+ " is at correct position and at index " + x);
			}
		}
		counter++;
		} while(!secretNumber.equals(inputNumber) && counter<3 );
		
		if(secretNumber.equals(inputNumber)) {
			System.out.println("Jackpot!!!");
		}
		else {
			System.out.println("Not a winner");
		}
		
	}

}
