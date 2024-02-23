package chat.ten;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.UTFDataFormatException;
import java.util.Scanner;

public class SelfTest21 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a .dat file you want to access");
		String fileName = keyboard.nextLine();
		
		ObjectInputStream inputStream = null;
		
		try {
			inputStream = new ObjectInputStream(new FileInputStream(fileName));
			String readString = inputStream.readUTF();
			System.out.println(readString);
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}
		catch(EOFException e) {
			System.out.println("EOF Exception");
		}
		catch(UTFDataFormatException e) {
			System.out.println("UTF Data Format Exception");
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
