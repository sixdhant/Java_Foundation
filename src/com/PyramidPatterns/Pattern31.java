package com.PyramidPatterns;

public class Pattern31 {

	public static void main(String args[]) 
	{		
		System.out.println("OUTPUT:\n ");
		for (int i = 5; i >= 0; i--) {
			for (int k = 4; k >= i; k--) 
			{
				System.out.print(" ");
			}
			for (int j = i; j >= 0; j--) 
			{
				System.out.print((char) ((i - j) + 65));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

			A B C D E F 
			 A B C D E 
			  A B C D 
			   A B C 
			    A B 
			     A 

*/