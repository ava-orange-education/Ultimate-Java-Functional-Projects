import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExamples {

    public static void main(String[] args) {

        // ---------- Text file reading with BufferedReader ----------
        System.out.println("Reading text file (input.txt):");
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ---------- Binary file reading with FileInputStream ----------
        System.out.println("\nReading binary file (data.dat):");
        try (FileInputStream fis = new FileInputStream("data.dat")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);   // cast to char for readable output
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
