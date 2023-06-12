package staticMembers;
import classesAndInterfaces.Flight;

public class importerClass {
	public static void main(String args[]) {
		Flight.resetAllPassengers();
		
		Flight mumToDel = new Flight();
		mumToDel.addOnePassenger();
		mumToDel.addOnePassenger();
		
		Flight kolToChe = new Flight();
		kolToChe.addOnePassenger();
		
		System.out.println(Flight.getAllPassengers());
	}
	
}
