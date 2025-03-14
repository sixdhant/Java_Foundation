package Abstraction;

//Abstract class
abstract class Animal8 {
	// Abstract method (no implementation)
	abstract void makeSound();

	// Non-abstract method (with implementation)
	void sleep() {
		System.out.println("Sleeping...");
	}
}

//Subclass that extends the abstract class
class Dog8 extends Animal8 {
	// Providing implementation for the abstract method
	@Override
	void makeSound() {
		System.out.println("Bark");
	}
}

//Another subclass that extends the abstract class
class Cat8 extends Animal8 {
	// Providing implementation for the abstract method
	@Override
	void makeSound() {
		System.out.println("Meow");
	}
}

public class Abstract_and_Non_Abstract_Method {
	public static void main(String[] args) {
		// Create instances of the subclasses
		Animal8 dog = new Dog8();
		Animal8 cat = new Cat8();

		// Call the methods
		dog.makeSound(); // Output: Bark
		dog.sleep(); // Output: Sleeping...

		cat.makeSound(); // Output: Meow
		cat.sleep(); // Output: Sleeping...
	}
}
