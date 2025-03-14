package String;

public class String_Methods {
	public static void main(String[] args) {
		String str = " Siddhant Deshmukh ";

		// Length of the String
		System.out.println("Length: " + str.length());

		// Removing spaces
		System.out.println("Trimmed: " + str.trim() + "");
		
		// Removing spaces
		System.out.println("Remove Space: " + str.replace(" ", ""));

		// Substring
		System.out.println("Substring (9, 18): " + str.substring(8, 17));

		// Converting to Uppercase
		System.out.println("Uppercase: " + str.toUpperCase());

		// Replace characters
		System.out.println("Replace 'Siddhant' with 'Arti': " + str.replace("Siddhant", "Arti"));

		// Split
		String[] words = str.trim().split(",");
		System.out.println("Split result: " + String.join(" | ", words));
	}
}
