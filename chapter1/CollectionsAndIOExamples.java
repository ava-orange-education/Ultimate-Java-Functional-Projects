import java.io.*;
import java.util.*;

public class CollectionsAndIOExamples {

    public static void main(String[] args) throws Exception {

        // ----- List example -----
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        System.out.println("List: " + names);   // [John, Jane]

        // ----- Set example -----
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);                         // duplicate, ignored
        System.out.println("Set: " + numbers);  // [1, 2]

        // ----- Map example -----
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("Map value for Alice: " + map.get("Alice"));

        // ----- FileWriter example -----
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, World!");
        }

        // ----- BufferedReader + FileReader example -----
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line = reader.readLine();
            System.out.println("Read from file: " + line);
        }

        // ----- FileInputStream example (byte stream) -----
        try (FileInputStream fis = new FileInputStream("output.txt")) {
            int data = fis.read();              // reads first byte
            System.out.println("First byte value: " + data);
        }
    }
}
