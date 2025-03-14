package com.PyramidPatterns;

public class Pattern10 {
	public static void main(String args[]) 
	{
		int iSize = 5; 
		int iNo = 1;
		System.out.println("OUTPUT: ");
		for (int i = 1; i <= iSize; i++) 
		{
			for (int j = iSize - 1; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = iNo; k >= 1; k--) 
			{
				System.out.print(Math.abs(k - i));
			}
			iNo += 2;
			System.out.println();
		}
	}

}
/* OUTPUT: 
    0
   101
  21012
 3210123
432101234
*/