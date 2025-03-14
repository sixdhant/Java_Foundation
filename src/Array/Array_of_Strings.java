package Array;

public class Array_of_Strings 
{
	public static void main(String[] args) 
	{
		// Creating and Initializing an Array
		String[] names = { "Alice", "Bob", "Charlie" };

		// Accessing Elements
		System.out.println("Name at Index 1: " + names[1]); // Output: Bob

		// Iterating Using a For-Loop
		System.out.println("Names:");
		for (int i = 0; i < names.length; i++) 
		{
			System.out.println(names[i]);
		}
	}
}
