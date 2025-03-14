package com.PyramidPatterns;

public class Pattern47 {
	
	public static void main(String args[])
    {
        int iSize = 5; // size
        int px = iSize; // print controls
        int py = iSize;
        System.out.println("OUTPUT:\n ");
        for (int i = 1; i <= iSize; i++)
        {
            for (int j = 1; j < iSize * 2; j++)
            {
                if (j == px || j == py || i == iSize)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            px--;
            py++;
            System.out.println("");
        }
    }
}
/* OUTPUT: 

						    *    
						   * *   
						  *   *  
						 *     * 
						*********
*/