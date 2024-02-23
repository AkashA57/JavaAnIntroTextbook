package chat.eight.interfaces;

import java.util.Objects;

public class Doctor extends Person{
	
	private String speciality;
	private double officeVisitFee;
	
	public Doctor() {
		super();
		speciality = "no speciality yet";
		officeVisitFee = 0;
	}
	
	public Doctor(String name, String speciality, double officeVisitFee) {
		super(name);
		this.speciality = speciality;
		this.officeVisitFee = officeVisitFee;
	}
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public double getOfficeVisitFee() {
		return officeVisitFee;
	}

	public void setOfficeVisitFee(double officeVisitFee) {
		this.officeVisitFee = officeVisitFee;
	}
	
	public void writeOutput() {
		super.writeOutput();

        System.out.println("Speciality: " + speciality);
        System.out.println("Fee: " + officeVisitFee);
	}

	public boolean equals(Doctor obj) {
		return (officeVisitFee == obj.officeVisitFee)
				&& Objects.equals(speciality, obj.speciality) 
				&& hasSameName(obj);
	}

	

}
