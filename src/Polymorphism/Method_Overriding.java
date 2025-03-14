package Polymorphism;

class Animal {
	void sound() {
		System.out.println("Animals make sounds");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class Method_Overriding {
	public static void main(String[] args) {
		Animal animal;

		animal = new Dog();
		animal.sound(); // Calls Dog's sound method

		animal = new Cat();
		animal.sound(); // Calls Cat's sound method
	}
}
