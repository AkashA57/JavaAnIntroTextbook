package chat.ten;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelephoneNumber2Main {

	public static void main(String[] args) {
		
		String fileName = "phonebook.txt";
		String display;
//		TelephoneNumber object = null;
		List<TelephoneNumber> telephoneArray = new ArrayList<TelephoneNumber>();
		
		
		//Scanner keyboard = new Scanner(System.in);
		
		Scanner inputStream = null;
		
		try {
			
			inputStream  = new Scanner(new File(fileName));
			
//			while(inputStream.hasNextLine()) {
//				counter = counter + 1;
//			}
						
			
			
			int i = 0;
			
			while(inputStream.hasNextLine()) {
				display = inputStream.nextLine();
				System.out.println(display);
				telephoneArray.add(new TelephoneNumber(display));
				i++;
			}
			System.out.println("Second while loop");
			for(TelephoneNumber array:telephoneArray) {
				System.out.println(array);
			}
			
		
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Data displayed");
		inputStream.close();
			

	}

}
