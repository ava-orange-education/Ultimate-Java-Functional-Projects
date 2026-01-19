public class InstanceofOperatorExample {

    public static void main(String[] args) {
        Animal myAnimal = new Dog();   // Could also be new Cat();

        if (myAnimal instanceof Dog) {
            System.out.println("This is a Dog.");
        } else if (myAnimal instanceof Cat) {
            System.out.println("This is a Cat.");
        } else {
            System.out.println("This is an Animal.");
        }
    }
}
