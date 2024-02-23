package chat.seven;

import java.util.Scanner;

public class VowelFrequency {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word = keyboard.next();
		
		int[] vowelCount = new int[5];
		
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)=='a') {
				vowelCount[0]++;
			}
			else if(word.charAt(i)=='e') {
				vowelCount[1]++;
			}
			else if(word.charAt(i)=='i') {
				vowelCount[2]++;
			}
			else if(word.charAt(i)=='o') {
				vowelCount[3]++;
			}
			else if(word.charAt(i)=='u') {
				vowelCount[4]++;
			}
		}
		
		System.out.println("You entered \"" + word + "\".");
		System.out.println();
		System.out.println("The number of vowels are");
		System.out.println();
		System.out.println("a " + "e " + "i " + "o " + "u");
		
		for(int printVowelCount: vowelCount) {
			System.out.print(printVowelCount + " ");
		}
		

	}

}
