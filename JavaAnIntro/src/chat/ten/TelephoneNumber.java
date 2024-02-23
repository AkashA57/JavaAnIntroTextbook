package chat.ten;

public class TelephoneNumber {
	
	private int areaCode;
	private int exchangeCode;
	private int number;

	public TelephoneNumber(int areaCode, int exchangeCode, int number) throws Exception{
		super();
		if(areaCode<100 || areaCode>999) {
			throw new Exception("Area Code mismatch"); 
		} else {
			this.areaCode = areaCode;
		}
		
		if(exchangeCode<100 || exchangeCode>999) {
			throw new Exception("Exchange Code mismatch"); 
		} else {
			this.exchangeCode = exchangeCode;
		}
		
		if(number<1000 || number>9999) {
			throw new Exception("Number mismatch"); 
		} else {
			this.number = number;
		}
		
		
		
	}

	public TelephoneNumber(int exchangeCode, int number) throws Exception {
		super();
		if(exchangeCode<100 || exchangeCode>999) {
			throw new Exception("Exchange Code mismatch"); 
		} else {
			this.exchangeCode = exchangeCode;
		}
		
		if(number<1000 || number>9999) {
			throw new Exception("Number mismatch"); 
		} else {
			this.number = number;
		}
	}
	
	public TelephoneNumber(String aString) {
		String[] componentsPhone = aString.split(" ");
		componentsPhone = componentsPhone[2].split("-");
		setExchangeCode(Integer.parseInt(componentsPhone[1]));
		setNumber(Integer.parseInt(componentsPhone[2]));
	}

	

	public void setExchangeCode(int exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "TelephoneNumber = " + areaCode + "-" + exchangeCode + "-" + number;
	}
	
	



	
		


}
