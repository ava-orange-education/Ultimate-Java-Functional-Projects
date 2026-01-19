public class BasicInheritanceExample {

    public static void main(String[] args) {
        Car3 myCar = new Car3("Toyota");
        myCar.start();        // Inherited method from Vehicle
        myCar.displayInfo();  // Uses inherited field + its own field
    }
}

// Superclass
class Vehicle4 {
    protected String brand = "Vehicle Brand";  // Protected so subclasses can access

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass
class Car3 extends Vehicle4 {
    private String model;

    public Car3(String model) {
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);  // Accessing inherited field
        System.out.println("Model: " + model);
    }
}
