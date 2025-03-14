package com.PyramidPatterns;

public class Pattern33 {

	public static void main(String args[]) 
	{
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
			for (int k = 0; k <= i; k++) 
			{
				System.out.print("* ");
			}
			for (int iNum = (iHeight + iHeight - 2); iNum >= iVal; iNum--) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			iVal += 2;
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

		    *         * 
		   * *       * * 
		  * * *     * * * 
		 * * * *   * * * * 
		* * * * * * * * * * 
*/