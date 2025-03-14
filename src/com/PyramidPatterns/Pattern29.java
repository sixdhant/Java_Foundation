package com.PyramidPatterns;

public class Pattern29 {

	public static void main(String args[]) 
	{
		System.out.println("OUTPUT:\n ");
		for (int i = 5; i >= 0; i--) 
		{
			for (int k = 4; k >= i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = i; j >= 0; j--) 
			{
				System.out.print((char) (i + 65));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

F F F F F F 
 E E E E E 
  D D D D 
   C C C 
    B B 
     A 

*/