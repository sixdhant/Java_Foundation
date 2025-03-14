package Clone;

//A simple class Person that implements Cloneable
public class Clone implements Cloneable 
{
	private String name;
	private int age;

	// Constructor to initialize the object
	public Clone(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Overriding the clone() method to support cloning of the object
	@Override
	public Clone clone() {
		try {
			// Using the Object class's clone() method to create a copy of the current
			// object
			return (Clone) super.clone(); // Casting to Person because clone() returns Object type
		} catch (CloneNotSupportedException e) {
			// This exception will not happen because the class implements Cloneable
			return null;
		}
	}


	public static void main(String[] args) 
	{
		// Create an original Person object
		Clone person1 = new Clone("Alice", 25);

		// Clone the person1 object
		Clone person2 = person1.clone();

		// Print details of both the original and cloned objects
		System.out.println("Original Person: " + person1.name + ", Age: " + person1.age);
		System.out.println("Cloned Person: " + person2.name + ", Age: " + person2.age);

		// Check if both objects are the same in memory (they should not be)
		System.out.println("Are both objects the same reference? " + (person1 == person2)); // false
	}
}
