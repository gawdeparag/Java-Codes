// This program shows example of Method Overriding
// And Class casting (Upcasting and Downcasting)

class Vehicle {
    void honk() {
        System.out.println("Beep");
    }
}
class Car extends Vehicle {
    void honk() {
        System.out.println("Beep Bop");
    }
    void runs() {
        System.out.println("Runs on road");
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        // Example of Upcasting (Subclass to Superclass) - Implicit
        Vehicle carOne = new Car(); // Upcasting a Car object to Vehicle reference.
        carOne.honk();

//        Car forbiddenCar = new Vehicle();
        // This is not allowed because
        // incompatible types: Vehicle cannot be converted to Car.

        // An example of Upcasting, this would allow downcasting, will take code in if condition.
        Vehicle vehicle = new Car();

        // Just an object declaration, this will take the code in else condition.
//        Vehicle vehicle = new Vehicle();

        // Downcasting (Superclass to subclass) - Explicit
        if (vehicle instanceof Car) {   // Check if vehicle is an instance of Car, if yes allow Downcasting
            Car downCar = (Car) vehicle;    // Downcasting statement
            downCar.runs(); // Accessing Car-specific method.
        } else {
            System.out.println("This object is not a Car");
        }

    }
}
