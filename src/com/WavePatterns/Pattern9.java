package com.WavePatterns;

public class Pattern9 {

	public static void main(String args[]) {
		int wHeight = 4; // change value to increase or decrease the height of wave
		int wLength = 4; // wave length->change value to increase or decrease the length of wave
		int wPrint = wHeight-1; // if cond for printing
		System.out.println("OUTPUT: ");

		for (int i = 0;i <= wHeight;i++)
	    {
	     for (int j = 0;j < wHeight * wLength * 2;j++)
	     {

	        if (j % (wHeight * 2) == wPrint || j % (wHeight * 2) == wHeight + i)
	        {
	        System.out.print("|");
	        }
	        else
	        {
	         System.out.print(" ");
	        }
	     }
	     wPrint--;
	     System.out.println();
	    }
	}
}
/* OUTPUT: 

   ||      ||      ||      ||   
  |  |    |  |    |  |    |  |  
 |    |  |    |  |    |  |    | 
|      ||      ||      ||      |
                                

*/
