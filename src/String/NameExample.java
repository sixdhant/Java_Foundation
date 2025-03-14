package String;

import java.util.Scanner;

public class NameExample 
{
	private String firstName;
	private String middleName;
	private String lastName;

	NameExample(String firstName, String middleName, String lastName) 
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

	// Overriding toString() to return the formatted name
	@Override
	public String toString() {
		return firstName.trim() + " " + middleName.trim() + " " + lastName.trim(); // Concatenate names with spaces
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Accepting user input
		System.out.print("Enter your first name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter your middle name: ");
		String middleName = scanner.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = scanner.nextLine();

		// Creating an object of FullName class
		NameExample fullName = new NameExample(firstName, middleName, lastName);

		// Using toString method to print the full name
		System.out.println("Full Name: " + fullName.toString()); // Output the full name

		// Convert the full name to uppercase using toUpperCase method
		String upperCaseName = fullName.toString().toUpperCase();
		System.out.println("Full Name in Uppercase: " + upperCaseName);

		scanner.close();
	}
}
