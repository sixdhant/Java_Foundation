package com.PyramidPatterns;

public class Pattern13 {

	public static void main(String args[]) {
		int iSize = 5; // size
		int iWidth = 1;
		System.out.println("OUTPUT:\n ");

		for (int i = 0; i < iSize; i++) {
			for (int j = iSize - 1; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = i; k >= -i; k--) {
				System.out.print((char) (i - Math.abs(k) + 65));
			}
			iWidth += 2;
			System.out.print("\n");
		}

	}
}
/* OUTPUT: 
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA

*/