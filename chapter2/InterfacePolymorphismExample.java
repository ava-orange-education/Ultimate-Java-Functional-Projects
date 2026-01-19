public class InterfacePolymorphismExample {

    public static void main(String[] args) {
        Shape myShape = new Circle();      // Polymorphic reference to Circle
        myShape.draw();                    // Output: Drawing a Circle

        myShape = new Rectangle();         // Polymorphic reference to Rectangle
        myShape.draw();                    // Output: Drawing a Rectangle
    }
}

// Interface
interface Shape {
    void draw();
}

// Implementing class 1
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Implementing class 2
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
