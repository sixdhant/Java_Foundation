package com.PyramidPatterns;

public class Pattern23 {

	public static void main(String a[]) 
	{
		System.out.println("OUTPUT:\n ");
		for (int i = 1; i <= 5; i++) 
		{
			for (int k = 4; k >= i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
*/