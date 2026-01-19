public class AbstractClassPolymorphismExample {

    public static void main(String[] args) {
        Vehicle5 myVehicle = new Car5();   // Polymorphic reference
        myVehicle.start();               // Output: Car is starting...

        myVehicle = new Bike();          // Polymorphic reference
        myVehicle.start();               // Output: Bike is starting...
    }
}

// Abstract superclass
abstract class Vehicle5 {
    public abstract void start();        // Abstract method
}

// Concrete subclass 1
class Car5 extends Vehicle5 {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Concrete subclass 2
class Bike extends Vehicle5 {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}
