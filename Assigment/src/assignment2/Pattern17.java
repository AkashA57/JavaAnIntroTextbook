package assignment2;

public class Pattern17 {

	public static void main(String[] args) {
		
		int b;
		
		for(int i = 1; i<6 ; i++) {
			b = i-1;
			for(int j= 2*i-1; j > 0; j--) {
				if(b>=0) {
					System.out.print(5-b + " ");
					b = b-1;
				}
				else {
					System.out.print(b+5 + " ");
					b = b-1;
				}
				
			}
			System.out.println();
		}
		
		for(int i = 4; i>0 ; i--) {
			b = 1-i;
			for(int j= 2*i-1; j > 0; j--) {
				if(b>=0) {
					System.out.print(5 - b + " ");
					b = b+1;
				}
				else {
					System.out.print(b + 5 + " ");
					b = b+1;
				}
				
			}
			System.out.println();
		}

	}

}
