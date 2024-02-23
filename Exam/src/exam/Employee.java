package exam;

import java.util.Scanner;

public class Employee {
	
	String name;
	String city;
	int age;
	int ssn;
	String country;
	
	void getData() {
		System.out.println("Enter a name : ");
		Scanner keyboard1 = new Scanner(System.in);
		name = keyboard1.nextLine();
		
		System.out.println("Enter a city : ");
		Scanner keyboard2 = new Scanner(System.in);
		city = keyboard2.nextLine();
		
		System.out.println("Enter age : ");
		Scanner keyboard3 = new Scanner(System.in);
		age = keyboard3.nextInt();
		
		System.out.println("Enter ssn : ");
		Scanner keyboard4 = new Scanner(System.in);
		ssn = keyboard4.nextInt();
		
		System.out.println("Enter a country : ");
		Scanner keyboard5 = new Scanner(System.in);
		country = keyboard5.nextLine();
		
	}
	
	void printData() {
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
		System.out.println("Age : " + age);
		System.out.println("SSN : " + ssn);
		System.out.println("Country : " + country);
		
	}

	public static void main(String[] args) {
		
		Employee d1 = new Employee();
		
		d1.getData();
		
		d1.printData();
		
		

	}

}
