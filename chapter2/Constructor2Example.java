public class Constructor2Example {

    public static void main(String[] args) {

        // 1. No-argument constructor (explicit, sets custom defaults)
        Vehicle1 v1 = new Vehicle1();
        System.out.println("v1 -> model=" + v1.getModel() + ", year=" + v1.getYear());

        // 2. Parameterized constructor
        Vehicle1 v2 = new Vehicle1("Toyota", 2022);
        System.out.println("v2 -> model=" + v2.getModel() + ", year=" + v2.getYear());

        // 3. Copy constructor
        Vehicle1 v3 = new Vehicle1(v2);
        System.out.println("v3 (copy of v2) -> model=" + v3.getModel() + ", year=" + v3.getYear());

        // 4. Default constructor from compiler:
        //    This is illustrated by SimpleVehicle: no constructors defined,
        //    so Java provides a default one.
        SimpleVehicle sv = new SimpleVehicle();
        System.out.println("sv -> model=" + sv.getModel() + ", year=" + sv.getYear());
    }
}

// Matches the Car examples but renamed to Vehicle
class Vehicle1 {
    private String model;
    private int year;

    // No-argument constructor (explicit)
    public Vehicle1() {
        this.model = "Unknown";
        this.year = 2020;
    }

    // Parameterized constructor
    public Vehicle1(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Copy constructor
    public Vehicle1(Vehicle1 otherVehicle) {
        this.model = otherVehicle.model;
        this.year = otherVehicle.year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Class with only fields: compiler provides a default constructor
class SimpleVehicle {
    private String model;
    private int year;

    // No constructors declared: Java adds a default constructor
    // SimpleVehicle() { }  // implied

    public String getModel() {
        return model; // default null
    }

    public int getYear() {
        return year;  // default 0
    }
}
