package com.PyramidPatterns;

public class Pattern22 {

	public static void main(String a[]) {

		System.out.println("OUTPUT:\n ");
		for (int i = 1; i <= 5; i++) 
		{
			for (int k = 4; k >= i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/