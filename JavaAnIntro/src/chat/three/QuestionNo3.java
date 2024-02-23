package chat.three;

import java.util.Scanner;

public class QuestionNo3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your response yes Yes or No");
		
		String response = keyboard.nextLine();
		String lowerResponse = response.toLowerCase();
		boolean accept = false; 
		
		switch(lowerResponse) 
		{
			case "y":
			case "yes": 
			{
				accept = true;
				System.out.println(accept);
				break;
			}
			case "n":
			case "no":
			{
				accept = false;
				System.out.println(accept);
				break;
			}
			default:
				System.out.println("invalid");
			
		
		}
		
		

	}

}
