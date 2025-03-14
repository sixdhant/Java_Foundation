package com.PyramidPatterns;

public class Pattern4 {

	public static void main(String args[]) {
		
		int iNo = 1;
		int iHeight = 5;
		int space = iHeight - 1;

		System.out.println("OUTPUT: ");
		for (int i = 0; i < iHeight; i++) 
		{
			for (int j = space; j > i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k < iNo; k++) 
			{
				System.out.print((char) (i + 65));
			}
			iNo += 2;
			System.out.print("\n");
		}
	}
}
/* OUTPUT: 
    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE
*/
