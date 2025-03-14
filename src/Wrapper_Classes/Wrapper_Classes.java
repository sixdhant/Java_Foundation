package Wrapper_Classes;

public class Wrapper_Classes 
{
	public static void main(String[] args) {
		// 1. Autoboxing: Primitive to Object (automatic conversion)
		int num = 10;
		Integer numObj = num; // Autoboxing: int to Integer

		// 2. Unboxing: Object to Primitive (automatic conversion)
		Integer numObj2 = 20;
		int numPrimitive = numObj2; // Unboxing: Integer to int

		// 3. Using utility methods
		// Convert a string to a primitive (parsing)
		String str = "100";
		int parsedNum = Integer.parseInt(str); // Convert string to int
		System.out.println("Parsed Number: " + parsedNum);

		// Convert a string to Double
		String strDouble = "3.14";
		double parsedDouble = Double.parseDouble(strDouble); // Convert string to double
		System.out.println("Parsed Double: " + parsedDouble);

		// 4. Converting wrapper objects to strings
		Integer numObj3 = 50;
		System.out.println("Integer as String: " + numObj3.toString()); // Output: "50"

		// 5. Comparing Wrapper Objects
		Integer num1 = 100;
		Integer num3 = 100; // Renamed the duplicate variable
		System.out.println("Comparison: " + num1.compareTo(num3)); // Output: 0 (equal)

		// 6. Using valueOf to get wrapper objects
		Integer numObj4 = Integer.valueOf(200);
		System.out.println("Integer Object: " + numObj4); // Output: 200

		// 7. Working with Boolean (example)
		Boolean boolObj = Boolean.valueOf("true");
		System.out.println("Boolean Object: " + boolObj); // Output: true

		// 8. Nullability: wrapper class objects can be null
		Integer numObj5 = null;
		System.out.println("Null Integer Object: " + numObj5); // Output: null
	}
}
