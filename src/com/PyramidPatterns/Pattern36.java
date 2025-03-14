package com.PyramidPatterns;

public class Pattern36 {

	public static void main(String args[]) 
	{
		int i= 0, j= 0, k= 1, z = 0, g = 0;
		int iNum = 3; // size
		int iVal = 1;
		System.out.println("OUTPUT:\n ");
		for (i = 0; i < iNum; i++) {

			for (z = iNum - 1; z >= i; z--) {
				System.out.print("  ");
			}

			for (j = 0; j < k; j++) {
				if (i == j) {
					g = (iVal + 1) * (j + j);
					g = (g == 0) ? 1 : g;
					System.out.print(" " + g);
					continue;
				}
				iVal += 2;
				System.out.print(" " + iVal);
			}
			k += 2;
			System.out.println("");
		}

	}
}
/* OUTPUT: 

		       1
		     3 8 5
		   7 9 40 11 13
*/