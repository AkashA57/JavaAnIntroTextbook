package chat.eleven;

public class Exercise7 {

	public static void main(String[] args) {
		int[] array = {-15, 6, 2, -3, 4, 5, 1};

		
		System.out.println(arraySmallest(array));

	}
	
	public static int arraySmallest(int[] array) {
		int midpoint = (array.length)/2;
		int[] firstHalf = new int[midpoint];
		int[] secondHalf = new int[array.length-firstHalf.length];
		int index = 0;
		for(int i = 0; i<firstHalf.length; i++) {
			firstHalf[i] = array[index];
			index++;
		}
		for(int i = 0; i<secondHalf.length; i++) {
			secondHalf[i] = array[index];
			index++;
		}
		
		if(firstHalf.length==1 && secondHalf.length==1) {
			return returnGreater(firstHalf[0], secondHalf[0]);
		}
		else if(firstHalf.length==1) {
			return returnGreater(firstHalf[0], arraySmallest(secondHalf));
		}
		else if(secondHalf.length==1) {
			return returnGreater(secondHalf[0], arraySmallest(firstHalf));
		}
		else {
			return returnGreater(arraySmallest(firstHalf),arraySmallest(secondHalf));	
		}
	}
	
	private static int returnGreater(int num1, int num2) {
		if(num1<num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
}
