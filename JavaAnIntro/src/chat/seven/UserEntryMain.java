package chat.seven;

import java.util.Scanner;

public class UserEntryMain {

	public static void main(String[] args) {
		
		//"akash", "1234", "Akash Acharya", "a@gmail.com", "Male"
		
		Scanner keyboard = new Scanner(System.in);
		UserEntry[] listUserEntry = new UserEntry[2];
		for(int i = 0; i<listUserEntry.length; i++) {
			System.out.println("Input user info: ");
			UserEntry objectUserEntry = new UserEntry(keyboard.nextLine(), keyboard.nextLine(), 
					keyboard.nextLine(), keyboard.nextLine(), keyboard.nextLine());
			listUserEntry[i] = objectUserEntry;
		}
		
		
		for(int i = 0; i<listUserEntry.length; i++) {
			System.out.println(listUserEntry[i]);
		}
		
		
		

	}

}
