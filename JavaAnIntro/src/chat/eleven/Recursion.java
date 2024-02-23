package chat.eleven;

public class Recursion {
	
	public static void countDown(int num) {
		if (num <= 0) {
            System.out.println();
		}
		else {
			System.out.print("" + num);
			num = num - 1;
			countDown(num);
		}
}

	public static void main(String[] args) {
		Recursion.countDown(3);
		

	}

}
