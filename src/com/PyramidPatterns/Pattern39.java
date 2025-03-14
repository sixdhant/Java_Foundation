package com.PyramidPatterns;

public class Pattern39 {

	public static void main(String args[]) {
		int iSize = 5; // size
		System.out.println("OUTPUT:\n ");
		for (int i = 1; i <= iSize; i++) {
			for (int k = iSize - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print((char) (j + 64) + " ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

				    A 
				   1 2 
				  A B C 
				 1 2 3 4 
				A B C D E 
*/