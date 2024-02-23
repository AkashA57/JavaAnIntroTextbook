package chat.nine;

public class Employee {
	
	private String name;
	private int socialSecurity;
	private int salary;
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(int socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", socialSecurity=" + socialSecurity + ", salary=" + salary + "]";
	}
	
	

}
