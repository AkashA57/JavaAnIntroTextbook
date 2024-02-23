package chat.ten;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SelfTest21a {

	public static void main(String[] args) {
		Double x1 = 23.32;
		
		
		String fileName = "stuff.data";
		
		ObjectOutputStream outputStream = null;
		
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
			
			outputStream.writeDouble(x1);
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		catch(IOException e) {
			System.out.println("Input Output Exception");
		}
		try {
			outputStream.close();
		}
		catch(IOException e) {
			System.out.println("Input Output Exception");
		}

	}

}
