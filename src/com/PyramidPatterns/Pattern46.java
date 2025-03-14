package com.PyramidPatterns;

public class Pattern46 {

	public static void main(String args[]) 
	{
		int iSize = 5;
		System.out.println("OUTPUT:\n ");
		for (int i = 1; i <= iSize; i++) 
		{
			for (int k = iSize - 1; k >= i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				if (i % 2 == 0) 
				{
					System.out.print("* "); // space after *
				} 
				else 
				{
					System.out.print("+ "); // space after +
				}
			}
			System.out.println("");
		}
	}
}
/* OUTPUT: 

					    + 
					   * * 
					  + + + 
					 * * * * 
					+ + + + + 
*/