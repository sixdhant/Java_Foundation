package com.PyramidPatterns;

public class Pattern7 {
	
	public static void main(String args[]) 
	{
		int iSize = 5;
		int iNo = 1;
		System.out.println("OUTPUT: ");
		for (int i=1; i<=iSize; i++)
        {
            for (int j=iSize-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=iNo; k>=1; k--)
            {
                System.out.print(k);
            }
            iNo+=2;
            System.out.println();
        }
	} 
}
/* OUTPUT: 
    1
   321
  54321
 7654321
987654321
*/