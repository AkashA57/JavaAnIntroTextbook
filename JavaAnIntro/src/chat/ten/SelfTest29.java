package chat.ten;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SelfTest29 {
	public static void main(String[] args) {
		ObjectInputStream inputStream = null;
		String fileName = "stuff.data";
		try {
		inputStream = new ObjectInputStream(new FileInputStream(fileName));
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
			System.exit(0);
		}
		catch(IOException e) {
			System.out.println("Input Output Exception");
		System.exit(0);
		}
		try {
		while(true) {
			Double d = inputStream.readDouble(); 
			System.out.println(d);
		} }
		catch(EOFException e) {
			System.out.println("End Of File");
		}
		catch(IOException e) {
			System.out.println("Input Output Exception");
		System.exit(0);
		}
	}
}
