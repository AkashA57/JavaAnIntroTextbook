package assignment2;

public class Pattern3 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >=i; j--) {
				for(int k = -1+i; j==5 && k>0; k--) {
					System.out.print(" ");
				}
				System.out.print(j+ " ");
				
			}
		System.out.println();
		}


	}

}
