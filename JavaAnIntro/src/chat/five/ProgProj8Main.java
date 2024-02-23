package chat.five;

public class ProgProj8Main {

	public static void main(String[] args) {
		
		ProgProj8 progPro8 = new ProgProj8();
		
		progPro8.setName("Birmasan Band");
		progPro8.setVenueCapacity(50000);
		
		progPro8.setTicketSoldByPhone();
		progPro8.setTicketSold();
		
		progPro8.setPriceByPhone(500);
		progPro8.setPriceAtVenue(1000);
		System.out.println(progPro8.getTotalSaleAmount());
		

	}

}
