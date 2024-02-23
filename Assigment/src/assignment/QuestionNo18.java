package assignment;

import java.util.Scanner;

public class QuestionNo18 {

	public static void main(String[] args) {
		
		int x = 95;
		int y = 35;
		int z = 78;
		
		if(x>y) {
			if(x>z) {
				System.out.println("The largest number among " +
			x + ", " +y + " and " + z + " is " +x);
			}
			else {
				System.out.println("The largest number among " +
						x + ", " +y + " and " + z + " is " +z);
			}
		}
		else {
			System.out.println("The largest number among " +
					x + ", " +y + " and " + z + " is " +y);
		}

	}

}
