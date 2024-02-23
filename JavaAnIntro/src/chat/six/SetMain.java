package chat.six;

import java.util.Scanner;

public class SetMain {

	public static void main(String[] args) {
		
		Scanner keyboard =new Scanner(System.in);
		
		Set yourPet = new Set("Akash", 24, 56.3);
		yourPet.getOutput();
		
		System.out.println("Enter name");
		String correctName = keyboard.nextLine();
		
		System.out.println("Enter age");
		int correctAge = keyboard.nextInt(); 
		
		System.out.println("Enter weight");
		double correctWeight = keyboard.nextDouble(); 
		
		yourPet.setPet(correctName, correctAge, correctWeight);
		yourPet.getOutput();


	}

}
