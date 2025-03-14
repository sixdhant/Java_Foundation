package com.PyramidPatterns;

public class Pattern26 {
	
	public static void main(String a[])
    {
        int iHeight = 5;
        System.out.println("OUTPUT:\n ");
        for (int i = iHeight; i >= 1; i--)
        {
            for (int k = iHeight - 1; k >= i; k--)
            {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
            {
                System.out.print("* "); // space after '*'
            }
            System.out.print("\n");
        }
    }
}
/* OUTPUT: 

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
*/