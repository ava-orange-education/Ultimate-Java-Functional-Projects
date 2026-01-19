public class InterfaceImplementationExample {

    public static void main(String[] args) {

        // Implementation of interface (Bike implements Drivable)
        Drivable myBike = new Bike1();
        myBike.drive();   // Output: Bike is driving...

        System.out.println();

        // Multiple interface inheritance (ElectricCar implements Drivable, Electric)
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.drive();          // Output: Electric car is driving...
        myElectricCar.chargeBattery();  // Output: Charging the battery...
    }
}

// ----- Single interface example -----
interface Drivable {
    void drive();
}

class Bike1 implements Drivable {
    @Override
    public void drive() {
        System.out.println("Bike is driving...");
    }
}

// ----- Multiple interface inheritance example -----
interface Electric {
    void chargeBattery();
}

class ElectricCar implements Drivable, Electric {

    @Override
    public void drive() {
        System.out.println("Electric car is driving...");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery...");
    }
}
