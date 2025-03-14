package com.PyramidPatterns;

public class Pattern18 {

	public static void main(String args[]) 
	{
		int iHeight = 5;
		int iWidth = iHeight * 2 - 1;
		int space = iHeight - 1;
		System.out.println("OUTPUT:\n ");
		for (int i = iHeight - 1; i >= 0; i--) 
		{
			for (int j = space; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= iWidth; k++) 
			{
				System.out.print((char) (i + 65));
			}
			iWidth -= 2;
			System.out.println("");
		}
	}
}
/* OUTPUT: 

EEEEEEEEE
 DDDDDDD
  CCCCC
   BBB
    A
*/