package chat.six;

public class SelfTest30 {
	
	public static void write(double amount, int noOfDecimal)
	{
	        if (amount >= 0)
	        {
	             System.out.print('$');
	             writePositive(amount, noOfDecimal);
	        }
	else
	        {
	             double positiveAmount = Math.abs(amount);
	             System.out.print("-");
	             System.out.print('$');
	             writePositive(positiveAmount, noOfDecimal);
	} }
	
	private static void writePositive(double amount, int noOfDecimal)
	{
	        int allCents = (int)(Math.round(amount * Math.pow(10, noOfDecimal)));
	        int dollars = (int)(allCents / (Math.pow(10, noOfDecimal)));
	        int cents = (int)(allCents % (Math.pow(10, noOfDecimal)));
	         System.out.print(dollars);
	    System.out.print('.');
	    if (cents < (Math.pow(10, noOfDecimal))/10)
	        System.out.print('0');
	    System.out.print(cents);
	}
	/**
    Displays amount in dollars and cents notation.
    Rounds after two decimal places.
    Advances to the next line after output.
*/
   public static void writeln(double amount, int noOfDecimal)
   {
       write(amount, noOfDecimal);
       System.out.println();
   }
   
}
