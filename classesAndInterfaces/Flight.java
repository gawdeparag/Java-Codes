package classesAndInterfaces;

public class Flight {
	
	// These shouldn't be accessible from main.
	private int passengers, 
				seats = 150, 
				flightNumber;
	
	private char flightClass;
	
	private boolean[] isSeatAvailable = new boolean[seats];
	
	// Initialization Block
	{
		for(int i = 0; i < seats; i++) {
			isSeatAvailable[i] = true;
		}
	}
	
	public Flight() { }
	
	public Flight(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public Flight(char flightClass) {
		this.flightClass = flightClass;
	}
	
	
	// Field Accessor :: getter method
	public int getSeats() {
		return seats;
	}
	// Field Mutator :: setter method
	public void setSeats (int seats) {
		this.seats = seats;
	}
	
	
	// This method is accessible from main.
	public void addOnePassenger() {
		if(passengers < seats) {
			passengers += 1;
		} else {
			handleTooManyPassengers();
		}
	}
	
	// This method isn't accessible from main.
	private void handleTooManyPassengers() {
		System.out.println("Booking is closed for this flight!");
	}
	
	// Special references:: "this"
	public boolean hasRoom(Flight flightTwo) {
		int total = this.passengers + flightTwo.passengers;
		return total <= seats;
	}

}
