package com.PyramidPatterns;

public class Pattern44 {

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

					5 5 5 5 5 
					 D D D D 
					  3 3 3 
					   B B 
					    1 
*/