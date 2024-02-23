package assignment2;

public class Pattern6 {

	public static void main(String[] args) {
		int k = 1;
		for(int i = 5; i > 0; i--) {
			
			for(int j = 5; j >=i; j--) {
				
				for(int x = i-1; x>0 && j==5; x--) {
					System.out.print(" ");
				}
				
				System.out.print(k+" ");
				k++;
				
			}
		System.out.println();
		}
	}
}
