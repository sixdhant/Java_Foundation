package com.PyramidPatterns;

public class Pattern30 {

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
				System.out.print((char) (j + 65));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

		F E D C B A 
		 E D C B A 
		  D C B A 
		   C B A 
		    B A 
		     A 

*/