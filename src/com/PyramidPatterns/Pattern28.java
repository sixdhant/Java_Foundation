package com.PyramidPatterns;

public class Pattern28 {

	public static void main(String a[]) 
	{
		int iHeight = 5;
		System.out.println("OUTPUT:\n ");
		for (int i = iHeight; i >= 1; i--) {
			for (int k = iHeight - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

5 4 3 2 1 
 4 3 2 1 
  3 2 1 
   2 1 
    1 
*/