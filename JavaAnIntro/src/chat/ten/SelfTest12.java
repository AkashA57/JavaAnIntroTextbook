package chat.ten;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SelfTest12 {

	public static void main(String[] args) {
		double x1 = 3.3;
		double x2 = 3.4;
		double x3 = 3.5;
		
		String fileName = "stuff.data";
		
		ObjectOutputStream outputStream = null;
		
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
			
			outputStream.writeDouble(x1);
			outputStream.writeDouble(x2);
			outputStream.writeDouble(x3);
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
