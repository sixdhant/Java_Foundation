package com.PyramidPatterns;

public class Pattern49 {

	public static void main(String args[])
    {
        int iSize = 4; //size
        int iVal = 0;
        System.out.println("OUTPUT:\n ");
        for (int i = 1; i <= iSize; i++)
        {
            for (int j = iSize - 1; j >= i; j--)
            {
                System.out.print(" ");
            }

            for (int k = i - 1; k >= -(i - 1); k--)
            {
                System.out.print((char)(iVal - Math.abs(k) + 65));
            }
            iVal += 2;
            System.out.println("");
        }
    }
}
/* OUTPUT: 

					   A
					  BCB
					 CDEDC
					DEFGFED
*/