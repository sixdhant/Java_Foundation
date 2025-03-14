package com.PyramidPatterns;

public class Pattern11 {

	public static void main(String args[]) {
		int iSize = 5; 
		int iNo = 1;
		int iLen = 1;
		System.out.println("OUTPUT: ");
		for (int i = 0; i < iSize; i++) 
		{
			for (int j = 4; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= iNo; k++) 
			{
				System.out.print((char) (Math.abs(k - iLen) + 65));
			}
			iLen++;
			iNo += 2;
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 
    A
   BAB
  CBABC
 DCBABCD
EDCBABCDE

*/