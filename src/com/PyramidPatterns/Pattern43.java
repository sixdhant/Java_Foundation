package com.PyramidPatterns;

public class Pattern43 {

	public static void main(String args[]) {
		int iSize = 5; 
		System.out.println("OUTPUT:\n ");
		for (int i = iSize; i >= 1; i--) 
		{
			for (int k = i; k <= iSize - 1; k++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				if (i % 2 != 0) 
				{
					System.out.print((char) (j + 64) + " ");
				} 
				else 
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

				A B C D E 
				 1 2 3 4 
				  A B C 
				   1 2 
				    A 
*/