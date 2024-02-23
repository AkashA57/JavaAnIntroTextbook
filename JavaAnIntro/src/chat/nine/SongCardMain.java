package chat.nine;

public class SongCardMain {

	public static void main(String[] args) {
		
		SongCard giftCard = new SongCard(5);
		
		try {
			//giftCard.buyASong();
			giftCard.activate();
			for(int i = 0; i<6; i++) {
				giftCard.buyASong();
				System.out.println("The number of songs"
						+ " remaining in the card is " + giftCard.songsRemaining());
			}
		}
		catch(AlreadyActivatedException e) {
			System.out.println(e.getMessage());
		}
		catch(NotActivatedException e) {
			System.out.println(e.getMessage());
		}
		catch(CardUsedException e) {
			System.out.println(e.getMessage());
		}
	}

}
