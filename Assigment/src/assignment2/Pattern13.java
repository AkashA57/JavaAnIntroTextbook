package assignment2;

public class Pattern13 {

	public static void main(String[] args) {
		

		for(int i = 1; i < 6; i++) {
			for(int x = 5-i; x>0; x--) {
				System.out.print(" ");
			}
			
			System.out.print(i+" ");
			int k = 4;
			int sum = 0;
			
			for(int j = 5-i; j <4; j++) {
				
				sum = sum + k;
				
				System.out.print(sum + i + " ");
				
				k--;
			}
		System.out.println();
		}

	}

}
