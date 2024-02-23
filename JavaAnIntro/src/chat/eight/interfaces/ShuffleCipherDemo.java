package chat.eight.interfaces;

public class ShuffleCipherDemo {

	public static void main(String[] args) {
		

		ShuffleCipher shuffleCipher = new ShuffleCipher(1);
		
		System.out.println(shuffleCipher.encode("abcdefghij"));
		
		ShuffleCipher shuffleCipher1 = new ShuffleCipher(2);
		
		System.out.println(shuffleCipher1.encode("abcdefghij"));
        //ahfdbigec
	}

}
