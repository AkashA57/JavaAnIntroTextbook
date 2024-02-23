package chat.seven;

public class PracticeProgram4 {

	public static void main(String[] args) {
		
		 String[][] alaskanBands = new String[4][];
		    String[] band1 = {"Portugal. The Man", "John Gourley",
		                     "Zachary Carothers", "Noah Gersh",
		                     "Kyle O'Quin", "Kane Ritchotte"};
		    String[] band2 = {"36 Crazyfists", "Brock Lindow", "Steve Holt", "Mick Whitney", "Kyle Baltus"}; 
		    
		    String[] band3 = {"Historian", "Nathan Hurst", "Jason Lessard",
		                      "Daniel Zawodny", "Marc Bourdon"};
		    
		    
		    alaskanBands[0] = band1;
		    alaskanBands[1] = band2;
		    alaskanBands[2] = band3;
		    
		    alaskanBands[3] = new String[3];
		    
		    
		    System.out.println(alaskanBands[0].length);
		    System.out.println(alaskanBands[1].length);
		    System.out.println(alaskanBands[2].length);
		    System.out.println(alaskanBands[3].length);
		    
		    for(int row = 0; row<alaskanBands.length; row++) {
		    	for(int column = 0; column<alaskanBands[row].length; column++) {
		    		System.out.print(alaskanBands[row][column]+ "      ");
		    	}
		    	System.out.println();
		    }

	}

}
