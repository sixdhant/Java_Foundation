package com.PyramidPatterns;

public class Pattern6 
{
	public static void main(String args[]) 
	{
		int iSize = 5;
		int iNo = 1;
		System.out.println("OUTPUT: ");
		for (int i = 0; i < iSize; i++) 
		{
			for (int j = iSize - 1; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= iNo; k++) 
			{
				System.out.print(k);
			}
			iNo += 2;
			System.out.println();
		}
	} 
}
/* OUTPUT: 
    1
   123
  12345
 1234567
123456789
*/