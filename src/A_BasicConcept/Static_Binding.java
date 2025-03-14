package A_BasicConcept;

class Animal 
{
	static void staticMethod() 
	{
		System.out.println("Animal's static method");
	}

	private void privateMethod() 
	{
		System.out.println("Animal's private method");
	}

	final void finalMethod() 
	{
		System.out.println("Animal's final method");
	}
}

class Dog extends Animal 
{
	static void staticMethod() 
	{
		System.out.println("Dog's static method");
	}

	private void privateMethod() 
	{
		System.out.println("Dog's private method");
	}

	// Overriding not possible for final methods
	// void finalMethod() { } // Compilation Error
}

public class Static_Binding 
{
	public static void main(String[] args) 
	{
		Animal animal = new Dog();

		animal.staticMethod(); // Static binding (calls Animal's staticMethod)
		// animal.privateMethod(); // Private methods cannot be accessed directly

		animal.finalMethod(); // Static binding (calls Animal's finalMethod)
	}
}
