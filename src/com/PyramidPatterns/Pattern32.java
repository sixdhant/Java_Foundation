package com.PyramidPatterns;

public class Pattern32 {

	public static void main(String args[]) {
		int iStar = 1; /*
						 * change value to set min. no. of stars in piramid take odd no. for odd no. of
						 * stars in each row 1-3-5 etc take even no. for even no. stars in each row,
						 * 2-4-6 etc
						 */
		int iHeight = 5; // change value to increase or decrease the size of piramid
		int space = iHeight - 1;
		int iVal = 1;
		System.out.println("OUTPUT:\n ");
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

			for (int iNum = (iHeight + iHeight - 2); iNum >= iVal; iNum--) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k < iStar; k++) 
			{
				System.out.print("*");				
			}
			iStar += 2;
			iVal += 2;
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

			    *        *
			   ***      ***
			  *****    *****
			 *******  *******
			******************
*/