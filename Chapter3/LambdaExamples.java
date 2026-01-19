import java.util.Arrays;
import java.util.List;

public class LambdaExamples {

    public static void main(String[] args) {

        // Example 1: Lambda implementing a functional interface
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3));      // 8

        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.operate(5, 3)); // 15

        // Example 2: Lambda with collections
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));
    }
}

// Functional interface
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
