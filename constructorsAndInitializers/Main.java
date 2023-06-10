package constructorsAndInitializers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger bob = new Passenger();
		bob.setCheckedBags(3);
		System.out.println(bob.getCheckedBags());
		
		Passenger alice = new Passenger(2);
		
		// Passenger joe = new Passenger(0.01d);	//This line of code won't work because that constructor is private
		
		Passenger geeta = new Passenger(2);
		
		Passenger john = new Passenger(2, 3);

	}

}
