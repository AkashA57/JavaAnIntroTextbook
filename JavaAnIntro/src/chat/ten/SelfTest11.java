package chat.ten;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SelfTest11 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a file name");
		String fileName = keyboard.nextLine();
		
		File fileObject = new File(fileName);
		
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter(fileObject);
		}
		catch(FileNotFoundException e) {
			System.out.println("Filename and directory name matched");
		}
		
		if(fileObject.exists()) {
			System.out.println("File Exists");
			System.out.println("Do you want to delete the file?");
			System.out.println("Yes/No");
			String answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("Yes")) {
				if(fileObject.delete()) {
					System.out.println("Deleted");
				}
				else {
					System.out.println("Not Deleted");
				}
			}
			else {
				System.out.println("Not Deleted");
			}
		}
		else {
			System.out.println("File Doesnot Exist");
		}
		
		outputStream.close();
		keyboard.close();
		

	}

}
