public class GenericBoxExample {

    public static void main(String[] args) {
        // Box with String
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        System.out.println("String content: " + stringBox.getContent());

        // Box with Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer content: " + integerBox.getContent());
    }
}

// Defining a generic class
class Box<T> {        // T is the type parameter
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
