import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionFieldsAndMethodsExample {

    public static void main(String[] args) {
        try {
            // ----- Example 1: Accessing and modifying a private field -----
            Person1 person = new Person1();
            Class<?> personClass = person.getClass();

            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true); // allow access to private field

            System.out.println("Name before change: " + nameField.get(person));
            nameField.set(person, "Jane Doe");
            System.out.println("Name after change:  " + nameField.get(person));

            // ----- Example 2: Invoking a method dynamically -----
            Calculator calculator = new Calculator();
            Class<?> calcClass = calculator.getClass();

            Method addMethod = calcClass.getMethod("add", int.class, int.class);
            Object result = addMethod.invoke(calculator, 5, 3);
            System.out.println("Result of add(5, 3): " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Class with private field
class Person1 {
    private String name = "John Doe";
}
