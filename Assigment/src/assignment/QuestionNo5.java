package assignment;

import java.util.Scanner;

public class QuestionNo5 {

	public static void main(String[] args) {
		
		// For circle
		System.out.println("Enter the radius of a circle");
		Scanner keyboard = new Scanner(System.in);
		int radius= keyboard.nextInt();
		System.out.println("The area of a circle is " + 3.1415 * radius * radius);
		
		
		// For triangle
		System.out.println();
		System.out.println("Enter the height of a triangle");
		Scanner keyboard1 = new Scanner(System.in);
		int height= keyboard1.nextInt();
		
		System.out.println("Enter the base of a triangle");
		Scanner keyboard2 = new Scanner(System.in);
		int base= keyboard2.nextInt();
		
		System.out.println("The area of a triangle is " + 0.5 * height * base);
		

		// For rectangle
		System.out.println();
		System.out.println("Enter the length of a rectangle");
		Scanner keyboard3 = new Scanner(System.in);
		int length= keyboard3.nextInt();
				
		System.out.println("Enter the breadth of a rectangle");
		Scanner keyboard4 = new Scanner(System.in);
		int breadth= keyboard4.nextInt();
				
		System.out.println("The area of a rectangle is " + length * breadth);

	}

}
