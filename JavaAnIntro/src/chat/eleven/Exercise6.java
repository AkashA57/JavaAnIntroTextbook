package chat.eleven;

public class Exercise6 {
	
	public static void main(String[] args) {
		int[] array = {6, 2, 3, 4, 5};
		int index = 0;
		
		System.out.println(arrayProduct(array, index));

	}
	
	public static int arrayProduct(int[] array, int index) {
		
		int product;
		
		if(index == (array.length-1)) {
			product = array[index];
		}
		else {
			product = array[index] * arrayProduct(array, ++index);
		}
		return product;
	}
	
}
