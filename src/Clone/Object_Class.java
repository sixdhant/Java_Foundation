package Clone;

//Define a simple class `Person`
public class Object_Class 
{
	private String name;
	private int age;

	// Constructor to initialize the object
	public Object_Class(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	// Overriding the toString() method to return a simple string representation of
	// the object
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}

	// Overriding the equals() method to compare two Person objects based on name
	// and age
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // Same object
		if (obj == null || getClass() != obj.getClass())
			return false; // Null or different class
		Object_Class person = (Object_Class) obj;
		return age == person.age && name.equals(person.name); // Compare fields
	}

	// Overriding the hashCode() method to return a simple hash based on name and
	// age
	@Override
	public int hashCode() {
		return name.hashCode() + age; // Simple hash code combining name and age
	}

	// Main method to test the code
	public static void main(String[] args) 
	{
		Object_Class person1 = new Object_Class("John", 25);
		Object_Class person2 = new Object_Class("John", 25);

		// Print the string representation of person1
		System.out.println(person1); // Output: Name: John, Age: 25

		// Check if person1 and person2 are equal
		System.out.println(person1.equals(person2)); // Output: true

		// Compare the hash codes of person1 and person2
		System.out.println(person1.hashCode() == person2.hashCode()); // Output: true
	}
}
