import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExamples {

    public static void main(String[] args) {

        // ---------- Text file writing with BufferedWriter ----------
        System.out.println("Writing to output.txt using BufferedWriter...");
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("output.txt"))) {

            writer.write("Hello, World!");
            writer.newLine();                            // adds a new line
            writer.write("Writing to a file in Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ---------- Binary file writing with FileOutputStream ----------
        System.out.println("Writing to binary.dat using FileOutputStream...");
        try (FileOutputStream fos =
                     new FileOutputStream("binary.dat")) {

            fos.write("Hello, Binary World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done.");
    }
}
