package OOPs;

public class Object 
{
	 public static void main(String[] args) {
	     // Create an object of the Student class
	     Student student1 = new Student();

	     // Assign values to the object's fields
	     student1.name = "Siddhant Deshmukh";
	     student1.rollNumber = 101;

	     // Call the method to display details
	     student1.displayDetails();
	 }
}

//Define a class named Student
class Student {
 // Fields (Attributes)
 String name;
 int rollNumber;

 // Method to display student details
 void displayDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
 }
}

/*

Class Definition:
The Student class defines attributes name and rollNumber and a method displayDetails() to display the student’s details.

Object Creation:
The Main class creates an object of the Student class: Student student1 = new Student();.

Assign Values:
The fields name and rollNumber of student1 are set to "John Doe" and 101.

Method Call:
The displayDetails() method is called on student1 to print the student's details.
*/
