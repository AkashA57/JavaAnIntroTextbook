package chat.eleven;

import java.util.Scanner;

public class Fibonacci3 {
	static int nthTerm;

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	int n1 = 0;
	int n2 = 1;
	
	
	System.out.println("Enter 'n' to compute nth Fibonacci number");
	nthTerm = keyboard.nextInt();
	System.out.println("Fibonacci #1 = " + n1);
	System.out.println("Fibonacci #2 = " + n1);
	fibonacci(3, n1, n2);

	}
	
	public static void fibonacci(int index, int n1, int n2) {
		
		double ratioNumerator = n1 + n2;
		if(index==nthTerm) {
			System.out.println("Fibonacci #" + index + " = " + (n1+n2) +"; " + (n1+n2) + "/" + n2 + " = " + ((ratioNumerator)/n2));
		}
		else {
			System.out.println("Fibonacci #" + index + " = " + (n1+n2) +"; " + (n1+n2) + "/" + n2 + " = " + ((ratioNumerator)/n2));
			fibonacci(index+1, n2, n1+n2);
		}
		
	}
	

}
