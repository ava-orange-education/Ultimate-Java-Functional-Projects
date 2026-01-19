public class ConstructorOverloadingExample {

    public static void main(String[] args) {
        // Uses no-argument constructor
        Vehicle2 car1 = new Vehicle2();
        System.out.println("car1 -> model=" + car1.getModel() + ", year=" + car1.getYear());

        // Uses single-parameter constructor
        Vehicle2 car2 = new Vehicle2("Ford");
        System.out.println("car2 -> model=" + car2.getModel() + ", year=" + car2.getYear());

        // Uses two-parameter constructor
        Vehicle2 car3 = new Vehicle2("BMW", 2023);
        System.out.println("car3 -> model=" + car3.getModel() + ", year=" + car3.getYear());
    }
}

// Constructor-overloading example (renamed from Car to Vehicle)
class Vehicle2 {
    private String model;
    private int year;

    // No-argument constructor
    public Vehicle2() {
        this("Unknown", 2020);   // Calls single-parameter constructor
    }

    // Parameterized constructor with one parameter
    public Vehicle2(String model) {
        this(model, 2020);       // Calls two-parameter constructor
    }

    // Overloaded constructor with two parameters
    public Vehicle2(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
