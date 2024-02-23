package exam;

import java.util.Scanner;

public class ExamQNo3 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		int sum = 0;
		int largest = array[0];
		int smallest = array[0];
		
		
		
		
		for(int i = 0; i<10; i++) {
			System.out.println( i+1 + " th digit ");
			Scanner keyboard = new Scanner(System.in);
			array[i] = keyboard.nextInt();
			
			sum = sum + array[i];
			
			if(array[i]>largest) {
				largest = array[i];
				
			}
			if(array[i]<smallest)
				smallest = array[i];
			
		}
		
		
		System.out.println("The first digit is " + array[0]);
		System.out.println("The first digit is " + array[9]);
		
		
		System.out.println("The average of the array is " + sum/10);
		
		
		System.out.println("The largest digit is " + largest);
		System.out.println("The smallest digit is " + smallest);

	}

}
