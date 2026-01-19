import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Annotation definition
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "default value";
    int count();
}

// Using the annotation
@MyAnnotation(value = "Sample Annotation", count = 3)
class AnnotatedClass {
    public void display() {
        System.out.println("Display method");
    }
}

public class AnnotationReflectionExample {

    public static void main(String[] args) {
        try {
            Class<AnnotatedClass> clazz = AnnotatedClass.class;

            // Checking for the annotation on the class
            if (clazz.isAnnotationPresent(MyAnnotation.class)) {
                Annotation annotation = clazz.getAnnotation(MyAnnotation.class);
                MyAnnotation myAnnotation = (MyAnnotation) annotation;

                System.out.println("Value: " + myAnnotation.value());
                System.out.println("Count: " + myAnnotation.count());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
