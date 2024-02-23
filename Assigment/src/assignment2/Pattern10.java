package assignment2;

public class Pattern10 {

	public static void main(String[] args) {
		for(int i = 0; i <5; i++) {
			for(int j = 5-i; j<6; j++) {
				for(int k = j-1; j==5-i && k>0; k--) {
					System.out.print(" ");
				}
				System.out.print(j+" ");
			}
		System.out.println();
		}


	}

}
