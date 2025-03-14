package com.WavePatterns;

public class Pattern5 {

	public static void main(String args[]) {
		int wHeight = 4; // change value to increase or decrease the height of wave
		int wLength = 4; // wave length->change value to increase or decrease the length of wave
		int wHigh = wHeight - 1; // for loop cond.
		int wPrint = wHigh; // if cond for printing
		int iCharPrint; //print char
		System.out.println("OUTPUT: ");

		for (int i = 0; i <= wHigh; i++) 
		{
			iCharPrint = 'a'; // set print char.
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

   d     j     p     v   
  c e   i k   o q   u w  
 b   f h   l n   r t   x 
a     g     m     s     y

*/
