public class ConstructorExample {

    public static void main(String[] args) {
        // Using default constructor
        Vehicle v1 = new Vehicle();
        System.out.println("v1 year (default): " + v1.getYear());

        // Using parameterized constructor
        Vehicle myVehicle = new Vehicle("Red", "Toyota", 2021);
        myVehicle.startEngine();
        System.out.println("Color: " + myVehicle.getColor());

        // Calling a static utility method
        int sum = MathUtils.add(5, 3);
        System.out.println("5 + 3 = " + sum);

        // Encapsulation with BankAccount
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        System.out.println("Balance: " + account.getBalance());

        // Static field and method on Vehicle
        Vehicle v2 = new Vehicle("Blue", "Honda", 2020);
        Vehicle v3 = new Vehicle("Black", "Ford", 2019);
        System.out.println("Number of vehicles: " + Vehicle.getNumberOfVehicles());
    }
}

class Vehicle {
    private String color;
    private String model;
    private int year;

    private static int numberOfVehicles = 0;

    public Vehicle() {
        this("Unknown", "Unknown", 0);
    }

    public Vehicle(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
        numberOfVehicles++;
    }

    public void startEngine() {
        System.out.println("The engine is starting.");
    }

    public void stopEngine() {
        System.out.println("The engine is stopping.");
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }
}

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}
