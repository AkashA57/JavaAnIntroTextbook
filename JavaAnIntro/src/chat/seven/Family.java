package chat.seven;

public class Family {
	
	private double income;
	private int size;
	
	public Family(int income, int size) {
		this.income = income;
		this.size = size;
	}
	
	public boolean isRich(double exp, double sav) {
		boolean rich = false;
		if((-exp+sav*size)>(income*0.6)) {
			rich = true;
		}
		return rich;
	}

	@Override
	public String toString() {
		return "Family [income=" + income + ", size=" + size + "]";
	}
	
	

}
