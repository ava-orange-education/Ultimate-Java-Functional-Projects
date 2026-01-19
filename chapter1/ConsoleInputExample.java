import java.util.Scanner;

public class ConsoleInputExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Console output examples
        System.out.print("Hello, ");                 // prints without newline
        System.out.println("World!");                // prints with newline

        System.out.printf("Hello, %s! You are %d years old.%n", "Alice", 30);

        // Console input with Scanner
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();            // reads a line of text
        System.out.println("Hello, " + name + "!");

        // Example of reading different data types
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();                 // reads an int
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();        // reads a double

        System.out.println("You are " + age + " years old and " + height + " meters tall.");

        scanner.close();                             // always close the scanner
    }
}
