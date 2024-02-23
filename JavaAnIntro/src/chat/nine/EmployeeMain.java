package chat.nine;

import java.util.Scanner;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		
		int count = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an array size");
		int arraySize = keyboard.nextInt();
		
		Employee[] empList = new Employee[arraySize];
		
		while(true) {
			if(count<empList.length) {
				empList[count] = new Employee(); 
				empList[count].setName(keyboard.nextLine());
				empList[count].setName(keyboard.nextLine());
			}
			
			
			
		}
			
		

	}

}
