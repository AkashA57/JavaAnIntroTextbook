package chat.nine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeProgram3 {

	public static void main(String[] args) {
		
		double num=0.0;
	    Scanner kbd = new Scanner(System.in);
	    System.out.println("Enter a 'double' type number");
	    try {
	    	num = kbd.nextDouble();
	    	
	        System.out.println(num);
	    }
	    catch(InputMismatchException e) {
	    	 System.out.println(e.getMessage());
	    }
        
        
        kbd.close();

	}

}
