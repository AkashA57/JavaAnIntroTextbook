package chat.six;

public class MerlinMain {

	public static void main(String[] args) {
		

		System.out.println(Merlin.summon());
		
		System.out.println(Merlin.summon().consult());
		
		String unique = Merlin.summon().toString();
		
		String a = Merlin.summon();
	}

}
