package com.PyramidPatterns;

public class Pattern9 {
	public static void main(String args[]) 
	{
		int iSize = 5; 
		int iNo = 0;
		System.out.println("OUTPUT: ");
		for (int i = 0; i < iSize; i++) 
		{
			for (int j = iSize - 1; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= iNo; k++) 
			{
				System.out.print((char) (iNo - k + 65));
			}
			iNo += 2;
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 
    A
   CBA
  EDCBA
 GFEDCBA
IHGFEDCBA
*/