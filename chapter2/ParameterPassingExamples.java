public class ParameterPassingExamples {

    public static void main(String[] args) {

        // 1. Passing primitive data type
        int value = 5;
        modifyPrimitive(value);
        System.out.println("Value after method call: " + value); // still 5

        // 2. Passing object reference
        Car2 car = new Car2();
        car.model = "Toyota";
        changeModel(car);
        System.out.println("Car model after change: " + car.model); // Tesla

        // 3. Passing arrays
        int[] numbers = {1, 2, 3};
        modifyArray(numbers);
        System.out.println("First element after modification: " + numbers[0]); // 99

        // 4. Returning primitive value from method
        int sum = add(4, 6);
        System.out.println("Sum of 4 and 6: " + sum);

        // 5. Returning an object from a method
        Car2 factoryCar = CarFactory.createCar();
        System.out.println("Factory car model: " + factoryCar.model + ", year: " + factoryCar.year);

        // 6. Varargs (variable‑length arguments)
        Calculator1 calc = new Calculator1();
        int varargSum = calc.sum(1, 2, 3, 4, 5);
        System.out.println("Vararg sum: " + varargSum);
    }

    // ----- Passing primitive -----
    public static void modifyPrimitive(int num) {
        num = 10; // local change only
    }

    // ----- Passing object reference -----
    public static void changeModel(Car2 car) {
        car.model = "Tesla"; // modifies original object's field
    }

    // ----- Passing arrays -----
    public static void modifyArray(int[] arr) {
        if (arr != null && arr.length > 0) {
            arr[0] = 99; // modifies original array
        }
    }

    // ----- Returning primitive -----
    public static int add(int a, int b) {
        return a + b;
    }
}

// Simple Car class used for object and return examples
class Car2 {
    String model;
    int year;
}

// Factory that returns a Car object
class CarFactory {
    public static Car2 createCar() {
        Car2 car = new Car2();
        car.model = "Toyota";
        car.year = 2021;
        return car;
    }
}

// Varargs example
class Calculator1 {
    public int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
