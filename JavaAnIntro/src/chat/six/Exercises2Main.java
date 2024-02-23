package chat.six;

public class Exercises2Main {

	public static void main(String[] args) {
		
		Exercises2 time = new Exercises2();
		 
		time.setTime(25, 33);
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		
		System.out.println("----------------------");
		
		time.setTime(25, 33, true);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		
		System.out.println("----------------------");
		
		time.setTime(10, 33);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		
		System.out.println("----------------------");
		
		time.setTime(20, 33, false);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		
		System.out.println("----------------------");
		
		time.setTime(10, 33, false);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());

	}

}
