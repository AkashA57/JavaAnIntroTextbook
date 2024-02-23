package assignment2;

public class Pattern11 {

	public static void main(String[] args) {
		
		int k;
		for(int i = 1; i < 6; i++) {
			k = 0;
			for(int j = 1; j <=(2*i-1); j++) {
				
				for(int a = 2*(5-i); j==1 & a>0; a--) {
					System.out.print(" ");
				}
				
				if(j<=i) {
					System.out.print(j+" ");
				}
				else {
					k = k + 1;
					System.out.print(i-k+ " ");
				}
			}
		System.out.println();
		}
		
		



	}

}
