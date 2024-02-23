package chat.three;

import java.util.Scanner;

public class ProgrammingP3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String lineUpper = keyboard.nextLine();
		String line = lineUpper.toLowerCase();
		
		if(line.contains(" dog ") || line.contains(" dog.") ){
			System.out.println("Profanity removed");
		}
		else if(line.contains(" cat ") || line.contains(" cat.") ){
			System.out.println("Profanity removed");
		}
		else if(line.contains(" llama ") || line.contains(" llama.") ) {
			System.out.println("Profanity removed");
		}
		else {
			System.out.println(lineUpper);
		}

	}

}
