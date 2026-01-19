public class CarDemo {

    public static void main(String[] args) {

        // Create an object of the Car class
        Car myCar = new Car();      // Creating an object of the Car class
        myCar.color = "Red";        // Accessing fields
        myCar.year = 2020;          // Accessing fields
        myCar.displayInfo();        // Calling method
    }
}

// Java Class (blueprint)
class Car {
    String color;
    int year;

    void displayInfo() {
        System.out.println("Color: " + color + ", Year: " + year);
    }
}
