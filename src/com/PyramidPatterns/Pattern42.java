package com.PyramidPatterns;

public class Pattern42 {

	public static void main(String args[]) {
		int iSize = 5;
		System.out.println("OUTPUT:\n ");
		for (int i = iSize; i >= 1; i--) {
			for (int s = i; s <= iSize - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print((char) (i + 64) + " ");
				} else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

				E E E E E 
				 4 4 4 4 
				  C C C 
				   2 2 
				    A 
*/