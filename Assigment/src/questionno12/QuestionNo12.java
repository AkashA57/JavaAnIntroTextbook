package questionno12;

import java.util.Scanner;

public class QuestionNo12 {
	
	int roll;
	String name;
	String nationality;
	
	void roll1() {
		System.out.println("Please enter your roll ");
		Scanner keyboard = new Scanner(System.in);
		roll = keyboard.nextInt();
	}
	
	void name1() {
		System.out.println("Please enter your name ");
		Scanner keyboard1 = new Scanner(System.in);
		name = keyboard1.nextLine();
	}
	
	void nationality1() {
		System.out.println("Please enter your nationality ");
		Scanner keyboard3 = new Scanner(System.in);
		nationality = keyboard3.nextLine();
	}
	
	void print() {
		System.out.println("Roll : " + roll);
		System.out.println("Name " + name);
		System.out.println("Nationality " + nationality);
	}
}
