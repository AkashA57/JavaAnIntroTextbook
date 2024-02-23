package assignment2;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i = 5; i > 0; i--) {
			for(int j = 5; j >=i; j--) {
				for(int k = i; j==5 && k>0; k--) {
					System.out.print(" ");
				}
				System.out.print(j+" ");
			}
		System.out.println();
		}


	}

}
