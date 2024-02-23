package exam;

public class Bird {
	
		String name = "Ostrich";
		String color= "Brown";
		String eyes = "Brown";
		int age = 2;
		
		Bird(String name, String color, String eyes, int age) {
			this.name = name;
			this.color = color;
			this.eyes = eyes;
			this.age = age;
		}
		
		Bird(String name, String color) {
			this.name = name;
			this.color = color;
		}
		
		Bird(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		Bird(int age, String color) {
			this.age = age;
			this.color = color;
		}
		
		void printBird() {
			System.out.println(name);
			System.out.println(color);
			System.out.println(eyes);
			System.out.println(age);
		}

	public static void main(String[] args) {
		
		Bird b1= new Bird("Lophophorus", "RedBlue", "Black", 9);
		b1.printBird();
		
		Bird b2= new Bird("Crow", "Black");
		b2.printBird();
		
		Bird b3= new Bird("Sparrow", 2);
		b3.printBird();
		
		Bird b4= new Bird(12,"Brown");
		b4.printBird();
		
		
		
		
	}

}
