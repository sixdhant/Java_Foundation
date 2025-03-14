package com.PyramidPatterns;

public class Pattern15 {

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
			for (int k = 1; k <= iWidth; k++) 
			{
				System.out.print(i);
			}
			iWidth -= 2;
			System.out.println();
		}
	}
}
/* OUTPUT: 
555555555
 4444444
  33333
   222
    1

*/