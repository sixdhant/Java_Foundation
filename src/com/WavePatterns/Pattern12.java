package com.WavePatterns;

public class Pattern12 {

	public static void main(String args[]) {
		int wHeight = 4; // change value to increase or decrease the height of wave
		int wLength = 4; // wave length->change value to increase or decrease the length of wave
		int wPrint = wHeight-1; // if cond for printing
		int iCharPrint; //print char
		System.out.println("OUTPUT: ");
		for (int i = 0; i <= wHeight; i++) 
		{
			iCharPrint = 'A'; // set print char.
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
				// reset print char to 'A'/
				if (iCharPrint > 'Z') {
					iCharPrint = iCharPrint - 26;
				}
			}
			wPrint--;
			System.out.println();
		}
	}
}
/* OUTPUT: 

	   DE      LM      TU      BC   
	  C  F    K  N    S  V    A  D  
	 B    G  J    O  R    W  Z    E 
	A      HI      PQ      XY      F
                                
*/
