import java.io.File;

public class DirectoryExample {
    public static void main(String[] args) {

        // Creating a directory
        File dir = new File("newdir");
        if (dir.mkdir()) {
            System.out.println("Directory created: " + dir.getName());
        }

        // Listing directories/files inside an existing directory
        File directory = new File("existingdir");
        String[] fileList = directory.list();
        if (fileList != null) {
            for (String fileName : fileList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
