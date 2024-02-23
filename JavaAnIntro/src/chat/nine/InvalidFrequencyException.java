package chat.nine;

public class InvalidFrequencyException extends Exception{

	public InvalidFrequencyException() {
		super("Invalid frequency hz");
		System.out.println();
	}

	public InvalidFrequencyException(String message) {
		super("Invalid frequency hz");
	}
}
