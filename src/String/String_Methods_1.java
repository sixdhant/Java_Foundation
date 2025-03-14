package String;

public class String_Methods_1 {
    public static void main(String[] args) {
        String str = "  Hello, Java!  ";

        // Length of the String
        System.out.println("Length: " + str.length());

        // Removing spaces
        System.out.println("Trimmed: '" + str.trim() + "'");

        // Substring
        System.out.println("Substring (7, 11): " + str.substring(7, 11));

        // Converting to Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Replace characters
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));

        // Split
        String[] words = str.trim().split(",");
        System.out.println("Split result: '" + String.join(" | ", words) + "'");
    }
}

