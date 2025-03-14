package com.PyramidPatterns;

public class Pattern27 {

	public static void main(String a[]) {
		int iHeight = 5;
		System.out.println("OUTPUT:\n ");
		for (int i = iHeight; i >= 1; i--) {
			for (int k = iHeight - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1 
*/