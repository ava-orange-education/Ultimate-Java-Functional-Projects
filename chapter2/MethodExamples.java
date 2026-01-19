public class MethodExamples {

    public static void main(String[] args) {
        // Defining and calling an instance method (Calculator.add)
        Calculator calc = new Calculator();
        int sum = calc.add(5, 3);
        System.out.println("Sum: " + sum);

        // Instance method on a class with a field (Vehicle.setModel)
        Vehicle3 vehicle = new Vehicle3();
        vehicle.setModel("Tesla");
        System.out.println("Vehicle model: " + vehicle.getModel());

        // Static method (MathUtils.multiply)
        int product = MathUtils1.multiply(4, 5);
        System.out.println("Product: " + product);

        // Method overloading (Printer.print)
        Printer printer = new Printer();
        printer.print("Hello");  // calls print(String)
        printer.print(123);      // calls print(int)
    }
}

// Defining and calling methods example
class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

// Instance method example (was Car)
class Vehicle3 {
    private String model;

    // Instance method to set model
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

// Static method example
class MathUtils1 {
    // Static method
    public static int multiply(int a, int b) {
        return a * b;
    }
}

// Method overloading example
class Printer {
    public void print(String text) {
        System.out.println(text);
    }

    public void print(int number) {
        System.out.println(number);
    }
}
