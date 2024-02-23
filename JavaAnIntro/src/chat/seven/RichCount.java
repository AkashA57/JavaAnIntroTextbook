package chat.seven;

import java.util.Scanner;

public class RichCount {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a size for an array");
		int k = keyboard.nextInt();
		
		Family[] family = new Family[k];
		
		for(int i = 0; i<family.length; i++) {
			System.out.println("Enter income and size for family number " + (i+1));
			family[i] = new Family(keyboard.nextInt(), keyboard.nextInt());			
		}
		
		for(int i = 0; i<family.length; i++) {
			System.out.println("Enter expenditure and savings for family number " + (i+1));
			
			if(family[i].isRich(keyboard.nextDouble(), keyboard.nextDouble())) {
				System.out.println("Family no " + (i +1) + " is rich");
			}
			else {
				System.out.println("Family no " + (i +1) + " is poor");
			}
		}

	}

}
