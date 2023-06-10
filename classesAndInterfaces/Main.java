package classesAndInterfaces;

public class Main {

	public static void main(String[] args) {
		
		// Code for MathEquation class
		performCalculations();
		
		// Code for Flight class:: Learning about encapsulation and access modifiers
		Flight flightOne = new Flight();
		Flight flightTwo = new Flight(370);
		flightOne.addOnePassenger();
		flightTwo.addOnePassenger();
		
		Flight flightThree = null;	// Special references :: "null"
		if(flightOne.hasRoom(flightTwo)) {
			// Do some combine operations.
		}
		
		// Accessing private variables with getter and setter methods included in "Flight" class.
		Flight MumToDel = new Flight();
		MumToDel.setSeats(200);
		System.out.println("Mumbai to Delhi flight has " + MumToDel.getSeats() + " seats.");
		
	}
	
	// Code for MathEquation class
	static void performCalculations() {
		double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opCodes = {'a', 's', 'm', 'd'};
		
		MathEquation[] equations = new MathEquation[4];
		
		for(int i = 0; i < equations.length; i++) {
			equations[i] = new MathEquation(leftVals[i], rightVals[i], opCodes[i]);
		}
		
		for(MathEquation equation : equations) {
			equation.execute();
			System.out.println("Result = " + equation.result);
		}
		
		
	}

	
}
