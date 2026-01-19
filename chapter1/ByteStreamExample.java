import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("input.dat");
             FileOutputStream fos = new FileOutputStream("output.dat")) {

            int byteData;
            // Read each byte from input.dat and write it to output.dat
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("Finished copying input.dat to output.dat using byte streams.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
