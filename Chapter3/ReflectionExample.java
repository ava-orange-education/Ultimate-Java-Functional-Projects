import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        try {
            // ----- Example 1: Inspecting a class with reflection -----
            Class<?> clazz = Class.forName("java.util.ArrayList");

            // Printing class name
            System.out.println("Class Name: " + clazz.getName());

            // Printing all declared methods of the class
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
            }

            // ----- Example 2: Creating an instance at runtime -----
            Object instance = clazz.getDeclaredConstructor().newInstance();
            System.out.println("Instance created: " + instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
