package com.PyramidPatterns;

public class Pattern12 {

	public static void main(String args[])
    {
        int iSize = 5; 
        System.out.println("OUTPUT:\n ");
        for (int i=1; i <= iSize; i++)
        {
            for (int j = iSize-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=i-1; k>=-(i-1); k--)
            {
                System.out.print(i-Math.abs(k));
            }
            System.out.println();
        }
    }
}
/* OUTPUT: 
    1
   121
  12321
 1234321
123454321

*/