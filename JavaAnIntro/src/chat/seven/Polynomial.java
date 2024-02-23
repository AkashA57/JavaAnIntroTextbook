package chat.seven;

public class Polynomial {
	
	int positiveDegree;
	float[] coefficients;
	
	public Polynomial(int max) {
		positiveDegree = max;
		coefficients = new float[max+1];
	}
	
	public void setConstant(int i, float value) {
		if(i>(positiveDegree)) {
			System.exit(0);
		}
		coefficients[i] = value;
	}
	
	public double evaluate(int x) {
		double sum = 0;
		for(int i = 0; i<coefficients.length; i++) {
			sum = sum + coefficients[i] * Math.pow(x, i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Polynomial equation = new Polynomial(5);
		
		equation.setConstant(0, 3);
		equation.setConstant(1, 1);
		equation.setConstant(2, 3);
		equation.setConstant(3, 4);
		equation.setConstant(5, 5);
		
		double result = equation.evaluate(2);
		
		for(float printCoefficients: equation.coefficients) {
			System.out.print(printCoefficients + " ");
		}
		
		System.out.println("The result is " + result);	

	}

}
