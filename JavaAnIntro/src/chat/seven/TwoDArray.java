package chat.seven;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int[][] table = new int[3][5];
		
		System.out.println(table.length);
		System.out.println(table[1].length);
		
		for (int row = 0; row <table.length; row++)
		       for (int column = 0;column< table[row].length; column++)
		           table[row][column] = keyboard.nextInt();
		
		
		for (int row = 0; row <table.length; row++) {
			System.out.println();
		       for (int column = 0;column< table[row].length; column++)
		           System.out.print(table[row][column]);
		}
	}

}
