package chat.seven;

import java.util.Arrays;

public class InbuiltArraySort {

	public static void main(String[] args) {
		
		int[] array = {0,0,5,3,6,3,7,9,1,0,1,0,1,0,1,0,5,4,7,89,65,43,5,1,1};
		System.out.println("Before sorting");
		for(int arrayPrint:array) {
			System.out.print(arrayPrint + "  ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		Arrays.sort(array);
		
		System.out.println("After sorting");
		for(int arrayPrint:array) {
			System.out.print(arrayPrint + "  ");
		}
		

	}

}
