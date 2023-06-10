package constructorsAndInitializers;

public class Passenger {
	// Every class will have an empty constructor by default, even if it isn't declared explicitly in the code.
	
	private int checkedBags;
	public int getCheckedBags() {
		return this.checkedBags;
	}
	public void setCheckedBags(int checkedBags) {
		this.checkedBags = checkedBags;
	}
	
	private int freeBags;
	public int getFreeBags() {
		return this.freeBags;
	}
	
	private double perBagFee;
	
	
	public Passenger() { }		// DEFAULT CONSTRUCTOR
	
	public Passenger(int freeBags) {
		this(freeBags > 1 ? 25.0d: 50.0d);
		this.freeBags = freeBags;
	}
	
	public Passenger(int freeBags, int checkedBags) {
		this(freeBags);
		this.checkedBags = checkedBags;
	}
	
	private Passenger(double perBagFee) {
		this.perBagFee = perBagFee;
	}
	// Above is an example of "Constructor Chaining".
	
}
