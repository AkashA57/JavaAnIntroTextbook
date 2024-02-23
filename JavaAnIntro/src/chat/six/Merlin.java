package chat.six;

public class Merlin {
	
	private static Merlin theWizard;
	
	private Merlin() {
		
	}
	
	public static Merlin summon() {
		System.out.println(theWizard);
		if(theWizard==null) {
			theWizard = new Merlin();
		}
		
		return theWizard;
	}
	
	public String consult() {
		return "Pull the sword from the stone";
	}
	
	
	
	

}
