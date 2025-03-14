package com.PyramidPatterns;

public class Pattern37 {

	public static void main(String args[]) 
	{
		int iVal = 1;
		int iHeight = 5;
		int space = iHeight - 1;
		int i; 
		int j;
		int k;
		int np = 1; // for number printing
		char cp = 'A'; // for char printing
		System.out.println("OUTPUT:\n ");
		for (i = 1; i <= iHeight; i++) 
		{
			for (j = space; j >= i; j--) 
			{
				System.out.print(" ");
			}

			for (k = 1; k <= iVal; k++) 
			{
				if (i % 2 != 0) 
				{
					System.out.print(np);
					np++;
				} 
				else 
				{
					System.out.print(cp);
					cp++;
				}
				np = (np > 9) ? 1 : np; // reset number
				cp = (cp > 'Z') ? 'A' : cp; // reset character
			}
			iVal += 2;
			System.out.println();
		}
	}
}
/* OUTPUT: 

			    1
			   ABC
			  23456
			 DEFGHIJ
			789123456
*/