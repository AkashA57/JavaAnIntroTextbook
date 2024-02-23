package assignment2;

public class Pattern9 {

	public static void main(String[] args) {
		
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4-i; j>0; j--) {
				System.out.print(" ");
			}
			if(i < 1) {
				System.out.println(k);
			}
			
			else {
			
			k = k * 11;
			
			String s = String.valueOf(k);
			for(int y = 0; y<s.length(); y++) {
				System.out.print(s.charAt(y)+ " ");
			}
			System.out.println();
			
			}
		}
		
		

	}

}
