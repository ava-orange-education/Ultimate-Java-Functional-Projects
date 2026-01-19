public class DependencyInjectionExample {

    public static void main(String[] args) {
        Engine1 engine = new Engine1();      // Create dependency
        Car7 car = new Car7(engine);         // Inject via constructor
        car.drive();                       // Uses injected Engine
    }
}

class Engine1 {
    public void start() {
        System.out.println("Engine starting...");
    }
}

class Car7 {
    private Engine1 engine;                // Dependency

    // Constructor Injection
    public Car7(Engine1 engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();                   // Delegation to injected dependency
        System.out.println("Car is driving...");
    }
}
