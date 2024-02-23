package chat.three;

import java.util.Scanner;

public class QuestionNo14 {
	enum FirstFive {a , b, c, d, e}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char elements = keyboard.next().charAt(0);
		
		//enum FirstFive {a , b, c, d, e}
		FirstFive firstFive;
		firstFive = FirstFive.d;

		
		switch(firstFive) 
		{
			case a:
				System.out.println(firstFive.a);
				break;
			case b:
				System.out.println(firstFive.b);
				break;
			case c:
				System.out.println(firstFive.c);
				break;
			case d:
				System.out.println(firstFive.d);
				break;
			case e:
				System.out.println(firstFive.e);
				break;
			default:
				System.out.println("Enum prevents mistakes"
						+ " so default might be unnecessary");
		}
	}

}
