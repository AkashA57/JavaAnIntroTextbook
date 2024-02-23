package assignment;

import java.util.Scanner;

public class QuestionNo10 {

	public static void main(String[] args) {
		
		boolean indicator = true;
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Enter an element that you want to search");
		
		Scanner keyboard = new Scanner(System.in);
		int element = keyboard.nextInt();
		
		
		for(int i = 0; i<array.length; i++) {
			if(element == array[i]) {
				System.out.println("The given element is in index " + i);
				break;
			}
			else {
				indicator = !indicator;
			}
		}
		if(indicator == false) {
			System.out.println("Sorry! element not found");
		}
		
	}
			

}
