package com.WavePatterns;

public class Pattern13 {

	public static void main(String args[]) {
		int wHeight = 4; // change value to increase or decrease the height of wave
		int wLength = 4; // wave length->change value to increase or decrease the length of wave
		int wPrint = wHeight-1; // if cond for printing
		int iCharPrint; //print char
		System.out.println("OUTPUT: ");
		for (int i = 0; i <= wHeight; i++) 
		{
			iCharPrint = 'a'; // set print char.
			for (int j = 0; j < wHeight * wLength * 2; j++) 
			{
				if (j % (wHeight * 2) == wPrint || j % (wHeight * 2) == wHeight + i) 
				{
					System.out.print((char) iCharPrint);
				} 
				else
				{
					System.out.print(" ");
				}
				iCharPrint++; // increment print char
				// reset print char to 'a'/
				if (iCharPrint > 'z') 
				{
					iCharPrint = iCharPrint - 26;
				}
			}
			wPrint--;
			System.out.println();
		}
	}
}
/* OUTPUT: 

	   de      lm      tu      bc   
	  c  f    k  n    s  v    a  d  
	 b    g  j    o  r    w  z    e 
	a      hi      pq      xy      f
                                
*/
