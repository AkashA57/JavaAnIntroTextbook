package chat.four;

import java.util.Scanner;

public class ExerciseQ1 {

	public static void main(String[] args) {
		
		System.out.println("Enter a word. Type 'done' to exit.");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();
		
		while(!input.equals("done")) {
			if(input.charAt(0)==input.charAt(input.length()-1)) {
				System.out.println("First and last letter are equal");
			}
			else {
				System.out.println("First and last letter are not equal");
			}
			input = keyboard.next();
		}

	}

}
