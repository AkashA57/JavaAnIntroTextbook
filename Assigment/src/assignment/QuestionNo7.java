package assignment;

import java.util.Scanner;

public class QuestionNo7 {

	public static void main(String[] args) {
		
		System.out.println("Please enter the radius of a cylinder");
		Scanner keyboard = new Scanner(System.in);
		int radius = keyboard.nextInt();
		
		System.out.println("Please enter the length of a cylinder");
		Scanner keyboard1 = new Scanner(System.in);
		int length = keyboard1.nextInt();
		
		System.out.println("Volume of a cylinder is " + String.format("%.2f",3.1415*radius*radius*length));

	}

}
