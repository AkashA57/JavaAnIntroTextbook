package chat.ten;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TelephoneNumberMain {

	public static void main(String[] args) {
		
		String fileName = "phonebook.txt";
		
		
		Scanner keyboard = new Scanner(System.in);
		
		PrintWriter printWriter = null;
		
		try {
			printWriter = new PrintWriter(new FileOutputStream(fileName));
			for(int i = 0; i<5; i++) {
				System.out.println("Enter exchange code(3 digit) and number(4 digit)");
				TelephoneNumber telephoneNumber = new TelephoneNumber(keyboard.nextInt(), keyboard.nextInt());
				printWriter.println(telephoneNumber);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Data inserted");
		printWriter.close();
			
		
		

	}

}
