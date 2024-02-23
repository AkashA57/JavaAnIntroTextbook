package chat.seven;

public class SelfTestQ13 {

	public static void main(String[] args) {
		
		int[] temp = new int[3];
		temp[0] =1;
		temp[1] =2;
		temp[2] =3;
		for(int array: temp) {
			System.out.println("temp: " + array);
		}
		System.out.println(temp);
		System.out.println(temp.length);
		
		System.out.println("-------------------");
		doubleSize(temp);
		System.out.println(temp);
		System.out.println(temp.length);
	}
	
	/** Doubles the size of an array. */
    public static void doubleSize(int[] a)
    {
    	a[0] =1;
		a[1] =2;
		a[2] =3; 
		for(int array: a) {
			System.out.println("a: " + array);
		}
    	a = new int[a.length * 2];
    	for(int array: a) {
			System.out.println("a: " + array);
		}
         System.out.println(a);
 		 System.out.println(a.length);
    }

}
