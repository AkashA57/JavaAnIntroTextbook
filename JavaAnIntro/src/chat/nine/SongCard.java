package chat.nine;

public class SongCard {

	private int songs;
	private boolean activated = false;
	
	public SongCard(int n) {
		songs = n;
	}
	
	public void activate() throws AlreadyActivatedException {
		if(activated==true) {
			throw new AlreadyActivatedException();
		}
		else {
			activated = true;
			System.out.println("Your card is activated");
		}
	}
	
	public void buyASong() throws NotActivatedException, CardUsedException {
		if(activated==false) {
			throw new NotActivatedException();
		}
		if(songs<1) {
			throw new CardUsedException();
		}
		else {
			songs = songs -1;
			System.out.println("You successfully bought a song");
		}
	}
	
	public int songsRemaining() {
		return songs;
	}
}
