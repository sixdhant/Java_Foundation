package com.PyramidPatterns;

public class Pattern34 {

	public static void main(String args[]) {

		int iHeight = 5;
		int space = iHeight - 1;
		int i = 0, j = 0, k = 0, iNum = 0, iVal = 1;
		System.out.println("OUTPUT:\n ");
		// pyramid on top
		for (i = 1; i <= iHeight; i++) 
		{
			// Broad Space
			for (iNum = 1; iNum <= iHeight; iNum++) 
			{
				System.out.print(" ");
			}
			for (k = space; k >= i; k--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		// bottom pyramids
		for (i = 0; i < iHeight; i++) 
		{
			for (j = space; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) 
			{
				System.out.print("* ");
			}
			for (iNum = (iHeight + iHeight - 2); iNum >= iVal; iNum--) 
			{
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) 
			{
				System.out.print("* ");
			}
			iVal += 2;
			System.out.println("");
		}
	}
}
/* OUTPUT: 

		         * 
		        * * 
		       * * * 
		      * * * * 
		     * * * * * 
		    *         * 
		   * *       * * 
		  * * *     * * * 
		 * * * *   * * * * 
		* * * * * * * * * * 
*/