public class PolymorphismExample {

    public static void main(String[] args) {
        // Compile-time polymorphism: method overloading
        MathOperations math = new MathOperations();
        System.out.println("Sum of two integers: " + math.add(2, 3));
        System.out.println("Sum of three integers: " + math.add(2, 3, 4));
        System.out.println("Sum of two doubles: " + math.add(2.5, 3.5));

        // Run-time polymorphism: method overriding
        System.out.println("\nRun-time polymorphism:");
        SoundAnimal animal = new SoundAnimal();
        SoundAnimal dog = new SoundDog();

        animal.makeSound();  // base implementation
        dog.makeSound();     // overridden implementation
    }
}

// ----- Compile-time polymorphism (method overloading) -----
class MathOperations {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

// ----- Run-time polymorphism (method overriding) -----
class SoundAnimal {
    public void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

class SoundDog extends SoundAnimal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks...");
    }
}
