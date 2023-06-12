package classesAndInterfaces;

public class Flight {
	
	// These shouldn't be accessible from main.
	private int passengers, seats = 150;
	
	public int getPassengers() {
		return passengers;
	}
	
	// This is a static variable
	private static int allPassengers, maxPassengersPerFlight;
	// These are static methods
	public static int getAllPassengers() {
		return allPassengers;
	}
	public static void resetAllPassengers() {
		allPassengers = 0;
	}
	
	// This is a static initialization block
	static {
		AdminService admin = new AdminService();
		admin.connect();
		maxPassengersPerFlight = admin.isRestricted() ? admin.getMaxFlightPassengers() : Integer.MAX_VALUE;
		admin.close();
	}
	
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
		if(passengers < seats && passengers < maxPassengersPerFlight) {
			passengers += 1;
			allPassengers += 1;	// Static variable
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
