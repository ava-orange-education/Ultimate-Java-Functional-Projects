public class InheritanceTypesExample {

    public static void main(String[] args) {
        // Single inheritance demo
        Dog dog = new Dog();
        System.out.println("Single inheritance:");
        dog.eat();   // from Animal
        dog.bark();  // from Dog

        // Multilevel inheritance demo
        Labrador lab = new Labrador();
        System.out.println("\nMultilevel inheritance:");
        lab.eat();    // from Animal
        lab.bark();   // from Dog
        lab.fetch();  // from Labrador

        // Hierarchical inheritance demo
        Cat cat = new Cat();
        System.out.println("\nHierarchical inheritance:");
        dog.eat();   // Animal -> Dog
        cat.eat();   // Animal -> Cat
        cat.meow();  // Cat-specific
    }
}

// ----- Base class for all examples -----
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

// ----- Single & multilevel intermediate class -----
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking...");
    }
}

// ----- Multilevel leaf class -----
class Labrador extends Dog {
    public void fetch() {
        System.out.println("Labrador is fetching...");
    }
}

// ----- Additional subclass for hierarchical inheritance -----
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing...");
    }
}
