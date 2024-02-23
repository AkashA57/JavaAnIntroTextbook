package assignment;

import java.util.Scanner;

public class QuestionNo26 {

	public static void main(String[] args) {
		 
		int number;
		int reversed;
		int temp = 0;
		int result=0;
	
		
		System.out.println("Enter a number ");
		Scanner keyboard1 = new Scanner(System.in);
		number = keyboard1.nextInt();
		
		for(int i = 1; number>0; i++) {
			reversed = number%10;
			number = number/10;
			if(i>1) {
				temp = result*10;
			}
			result = temp+reversed;		
		}
		System.out.println("Reverse = " + result);
		
		
	}

}
