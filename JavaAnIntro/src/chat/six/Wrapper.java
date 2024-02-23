package chat.six;

public class Wrapper {

	public static void main(String[] args) {
		
		Integer n = new Integer(77);
		System.out.println(n);
		System.out.println();
		int m = 78; 
		
		n=new Integer(m);
		System.out.println(n);
		
		m = n;
		System.out.println(m);

		//m.intValue();
		n.intValue();
		
	}

}
