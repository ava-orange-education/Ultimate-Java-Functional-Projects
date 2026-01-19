public class RuntimePolymorphismExample {

    public static void main(String[] args) {
        Animal2 myAnimal = new Dog3();   // Polymorphic reference
        myAnimal.makeSound();          // Output: Dog barks

        myAnimal = new Cat1();          // Reassign to a different subtype
        myAnimal.makeSound();          // Output: Cat meows
    }
}

// Superclass
class Animal2 {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog3 extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat1 extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
