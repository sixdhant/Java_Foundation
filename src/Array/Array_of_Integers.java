package Array;

public class Array_of_Integers 
{
	public static void main(String[] args) 
	{
		// Declaration and Initialization
		int[] numbers = { 1, 2, 3, 4, 5 };

		// Accessing Elements
		System.out.println("First Element: " + numbers[0]); // Output: 1

		// Modifying an Element
		numbers[2] = 10;
		System.out.println("Modified Element: " + numbers[2]); // Output: 10

		// Iterating Through an Array
		System.out.println("Array Elements:");
		for (int num : numbers) 
		{
			System.out.print(num + " "); // Output: 1 2 10 4 5
		}
	}
}
