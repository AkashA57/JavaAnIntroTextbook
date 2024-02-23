package assignment2;

public class Pattern1 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <=i; j++) {
				for(int k = 5-i; j==1 && k>0; k--) {
					System.out.print(" ");
				}
				System.out.print(i+" ");
			}
		System.out.println();
		}

	}

}
