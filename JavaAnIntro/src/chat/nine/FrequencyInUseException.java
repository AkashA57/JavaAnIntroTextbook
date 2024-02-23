package chat.nine;

public class FrequencyInUseException extends Exception {
	
	public FrequencyInUseException() {
		super("Current frequency is in use");
		System.out.println();
	}
	
	public FrequencyInUseException(String message) {
		super(message);
	}
}
