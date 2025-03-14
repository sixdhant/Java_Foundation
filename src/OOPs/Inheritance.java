package OOPs;

public class Inheritance 
{
	 public static void main(String[] args) 
	 {
	     // Create an object of the subclass
	     Dog dog = new Dog();

	     // Access fields and methods from the superclass
	     dog.name = "Buddy";
	     dog.breed = "Golden Retriever";

	     // Call methods
	     dog.eat();          // Inherited from the superclass
	     dog.displayDetails(); // Specific to the subclass
	     dog.bark();         // Specific to the subclass
	 }
}

//Superclass (Parent Class)
class Animal 
{
	String name;

	// Method of the superclass
	void eat() 
	{
     System.out.println(name + " is eating.");
	}
}

//Subclass (Child Class)
class Dog extends Animal 
{
	String breed;

	// Method of the subclass
	void displayDetails() 
	{
     System.out.println("Name: " + name);
     System.out.println("Breed: " + breed);
	}

	// Subclass-specific behavior
	void bark() 
	{
     System.out.println(name + " is barking.");
	}
}

/*

Superclass (Animal):
The Animal class defines a general concept of an animal with a field name and a method eat().

Subclass (Dog):
The Dog class extends the Animal class, inheriting its properties (name) and methods (eat()).
The Dog class also defines additional attributes (breed) and methods (displayDetails() and bark()).

Object Creation:
An object of the subclass Dog is created.
It can access both inherited methods (eat()) and its own methods (displayDetails(), bark()).


*/