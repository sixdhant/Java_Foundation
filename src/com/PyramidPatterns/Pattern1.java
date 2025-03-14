package com.PyramidPatterns;

public class Pattern1 {

	public static void main(String args[]) {
		
		int iStar = 1;
		int iHeight = 5; 
		int space = iHeight - 1;

		System.out.println("OUTPUT: ");
		for (int i = 0; i < iHeight; i++) 
		{
			for (int j = space; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k < iStar; k++) 
			{
				System.out.print("*");
			}
			iStar += 2;
			System.out.println();
		}
	}
}

/* OUTPUT: 
    *
   ***
  *****
 *******
*********

*/
