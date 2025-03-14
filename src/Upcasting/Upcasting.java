package Upcasting;

class Animal 
{
	void sound() 
	{
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal 
{
	void sound() 
	{
		System.out.println("Dog barks");
	}

	void fetch() 
	{
		System.out.println("Dog fetches a ball");
	}
}

public class Upcasting 
{
	public static void main(String[] args) 
	{
		Animal animal = new Dog(); // Upcasting
		animal.sound(); // Calls overridden method in Dog class

		// animal.fetch(); // This will cause a compilation error because fetch() is not
		// in Animal
	}
}
