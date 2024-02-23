package chat.eight.interfaces;

public class ShuffleCipher implements MessageEncoder{

	private int noOfShuffle;
	
	public ShuffleCipher(int n) {
		noOfShuffle = n;
	}
	
	private String oneShuffle(String plainText) {
		
		int firstHalfTextLength = (plainText.length()+1)/2;
		//int secondHalfTextIndex = firstHalfTextLength;
		
		String firstHalfText = plainText.substring(0, firstHalfTextLength);
		String secondHalfText = plainText.substring(firstHalfTextLength, plainText.length());
		
		String shuffledString = "";
		for(int i = 0; i<firstHalfText.length(); i++) {
			shuffledString = shuffledString + firstHalfText.substring(i,i+1);
			if(i<secondHalfText.length()) {
				shuffledString = shuffledString + secondHalfText.substring(i,i+1);
			}
		}
		return shuffledString;
		
	}
	
	@Override
	public String encode(String plainText) {
		//String loop = plainText;
		for(int i = 0; i<noOfShuffle; i++) {
			plainText = oneShuffle(plainText);
		}
		return plainText;
	}

	
}
