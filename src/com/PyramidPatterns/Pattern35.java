package com.PyramidPatterns;

public class Pattern35 {

	public static void main(String args[]) 
	{
		int iSize = 3; // size
		int iVal = 1;
		System.out.println("OUTPUT:\n ");
		for (int i = 0; i < iSize; i++) 
		{
			for (int j = 2; j > 0; j--) 
			{
				for (int x = iSize - 1; x > i; x--) 
				{
					System.out.print(" ");
				}
				for (int y = 0; y < iVal; y++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
			iVal += 2;
		}
	}
}
/* OUTPUT: 

			  *
			  *
			 ***
			 ***
			*****
			*****
*/