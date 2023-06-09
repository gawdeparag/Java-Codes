package classesAndInterfaces;

public class Flight {
	
	// These shouldn't be accessible from main.
	private int passengers; 
	private int seats;
	// Field Accessor :: getter method
	public int getSeats() {
		return seats;
	}
	// Field Mutator :: setter method
	public void setSeats (int seats) {
		this.seats = seats;
	}
	
	// Constructor: Using to set an object's initial state.
	// This constructor can be accessed from main.
	public Flight(){
		passengers = 0;
		seats = 150;
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
