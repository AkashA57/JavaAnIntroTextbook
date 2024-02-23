package chat.one;

import java.util.Scanner;

public class SyntaxErrorRev
{
  public static void main(String[] args)
  {
	  System.out.println("Enter the length and width of rectangle"); 
	  System.out.println("-to calculate its area");
	  Scanner keyboard = new Scanner(System.in);
	  int l = keyboard.nextInt();
	  System.out.println("Enter the length and width of rectangle"); 
	  int w = keyboard.nextInt();
	  int area = l * w;
	  System.out.println("The area of the rectangle is " + area);
  } 
}
