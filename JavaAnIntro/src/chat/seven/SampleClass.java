package chat.seven;

public class SampleClass
{
	static double[] a = {1, 2, 3, 4};
    static double c = 4;
    
    public static void incrementPrimitive(double variable) {
    	variable = variable + 4;
    }
    public static void incrementArrayBy2(double[] anArray)
    {

        for (int i = 0; i <anArray.length; i++)
            anArray[i] = anArray[i] + 2;
}
    public static void main(String[] args) {
    	for(int i = 0;i<a.length;i++) {
    		System.out.println(a[i]);
        	
    	}
    	System.out.println("--------");
    	System.out.println(c);
    	
    	
    	SampleClass.incrementPrimitive(c);
    	SampleClass.incrementArrayBy2(a);
    	
    	
    	System.out.println("--------------------------");
    	
    	for(int i = 0;i<a.length;i++) {
    		System.out.println(a[i]);
        	
    	}
    	System.out.println("--------");
    	System.out.println(c);
    }
}
