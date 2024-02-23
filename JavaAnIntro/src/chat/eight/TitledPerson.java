package chat.eight;

public class TitledPerson extends Person{
	private String title;
	
	public TitledPerson() {
		super();
	}
	
	public TitledPerson(String name, String title) {
		super(name);
		setTitle(title);
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Title: " + title);
	}
	
	public void reset(String name, String title) {
		setName(name);
		setTitle(title);
	}
	
	public boolean equals(TitledPerson titledPerson) {
		return (getName().hasSameName(titledPerson) && (title.equals(titledPerson.getTitle())));
	}
	
}
