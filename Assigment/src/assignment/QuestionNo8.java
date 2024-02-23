package assignment;

import java.util.Scanner;

public class QuestionNo8 {

	public static void main(String[] args) {
		
		System.out.println("Enter a temperature in Fahrenheit");
		Scanner keyboard = new Scanner(System.in);
		float fahrenheit = keyboard.nextFloat();
		float toCelsius = 100/180f * (fahrenheit - 32f);
		System.out.println("The temperature in celsius is " + toCelsius);
		
		System.out.println();
		System.out.println("Enter a temperature in Celsius");
		Scanner keyboard1 = new Scanner(System.in);
		float celsius = keyboard1.nextFloat();
		float toFahrenheit = 180/100f*celsius+32f;
		
		System.out.println("The temperature in fahrenheit is " + toFahrenheit);
		

	}

}
