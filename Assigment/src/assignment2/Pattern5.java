package assignment2;

public class Pattern5 {

	public static void main(String[] args) {
		
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <=i; j++) {
				for(int k = 5-i; j==1 && k>0; k--) {
					System.out.print(" ");
				}
				System.out.print(j+" ");
			}
		System.out.println();
		}


	}

}
