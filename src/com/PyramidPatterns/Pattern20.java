package com.PyramidPatterns;

public class Pattern20 {
	
	public static void main(String args[]) 
	{
		int iHeight = 5;
		int iWidth = iHeight * 2 - 1;
		int space = iHeight - 1;
		System.out.println("OUTPUT:\n ");
		for (int i = iHeight; i >= 1; i--) 
		{
			for (int j = space; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k < iWidth; k++) 
			{
				System.out.print((char) (k + 65));
			}
			iWidth -= 2;
			System.out.println("");
		}
	}
}
/* OUTPUT: 

ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
*/