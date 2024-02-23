package chat.three;

import java.util.Scanner;

public class ProgrammingQ3 {

	public static void main(String[] args) {
		
		System.out.println("Please enter 3 words");
		
		Scanner keyboard = new Scanner(System.in);
		String one = keyboard.nextLine();
		String two = keyboard.nextLine();
		String three = keyboard.nextLine();

		if(one.compareTo(two)<0 && one.compareTo(three)<0) 
		{
			if(two.compareTo(three)<0) 
			{
				System.out.println(two);
			}
			else
			{
				System.out.println(three);
			}
		}
		else if(two.compareTo(one)<0 && two.compareTo(three)<0) 
		{
			if(three.compareTo(one)<0) 
			{
				System.out.println(three);
			}
			else
			{
				System.out.println(one);
			}
		}
		else if(three.compareTo(one)<0 && three.compareTo(two)<0) 
		{
			if(two.compareTo(one)<0) 
			{
				System.out.println(two);
			}
			else
			{
				System.out.println(one);
			}
		}
	}

}
