public class StringExamples {

    public static void main(String[] args) {

        // ----- Basic String usage -----
        String str1 = "Hello";
        String str2 = str1.concat(" World");   // str1 remains "Hello", str2 is "Hello World"
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        String s1 = "Java";                   // stored in String pool
        String s2 = new String("Java");       // stored in heap
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // ----- Common String Methods -----
        String text = "Java Programming";

        // length()
        System.out.println("Length: " + text.length());

        // charAt()
        System.out.println("charAt(4): " + text.charAt(4));

        // substring(beginIndex, endIndex)
        System.out.println("substring(5, 16): " + text.substring(5, 16));

        // indexOf()
        System.out.println("indexOf(\"Program\"): " + text.indexOf("Program"));

        // equals, equalsIgnoreCase, compareTo
        String s11 = "Java";
        String s22 = "java";
        System.out.println("s11.equals(s22): " + s11.equals(s22));
        System.out.println("s11.equalsIgnoreCase(s22): " + s11.equalsIgnoreCase(s22));
        System.out.println("s11.compareTo(\"Java\"): " + s11.compareTo("Java"));

        // toLowerCase, toUpperCase, trim, replace
        String spaced = "  Hello  ";
        System.out.println("toLowerCase: " + text.toLowerCase());
        System.out.println("toUpperCase: " + text.toUpperCase());
        System.out.println("trim: '" + spaced.trim() + "'");
        System.out.println("replace 'a' with 'A': " + text.replace('a', 'A'));

        // ----- StringBuilder example -----
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);   // "Hello World"

        // ----- StringBuffer example -----
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        System.out.println("StringBuffer: " + sbuf);  // "Hello World"
    }
}
