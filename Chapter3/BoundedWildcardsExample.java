public class BoundedWildcardsExample {

    public static void main(String[] args) {
        // Upper-bounded wildcard: accepts Box of any subtype of Number
        Box<Integer> intBox = new Box<>();
        intBox.setContent(100);
        BoxUtil.printNumbers(intBox);   // Works because Integer extends Number

        // Lower-bounded wildcard: accepts Box of Integer or any of its supertypes
        Box<Number> numberBox = new Box<>();
        BoxUtil.addNumbers(numberBox);  // Can safely store Integer into Box<Number>
        System.out.println("Number in numberBox: " + numberBox.getContent());
    }
}

// Utility methods using bounded wildcards
class BoxUtil {

    // Upper bounded wildcard method
    public static void printNumbers(Box<? extends Number> box) {
        System.out.println("Number: " + box.getContent());
    }

    // Lower bounded wildcard method
    public static void addNumbers(Box<? super Integer> box) {
        box.setContent(123); // Allowed because box can hold Integer or its supertypes
    }
}
