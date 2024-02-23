package assignment;

import java.util.Scanner;

public class QuestionNo28 {
	
	
	
	static void isPrimeNumber(int digit) {
		int i;
		int j =0;
		
		
		for(i = 2; i<=digit/2; i++) {
			if(digit%i==0) {
				j =1;
				break;
			}
		}	
		if(j == 1) {
			System.out.println("It is not a prime number");
		}
		else {
			System.out.println( digit + " is a prime number");
		}	
	}
	
	static void firstNthPrime(int inputPrime) {
		
		/*
		 * int i;
		 * 
		 * while(inputPrime>0) { for(i = 2; inputPrime>0; i++) { int j = 0;
		 * System.out.println(); System.out.println("outer for loop i = " + i); for(int
		 * k = 2; k<=i/2; k++) { System.out.println("inner for loop k = " + k);
		 * if(i%k==0) { j = 1; break; } } if(j == 0) {
		 * System.out.println("if statement(printing i) =  " + i +"\t");
		 * System.out.print("if statement(printing inputPrime) = " + inputPrime +"\t");
		 * inputPrime--; System.out.println("if statement(printing inputPrime) = " +
		 * inputPrime); }
		 * 
		 * }
		 * 
		 * }
		 */
		
		int i;
		int x = 0;
		System.out.println("Printing first " + inputPrime + " prime number:");
	
			for(i = 2; inputPrime>0; i++) {
				int j = 0;
				
				for(int k = 2; k<=i/2; k++) {
					
					if(i%k==0) {
						j = 1;
						break;
					}
				}
				if(j == 0) {
					x = 1+x;
					System.out.println(x + " th prime number = " + i );
					
					inputPrime--;
					
				}
				
			
			
		}
		
}
	
	static void allPrimebetween(int start, int end) {
		
		int i;
		
		System.out.println("Printing all the prime umber between " + start + " and " + end);
		for(i=start; i<=end; i++) {
			int j = 0;
			for(int k = 2; k<=i/2; k++) {
				
				if(i%k==0) {
					j = 1;
					break;
				}
			}
			if(j==0) {
				System.out.print(i + ", ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		isPrimeNumber(97);
		System.out.println();
		
		firstNthPrime(23);
		System.out.println();
		
		allPrimebetween(2, 67);
		System.out.println();
		
		
		

	}

}
