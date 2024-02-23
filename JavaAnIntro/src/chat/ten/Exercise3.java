package chat.ten;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		String fileName = "newOrAppend.txt";
		System.out.printf("Do you want to append a file?\n or\n"
				+ "Create a new file?\n");
		
		Scanner keyboard = new Scanner(System.in);
		String newOrAppend = keyboard.next();
		
		PrintWriter printWriter = null;
		
		try {
			if(newOrAppend.equalsIgnoreCase("New")) {
				printWriter = new PrintWriter(fileName);
				System.out.printf("New File"); 
				printWriter.println("What's up yo?");
			}
			else {
				printWriter = new PrintWriter(new FileOutputStream(fileName, true));
				System.out.printf("File Appended"); 
				printWriter.println("Is it apppended?");
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		printWriter.close();
		
		
	}

}
