package Java_Math_Class;

public class Math_class {
	public static void main(String[] args) {
		// Using some methods from the Math class

		// Mathematical Constants
		System.out.println("Math.PI: " + Math.PI); // Output: 3.141592653589793
		System.out.println("Math.E: " + Math.E); // Output: 2.718281828459045

		// Absolute value
		System.out.println("Math.abs(-5): " + Math.abs(-5)); // Output: 5

		// Maximum and minimum values
		System.out.println("Math.max(10, 20): " + Math.max(10, 20)); // Output: 20
		System.out.println("Math.min(10, 20): " + Math.min(10, 20)); // Output: 10

		// Power and square root
		System.out.println("Math.pow(2, 3): " + Math.pow(2, 3)); // Output: 8.0
		System.out.println("Math.sqrt(16): " + Math.sqrt(16)); // Output: 4.0

		// Trigonometric functions (radians)
		System.out.println("Math.sin(Math.PI / 2): " + Math.sin(Math.PI / 2)); // Output: 1.0
		System.out.println("Math.cos(Math.PI): " + Math.cos(Math.PI)); // Output: -1.0

		// Logarithmic and exponential functions
		System.out.println("Math.log(10): " + Math.log(10)); // Output: 2.302585092994046
		System.out.println("Math.log10(100): " + Math.log10(100)); // Output: 2.0
		System.out.println("Math.exp(1): " + Math.exp(1)); // Output: 2.718281828459045

		// Rounding
		System.out.println("Math.round(4.5): " + Math.round(4.5)); // Output: 5
		System.out.println("Math.ceil(4.3): " + Math.ceil(4.3)); // Output: 5.0
		System.out.println("Math.floor(4.7): " + Math.floor(4.7)); // Output: 4.0

		// Generating a random number
		System.out.println("Math.random(): " + Math.random()); // Output: Random value between 0 and 1
	}
}
