package assignment2;

public class Pattern12 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <=i; j++) {
				for(int k = 5-i; 1==j && k>0; k--) {
					System.out.print(" ");
				}
				System.out.print(j%2+" ");
			}
		System.out.println();
		}


	}

}
