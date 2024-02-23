package chat.eleven;

import java.util.Scanner;

public class EvenDigitInNumbers {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The number of even digits in a number is");
		System.out.println(even(keyboard.nextInt()));
	}
	
	public static int even(int number) {
		int count = 0;
		int remainder;
		if(number/10==0) {
			if(number%2==0) {
				count = 1;
			}		
		}
		else {
			remainder = number%10;
			if(remainder%2==0) {
				count = 1 + even(number/10);
			}
			else {
				count = 0 + even(number/10);
			}
		}
		return count;
	}
	
}