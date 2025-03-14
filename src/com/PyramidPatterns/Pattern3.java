package com.PyramidPatterns;

public class Pattern3 {

	public static void main(String args[]) 
	{
		int iSize = 5; // size
		int iNo = 1;
		System.out.println("OUTPUT: ");
		for (int i = 0; i < iSize; i++) {
			for (int j = iSize - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= iNo; k++) {
				System.out.print(iNo);
			}
			iNo += 2;
			System.out.println();
		}
	} 
}
/* OUTPUT: 
    1
   333
  55555
 7777777
999999999
*/