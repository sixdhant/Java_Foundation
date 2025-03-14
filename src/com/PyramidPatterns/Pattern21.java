package com.PyramidPatterns;

public class Pattern21 {
	
	public static void main(String a[])
    {
        int iHeight = 5;
        System.out.println("OUTPUT:\n ");
        for (int i = 1; i <= iHeight; i++)
        {
            for (int k = iHeight - 1; k >= i; k--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* "); // space after '*'
            }
            System.out.print("\n");
        }
    }
}
/* OUTPUT: 

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/