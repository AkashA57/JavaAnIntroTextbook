package chat.eleven;

import java.util.Scanner;

public class PracticeProg4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int number1 = keyboard.nextInt();
		int number2 = keyboard.nextInt();
		int holder;
		if(number1<number2) {
			holder = number1;
			number1 =number2;
			number2 = holder;
		}
		
		System.out.println(GCD(number1, number2));

	}

	public static int GCD(int number1, int number2) {
		int remainder;
		int quotient;
		do {
		if((number1 % number2==0)) {
			return number2;
		}
		remainder = number1 % number2;
		number1 = number2 ;
		number2 = remainder;
		} while(remainder == 0);
		return number2;
	}
}
