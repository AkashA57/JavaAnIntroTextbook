package assignment;

import java.util.Scanner;

public class QuestionNo6 {

	public static void main(String[] args) {
		
		// For circle
		System.out.println("Enter the radius of a circle");
		Scanner keyboard = new Scanner(System.in);
		int radius= keyboard.nextInt();
		System.out.println("The perimeter of a circle is " + 3.1415 * radius * 2);
				
				
		// For triangle
		System.out.println();
		System.out.println("Enter the length of the 1st side of a triangle");
		Scanner keyboard1 = new Scanner(System.in);
		int side1= keyboard1.nextInt();
				
		System.out.println("Enter the length of the 2nd side of a triangle");
		Scanner keyboard2 = new Scanner(System.in);
		int side2= keyboard2.nextInt();
		
		System.out.println("Enter the length of the 3rd side of a triangle");
		Scanner keyboard3 = new Scanner(System.in);
		int side3= keyboard3.nextInt();
		
		int sum = side1 + side2 + side3;
		System.out.println("The perimeter of a triangle is " + sum);
				

		// For rectangle
		System.out.println();
		System.out.println("Enter the length of a rectangle");
		Scanner keyboard4 = new Scanner(System.in);
		int length= keyboard4.nextInt();
						
		System.out.println("Enter the breadth of a rectangle");
		Scanner keyboard5 = new Scanner(System.in);
		int breadth= keyboard5.nextInt();
		
		int sum1 = 2 * length + 2 * breadth;
		System.out.println("The perimeter of a rectangle is " + sum1);
		

	}

}
