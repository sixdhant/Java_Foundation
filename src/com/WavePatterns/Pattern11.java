package com.WavePatterns;

public class Pattern11 {

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
	        System.out.printf("%02d",j);
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

	   0304      1112      1920      2728   
	  02  05    10  13    18  21    26  29  
	 01    06  09    14  17    22  25    30 
	00      0708      1516      2324      31
                                

*/
