package assignment2;

public class Pattern8 {

	public static void main(String[] args) {

		for(int i = 1; i < 6; i++) {
			for(int k = 5-i; k>0; k--) {
				System.out.print(" ");
			}
			System.out.print(i+" ");
			int k = 1;
			for(int j = 5-i; j <4; j++) {
				
				System.out.print(i + 5*k + " ");
				k++;
			}
		System.out.println();
		}
	


	}

}
