package A_BasicConcept;

class Animal1 
{
	void sound() 
	{
		System.out.println("Animal makes a sound");
	}
}

class Dog1 extends Animal1 
{
	@Override
	void sound() 
	{
		System.out.println("Dog barks");
	}
}

public class Dynamic_Binding 
{
	public static void main(String[] args) 
	{
		Animal1 animal1 = new Dog1(); // Upcasting
		animal1.sound(); // Dynamic binding (calls Dog's sound method)
	}
}
