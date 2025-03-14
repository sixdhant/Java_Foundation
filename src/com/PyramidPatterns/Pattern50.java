package com.PyramidPatterns;

public class Pattern50 {

	public static void main(String args[]) {
		int iSize = 5; // size
		int p = 1;
		int c = 1;
		System.out.println("OUTPUT:\n ");
		for (int i = 1; i <= iSize; i++) {
			for (int j = iSize - 1; j >= i; j--) {
				System.out.print(" ");
			}
			p = 1;
			System.out.print(p);
			while (c < i) {
				System.out.print((p *= 2));
				c++;
			}
			while (c > 1) {
				System.out.print((p /= 2));
				c--;
			}
			System.out.println("");
		}
	}
}
/* OUTPUT: 

    1
   121
  12421
 1248421
1248168421
*/