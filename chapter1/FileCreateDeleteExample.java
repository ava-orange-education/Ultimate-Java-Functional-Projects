import java.io.File;
import java.io.IOException;

public class FileCreateDeleteExample {
    public static void main(String[] args) {
        File file = new File("newfile.txt");

        // Create file
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Delete file
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
