import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationAndTerminalOps {

    public static void main(String[] args) {

        // ----- Creating streams from collections -----
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> nameStream = names.stream();
        Stream<String> parallelStream = names.parallelStream();

        System.out.println("Stream from collection:");
        nameStream.forEach(System.out::println);

        // ----- Creating streams from arrays -----
        String[] fruits = {"Apple", "Banana", "Orange"};
        Stream<String> fruitStream = Stream.of(fruits);

        System.out.println("\nStream from array:");
        fruitStream.forEach(System.out::println);

        // ----- Creating streams using generate() -----
        System.out.println("\nRandom numbers from Stream.generate():");
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        randomNumbers.forEach(System.out::println);

        // ----- Creating streams using iterate() -----
        System.out.println("\nEven numbers from Stream.iterate():");
        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(5);
        evenNumbers.forEach(System.out::println);

        // ----- Terminal operations: collect -----
        List<String> upperNames = Arrays.asList("Alice", "Bob", "Charlie")
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("\ncollect -> upperNames: " + upperNames);

        // ----- Terminal operations: forEach -----
        System.out.println("\nforEach over names:");
        Arrays.asList("Alice", "Bob", "Charlie")
                .stream()
                .forEach(System.out::println);

        // ----- Terminal operations: reduce -----
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("\nreduce -> sum: " + sum);

        // ----- Terminal operations: findFirst -----
        Optional<String> firstName = Arrays.asList("Alice", "Bob", "Charlie")
                .stream()
                .findFirst();
        System.out.println("\nfindFirst -> " + firstName.orElse("No names found"));

        // ----- Terminal operations: count -----
        long count = Arrays.asList("Alice", "Bob", "Charlie")
                .stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println("\ncount (names length > 3): " + count);
    }
}
