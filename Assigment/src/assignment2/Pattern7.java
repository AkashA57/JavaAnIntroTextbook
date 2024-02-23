package assignment2;

public class Pattern7 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 6; i++) {
			for(int j = i; j>0; j--) {
				for(int k = 5-j; k > 0 && j==i; k--) {
					System.out.print(" ");
				}
				System.out.print(j+" ");
			}
		System.out.println();
		}


	}

}
