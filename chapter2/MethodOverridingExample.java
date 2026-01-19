public class MethodOverridingExample {

    public static void main(String[] args) {
        System.out.println("Overriding without super:");
        Animal1 animal1 = new Animal1();
        animal1.makeSound();          // Animal version

        Animal1 myDog1 = new Dog1();
        myDog1.makeSound();           // Dog version (overridden)

        System.out.println("\nOverriding with super:");
        DogWithSuper myDog2 = new DogWithSuper();
        myDog2.makeSound();           // Calls Animal + DogWithSuper versions
    }
}

// Base class
class Animal1 {
    public void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

// Subclass overriding the method
class Dog1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Dog barks...");
    }
}

// Subclass overriding and also calling super.makeSound()
class DogWithSuper extends Animal1 {
    @Override
    public void makeSound() {
        super.makeSound();            // Call superclass method
        System.out.println("Dog barks...");  // Additional behavior
    }
}
