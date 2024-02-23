package assignment2;

public class Pattern15 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i < 8; i ++) {
			
			if(i <5) {
				for(int j = 1; j<=i; j++) {
					System.out.print(i*j + " ");
				}
				
			}
			else {
				int a = 0;
				for(int j = 8-i; j>0; j-- ) {
					a = a + 1;
					System.out.print(i*a + " ");
				}
			}
			
			System.out.println();
		}

	}

}
