package assignment;

import java.util.Scanner;

public class QuestionNo19 {

	public static void main(String[] args) {
		
		int side1;
		System.out.println("Please enter a length of side 1: ");
		Scanner keyboard1 = new Scanner(System.in);
		side1 = keyboard1.nextInt();
		
		int side2;
		System.out.println("Please enter a length of side 2: ");
		Scanner keyboard2 = new Scanner(System.in);
		side2 = keyboard2.nextInt();
		
		int side3;
		System.out.println("Please enter a length of side 3: ");
		Scanner keyboard3 = new Scanner(System.in);
		side3 = keyboard3.nextInt();
		
		if(side1==side2 && side1==side3) {
			System.out.println("It is aa equilateral triangle");
		}
		
		else if(side1!=side2 && side1!=side3 && side2!=side3) {
			System.out.println("It is a scalene triangle");
		}
		
		else{
			System.out.println("It is an isosceles triangle");
		}

	}

}
