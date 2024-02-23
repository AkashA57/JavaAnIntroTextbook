package chat.nine;

import java.util.Scanner;

public class Exercise1 {
	
	private String[][] frequencyArray = new String[7][2];
	private int frequencyColumn = 0;
	private int bandColumn = 1;
	private int indexCounter = 0;
	Scanner keyboard = new Scanner(System.in);
	
	public void selectFrequency() {
		
		initializeArray();
		
		try	 {
			boolean proceed = true;
			while(proceed) {
				
				System.out.println("Enter a frequency you want to use");
				String frequency = keyboard.nextLine();
				
				int intFrequency = Integer.parseInt(frequency);
				
				if(isValidFrequency(intFrequency) && indexCounter < frequencyArray.length) {
					
					frequencyArray[indexCounter][frequencyColumn] = frequency;
					System.out.println("Enter a channel name for the band");	
					frequencyArray[indexCounter][bandColumn] = keyboard.nextLine();
					indexCounter++;
				}
				
				for(int row = 0; row < frequencyArray.length; row++) {
					for(int column = 0; column < frequencyArray[row].length; column++) {
						System.out.print(frequencyArray[row][column] + "   ");
					}
					System.out.println();
				}
				
				System.out.println("Do you want to select another frequency?");				
				System.out.println("Yes/No");
					
				String wantContinue = keyboard.nextLine();
				
				if(!wantContinue.equalsIgnoreCase("Yes")) {
					proceed = false;
				}
				
			}
		}
			
		catch(InvalidFrequencyException e) {
			System.out.print(e.getMessage());
		}
			
		catch(FrequencyInUseException e) {
			System.out.print(e.getMessage());
		}
			
		
	}
	
	public void initializeArray() {
		for(int row = 0; row < frequencyArray.length; row++) {
			for(int column = 0; column < frequencyArray[row].length; column++) {
				frequencyArray[row][column] = "0";
			}
		}
	}
	
	public boolean isValidFrequency(int intFrequency) throws InvalidFrequencyException, 
	FrequencyInUseException{
		
		if(!((intFrequency > 91) && (intFrequency < 99))) {
			throw new InvalidFrequencyException();
		}
		
		System.out.println("IsInUseFrequency: " + isInUseFrequency(intFrequency));
		
		return true;
	}
	
	public boolean isInUseFrequency(int intFrequency) throws FrequencyInUseException{
		
		int column = 0;
		for(int row = 0; row < frequencyArray.length; row++) {
			if(Integer.parseInt(frequencyArray[row][column]) == intFrequency) {
				throw new FrequencyInUseException();
			}
		}
		return true;
	}
	
	

}
