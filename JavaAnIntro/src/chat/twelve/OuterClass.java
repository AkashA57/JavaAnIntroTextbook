package chat.twelve;

public class OuterClass {
	
	private String name;
	
	private String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.s
	}
	
	private class InnerClass {
		
		private int roll;
		
		private int getRoll() {
			return roll;
		}
		
		private void setRoll(int roll) {
			this.roll = roll;
		}
		
		public void testMethod() {
			System.out.println(name);
			setName("heloo");
			
		}
		
	}

}
