package Constructors;


//Class with constructors
public class Constructors {
	
	 // Main method to test constructors
	 public static void main(String[] args) 
	 {
	     // Using Default Constructor
		 Constructors student1 = new Constructors();
	     student1.displayInfo();

	     // Using Parameterized Constructor
	     Constructors student2 = new Constructors("Alice", 20);
	     student2.displayInfo();
	 }
	 // Instance variables
	 String name;
	 int age;

	 // Default Constructor
	 public Constructors() 
	 {
		 this.name = "Unknown";
		 this.age = 0;
		 System.out.println("Default Constructor called");
	 }

	 // Parameterized Constructor
	 public Constructors(String name, int age) 
	 {
		 this.name = name;
		 this.age = age;
		 System.out.println("Parameterized Constructor called");
	 }

	 // Method to display student details
	 public void displayInfo() 
	 {
		 System.out.println("Name: " + name + ", Age: " + age);
	 }
}
