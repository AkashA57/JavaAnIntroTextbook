package chat.five;

import java.util.Objects;
import java.util.Scanner;

public class ProgProj8 {
	
	private String name;
	private int venueCapacity;
	private int ticketSold;
	private int ticketSoldByPhone;
	private int priceByPhone;
	private int priceAtVenue;
	private int totalSaleAmount;
	
	Scanner keyboard = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getVenueCapacity() {
		return venueCapacity;
	}
	public void setVenueCapacity(int venueCapacity) {
		this.venueCapacity = venueCapacity;
	}
	
	public int getTicketSold() {
		return ticketSold;
	}
	/** Precondition: Venue capacity should be initialized.
	 *  sets no of tickets sold if less than or equal to venue capacity.
	 */
	public void setTicketSold() {
		System.out.println("Enter no of tickets sold");
		int ticketSold = keyboard.nextInt();
		while(ticketSold>getVenueCapacity()) {
			System.out.println("No of tickets exceeded venue capacity!"
					+ "\n Try Again!");
			System.out.println("Enter no of tickets sold");
			ticketSold = keyboard.nextInt();
		}
		this.ticketSold = ticketSold;
	}
	
	public int getTicketSoldByPhone() {
		return ticketSoldByPhone;
	}
	/** Precondition: Ticket sold should be initialized.
	 *  sets no of tickets sold by phone if less than or equal to ticket sold.
	 */
	public void setTicketSoldByPhone() {
		
		System.out.println("Enter no of tickets sold by phone");
		int ticketSoldByPhone = keyboard.nextInt();
		while(ticketSoldByPhone>getTicketSold()) {
			System.out.println("No of tickets sold by phone exceeded tickets sold!"
					+ "\n Try Again!");
			System.out.println("Enter no of tickets sold by phone");
			ticketSoldByPhone = keyboard.nextInt();
		}
		this.ticketSoldByPhone = ticketSoldByPhone;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgProj8 other = (ProgProj8) obj;
		return Objects.equals(name, other.name);
	}
	public int getPriceByPhone() {
		return priceByPhone;
	}
	public void setPriceByPhone(int priceByPhone) {
		this.priceByPhone = priceByPhone;
	}
	
	public int getPriceAtVenue() {
		return priceAtVenue;
	}
	public void setPriceAtVenue(int priceAtVenue) {
		this.priceAtVenue = priceAtVenue;
	}
	
	public int getTotalSaleAmount() {
		setTotalSaleAmount();
		System.out.print("Total sale amount: ");
		return totalSaleAmount;
	}
	private void setTotalSaleAmount() {
		int totalSaleAmount = getPriceByPhone() * getTicketSoldByPhone()
				+ getPriceAtVenue() * (getTicketSold() - getTicketSoldByPhone());
		this.totalSaleAmount = totalSaleAmount;
	}
	
		

}
