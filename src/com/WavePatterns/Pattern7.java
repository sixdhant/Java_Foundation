package com.WavePatterns;

public class Pattern7 {

	public static void main(String args[]) {
		int wHeight = 4; // change value to increase or decrease the height of wave
		int wLength = 4; // wave length->change value to increase or decrease the length of wave
		int wHigh = wHeight - 1; // for loop cond.
		int wPrint = wHigh; // if cond for printing
		int iCharPrint; //print char
		System.out.println("OUTPUT: ");

		for (int i = 0; i <= wHigh; i++) 
		{
			iCharPrint = 'z'; // set print char.
			for (int j = 0; j <= wHigh * wLength * 2; j++) 
			{
				if (j % (wHigh * 2) == wPrint || j % (wHigh * 2) == wHigh + i) 
				{
					System.out.print((char) iCharPrint);
				} 
				else 
				{
					System.out.print(" ");
				}
				iCharPrint--; // increment print char
				// reset print char to 'a'/
				if (iCharPrint < 'a')
			      {
					iCharPrint = iCharPrint + 26;
			      }
			}
			wPrint--;
			System.out.println();
		}
	}
}
/* OUTPUT: 

   w     q     k     e   
  x v   r p   l j   f d  
 y   u s   o m   i g   c 
z     t     n     h     b

*/
