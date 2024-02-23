package chat.seven;

import java.util.Scanner;

public class PracticeProgram3 {
	int[] array;
	Scanner keyboard = new Scanner(System.in);
	
	public int[] setArray() {
		System.out.println("Enter size for an array ");
		int size = keyboard.nextInt();
		array = new int[size];
		
		for(int i = 0; i<array.length; i++) {
			System.out.println("Enter element at index " + i);
			array[i] = keyboard.nextInt();
		}
		
		return array;
		
	}
	
	public int[] shiftArray(int[] initialArray) {
		
		int[] tempArray = new int[initialArray.length];
		
		for(int i = 2; i<tempArray.length; i++) {
			tempArray[i] = initialArray[i-2];
		}
		tempArray[0] = initialArray[tempArray.length-1];
		tempArray[1] = initialArray[tempArray.length-2];
		
		return tempArray;
	}
	
	public static void main(String[] args) {
		
		PracticeProgram3 program3 = new PracticeProgram3();
		program3.setArray();
		
		System.out.println("The original array is ");
		for(int i = 0; i<program3.array.length; i++) {
			System.out.print(program3.array[i] + " ");
		}
		System.out.println();
		
		program3.array = program3.shiftArray(program3.array);
		
		System.out.println("The shifted array is ");
		for(int i = 0; i<program3.array.length; i++) {
			System.out.print(program3.array[i] + " ");
		}
		
	}

}
