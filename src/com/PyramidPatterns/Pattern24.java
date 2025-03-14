package com.PyramidPatterns;

public class Pattern24 {

	public static void main(String args[]) 
	{
		System.out.println("OUTPUT:\n ");
		for (int i = 0; i < 5; i++) 
		{
			for (int k = 4; k >= i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) 
			{
				System.out.print((char) (i + 65));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

     A 
    B B 
   C C C 
  D D D D 
 E E E E E 
*/