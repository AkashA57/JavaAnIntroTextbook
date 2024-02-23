package chat.twelve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
		
		String fileName = "data.txt";
		ArrayList<String> aList = new ArrayList<String>();
		
		String placeHolder = "";
		
		try {
			Scanner readText = new Scanner(new File("data.txt"));
			
			while(readText.hasNext()) {
				String word = readText.next();
				if(word.charAt(word.length()-1)=='.' ) {
					placeHolder = placeHolder + word + " ";
					placeHolder = placeHolder.trim();
					aList.add(placeHolder);
					placeHolder = "";
					continue;
				}
				placeHolder = placeHolder + word + " ";
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String printArray: aList) {
			System.out.println(printArray);
		}
		
	}

}
