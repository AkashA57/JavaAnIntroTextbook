package chat.eleven;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		int number = keyboard.nextInt();
		
		System.out.println(countDigit(number));

	}
	
	public static int countDigit(int number) {
		
		if(number/10==0) {
			return 1;
		}
		else {
			return 1+countDigit(number/10);
		}
	}

}
