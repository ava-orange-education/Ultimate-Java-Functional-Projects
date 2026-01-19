public class CarExample {
    public static void main(String[] args) {
        ModelCar myCar = new ModelCar("Red", "Toyota", 2021);
        myCar.startEngine();
        System.out.println("Car color: " + myCar.getColor());
    }
}

class ModelCar {
    // Fields (Attributes)
    private String color;
    private String model;
    private int year;

    // Constructor
    public ModelCar(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Methods (Functions)
    public void startEngine() {
        System.out.println("The engine is starting.");
    }

    public void stopEngine() {
        System.out.println("The engine is stopping.");
    }

    public String getColor() {
        return color;
    }
}

