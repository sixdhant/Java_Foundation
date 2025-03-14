package com.PyramidPatterns;

public class Pattern25 {

	public static void main(String args[]) {

		System.out.println("OUTPUT:\n ");
		for (int i = 0; i < 5; i++) 
		{
			for (int k = 4; k >= i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) 
			{
				System.out.print((char) (j + 65));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
*/