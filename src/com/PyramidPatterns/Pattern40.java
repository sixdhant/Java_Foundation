package com.PyramidPatterns;

public class Pattern40 {

	public static void main(String args[]) {
		int iSize = 5; // size
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
					System.out.print((char) (i + 64) + " ");
				} 				
				else 
				{
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

				    1 
				   B B 
				  3 3 3 
				 D D D D 
				5 5 5 5 5 
*/