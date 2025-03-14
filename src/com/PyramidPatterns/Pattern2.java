package com.PyramidPatterns;

public class Pattern2 {

	public static void main(String args[]) 
	{
		int iSize = 5;
		int iNo = 1;

		System.out.println("Output: ");
		for (int i = 0; i < iSize; i++) 
		{
			for (int j = iSize - 1; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k < iNo; k++) 
			{
				System.out.print(iNo - i);
			}
			iNo += 2;
			System.out.println();
		}
	} 
}
/* Output: 
    1
   222
  33333
 4444444
555555555
*/