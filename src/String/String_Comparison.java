package String;

public class String_Comparison 
{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        
        // Case-sensitive comparison
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // false

        // Case-insensitive comparison
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2)); // true

        // Lexicographical comparison
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // Negative value (H < h)
    }
}
