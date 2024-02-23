package chat.eight.interfaces;

public class DoxtorPersonMain {

	public static void main(String[] args) {
		
		Doctor doctorType1 = new Doctor();
		doctorType1.writeOutput();
		
		System.out.println();
		
		Doctor doctorType2 = new Doctor("Ram", "Heart", 45.00);
		doctorType2.writeOutput();
		
		System.out.println();
		
		Doctor doctorType3 = new Doctor("Ram", "Heart", 45.00);
		doctorType3.writeOutput();
		
		System.out.println();
		
		Doctor doctorType4 = new Doctor("Gopal", "ENT", 45.00);
		doctorType4.writeOutput();
		
		System.out.println();
		
		System.out.println("Comparing doctor2 and doctor3");
		System.out.println(doctorType2.equals(doctorType3));
		
		System.out.println("Comparing doctor3 and doctor4");
		System.out.println(doctorType3.equals(doctorType4));

	}

}
