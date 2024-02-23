package chat.seven;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {0,0,5,3,6,3,7,9,1,0,1,0,1,0,1,0,5,4,7,89,65,43,5,1,1};
		int indexJ;
		int smallest;
		for(int i = 0; i<(array.length-1); i++) {
			smallest= array[i];
			indexJ = i;
			for(int j = i+1; j<array.length; j++) {
				if(smallest>array[j]) {
					smallest = array[j];
					indexJ = j;
					
				}
			}
			array[indexJ] = array[i]; 
			array[i] = smallest;
		}
		
		for(int arrayPrint:array) {
			System.out.print(arrayPrint + "  ");
		}
		

	}

}
