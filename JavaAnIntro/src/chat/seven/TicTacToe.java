package chat.seven;

import java.util.Scanner;

public class TicTacToe {
	private char[][] ticTacToe = new char[3][3];
	private int moveCounter = 0;
	private final char firstMove = 'Y';
	private final char secondMove = 'N';
	private boolean loop =true;
	
	
	public void addMove(char[][] array) {
		
		Scanner keyboard = new Scanner(System.in);
		
		while(moveCounter <10) {
			moveCounter = countMove();
		
		
		
		if(moveCounter%2==0) {
			System.out.println("It is player 2's move");
		}
		else {
			System.out.println("It is player 1's move");
		}
		
		
		System.out.println("Enter a row where you want to add your character");
		int row = keyboard.nextInt();
		System.out.println("Enter a column where you want to add your character");
		int column = keyboard.nextInt();
		
		
		
		if(moveCounter%2==0) {
			array[row][column]=firstMove;
		}
		else {
			array[row][column]=secondMove;
		}
		
		for (row = 0; row <array.length; row++) {
			
		    for (column = 0;column< array[row].length; column++) {
		        System.out.print(array[row][column]+ " ");
		    }
		    System.out.println();
		}
		
		if(moveCounter>4) {
			String winner = checkWinner(array);
			if(winner.equals("Winner")) {
				moveCounter=11;
			}
		}
		
		}
		
		System.out.println("Do you want to continue?(Yes/No)");
		String continueOrNot = keyboard.next();
		if(continueOrNot.equalsIgnoreCase("yes")) {
			loop = true;
		}
		else {
			loop = false;
		}
		
	}
	
	public String checkWinner(char[][] array) {
		int row = 0;
		int column = 0;
		
		for(row = 0; row< array.length; row++) {
				if((array[row][column] == array[row][column+1]) && (array[row][column] == array[row][column+2])) {
					System.out.println(" Value in row " + row + " column " + column + " is "+ array[row][column]);
					System.out.println("You are a winner");
					return "Winner";
					
				}	
		}
		
		
		row = 0;
		System.out.println("Column : " + column);
		for(column = 0; column< array.length; column++) {
			if((array[row][column] == array[row+1][column]) && (array[row][column] == array[row+2][column])) {
				System.out.println("You are a winner");
				return "Winner";
			}	
		}
		column = 0;
		System.out.println("row : " + row);
		
		if((array[row][column] == array[row+1][column+1]) && (array[row][column] == array[row+2][column+2])) {
			System.out.println("You are a winner");
			return "Winner";
		}
		
		if((array[row][column+2] == array[row+1][column+1]) && (array[row+1][column+1] == array[row+2][column])) {
			System.out.println("You are a winner");
			return "Winner";
		}
		return "Not Yet";
		
	}
	
	public int countMove() {
		moveCounter++;
		return moveCounter;
	}
	
	public static void main(String[] args) {
		
		
		
		TicTacToe tacToe;
		do {
			tacToe = new TicTacToe();
//			for (int row = 0; row <tacToe.ticTacToe.length; row++) {
//			    for (int column = 0;column< tacToe.ticTacToe[row].length; column++) {
//			        tacToe.ticTacToe[row][column] = '0';
//			    }
//			}
			
			for (int row = 0; row <tacToe.ticTacToe.length; row++) {
				
			    for (int column = 0;column< tacToe.ticTacToe[row].length; column++) {
			        System.out.print(tacToe.ticTacToe[row][column]+ " ");
			    }
			    System.out.println();
			}
			tacToe.addMove(tacToe.ticTacToe);
			
		} while(tacToe.loop);
		
		
	}

}
