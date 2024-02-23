package chat.eight;

public class ChildClass extends FatherClass{
	
	private String name;
	
	public ChildClass() {
		this("aks");
		System.out.print("Hey yo!");
		
	}
	
	public ChildClass(String name) {
		super(name);
		super.getName();
	}

	

	public String getName() {
		super.getName();
		return name;
	}

	public void fixName(String name) {
		
		this.name = name;
	}
	
	

}
