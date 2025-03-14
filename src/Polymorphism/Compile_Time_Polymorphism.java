package Polymorphism;

class Greeting {
	// Method to greet with just a name
	void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method to greet with name and age
	void greet(String name, int age) {
		System.out.println("Hello, " + name + "! You are " + age + " years old.");
	}

	// Method to greet with a different message
	void greet(String name, String message) {
		System.out.println("Hello, " + name + "! " + message);
	}
}

public class Compile_Time_Polymorphism {
	public static void main(String[] args) {
		Greeting greeting = new Greeting();

		// Different methods are called based on arguments
		greeting.greet("John");
		greeting.greet("Alice", 25);
		greeting.greet("Emma", "Hope you have a great day!");
	}
}
