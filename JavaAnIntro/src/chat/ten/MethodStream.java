package chat.ten;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class MethodStream {

	public static void main(String[] args) {
		String fileName = "data.txt";
		PrintWriter toFile = null;
	    try
	    {
	    	toFile = new PrintWriter(new FileOutputStream(fileName));
	    	System.out.println(toFile);
	    	toFile.println("Successfully opened");

	    }
	    catch(FileNotFoundException e) {
	    	System.out.println("File Not Found");
	    }
	    toFile.close();
	}
	

}
