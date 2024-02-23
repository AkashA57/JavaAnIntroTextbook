package chat.one;

import java.util.Scanner;

public class SemanticErrorRev
{
  public static void main(String[] args)
  {
	  
	  int subject1, subject2, subject3, subject4; 
	  System.out.println("Enter the marks in four subjects as whole numbers ");
	  System.out.println(" so as to compute the sum and the average of the student ");
	  
	  Scanner keyboard = new Scanner(System.in);
	  subject1 = keyboard.nextInt();
	  subject2 = keyboard.nextInt();
	  subject3 = keyboard.nextInt();
	  subject4 = keyboard.nextInt();
	  
	  int sum = subject1 + subject2 + subject3 + subject4; 
	  System.out.println("The total marks in four subjects are " + sum);
	  
	  int avg = subject1 + subject2 + subject3 + subject4; //here is mistake(not divided by 4)
	  System.out.println("The average marks of the student is " + avg);
  } 
}