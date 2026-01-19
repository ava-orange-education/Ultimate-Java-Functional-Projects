import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWriteExample {

    public static void main(String[] args) {
        readFile("input.txt");
        writeFile("output.txt");
    }

    // Reading from a file using BufferedReader
    private static void readFile(String path) {
        System.out.println("=== Reading from " + path + " ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Writing to a file using BufferedWriter
    private static void writeFile(String path) {
        System.out.println("=== Writing to " + path + " ===");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("Hello, Advanced I/O!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
