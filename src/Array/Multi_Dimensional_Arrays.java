package Array;

public class Multi_Dimensional_Arrays 
{
	public static void main(String[] args) 
	{
		// Creating a 2D Array
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Accessing Elements
		System.out.println("Element at [2][2]: " + matrix[2][2]); // Output: 9

		// Iterating Through a 2D Array
		System.out.println("Matrix:");
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[i].length; j++) 
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
