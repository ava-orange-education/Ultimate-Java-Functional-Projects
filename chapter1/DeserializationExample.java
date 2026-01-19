import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializationExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("person.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person person = (Person) ois.readObject();
            System.out.println(
                    "Deserialized Person: " + person.getName() + ", " + person.getAge()
            );
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
