package chat.seven;

public class SelfTestQ21 {

	public static void main(String[] args) {
		
		String[] entry = {"a","b","c","d"};
		for(String copy:entry) {
			System.out.println(copy);
		}
		System.out.println(entry);
		
		System.out.println("-------------------------");
		
		String[] copyEntry = entry;
		for(String copy:copyEntry) {
			System.out.println(copy);
		}
		System.out.println(copyEntry);
	}

}
