import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileOperationsExample {

    public static void main(String[] args) {
        Path source = Paths.get("source.txt");
        Path target = Paths.get("target.txt");

        // Copying a file
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Moving a file
        try {
            Files.move(target, Paths.get("moved-target.txt"),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deleting a file
        try {
            Files.delete(Paths.get("moved-target.txt"));
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
