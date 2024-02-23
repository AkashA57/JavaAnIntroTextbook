package chat.six;

public class Exercises2 {
	
	private int hour;
	private int minute;
	
	public Exercises2() {
		hour = 0;
		minute = 0;		
	}
	
	private boolean isValid(int hour, int minute) {
		boolean timeRange = false;
		if(hour >= 0 && hour <=23) {
			if (minute >= 0 && minute <=59) {
				timeRange = true;
			}
		}
		return timeRange;
	}
	
	public void setTime(int hour, int minute) {
		if(isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		}
	}
	
	public void setTime(int hour, int minute, boolean isAM) {
		if(isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
			
			if(hour >= 1 && hour <=12) {
				isAM = true;
			}
			else {
				isAM = false;
			}
			System.out.println("isAM: " + isAM);
		}
		
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}
	
}
