package chat.eleven;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a positive value of n");
		System.out.println(computeTwoToThe(keyboard.nextInt()));

	}
	
	public static int computeTwoToThe(int n) {
		int value = -1;
		if(n==0) {
			value = 1;
		}
		else if(n==1) {
			value = 2;
		}
		else {
			value = 2 * computeTwoToThe(n-1);
		}
		return value;
	}

}
