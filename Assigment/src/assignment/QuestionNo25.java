package assignment;

import java.util.Scanner;

public class QuestionNo25 {

	public static void main(String[] args) {
		
		int noOfStudent;
		
		System.out.println("Enter the number of students: ");
		Scanner keyboard1 = new Scanner(System.in);
		noOfStudent = keyboard1.nextInt();
		
		String[] name = new String[noOfStudent];
		int[] score = new int[noOfStudent];
		
		String highestName = "";
		int highestScore = 0;
		
		for(int i = 0; i < noOfStudent; i++) {
			System.out.println(i+1 + " student name is "  );
			Scanner keyboard2 = new Scanner(System.in);
			name[i] = keyboard2.nextLine();
			
			System.out.println(i + 1 + " student score is " );
			Scanner keyboard3 = new Scanner(System.in);
			score[i] = keyboard3.nextInt();
			
			if(i > 0) {
				if(score[i-1]>score[i]) {
					highestScore = score[i-1];
					highestName = name[i-1];
				}
				else {
					highestScore = score[i];
					highestName = name[i];
				}
			}
		}
		System.out.println(highestName + " got the highest score of " + highestScore);;

	}

}
