package com.WavePatterns;

public class Pattern2 {

	public static void main(String args[]) {
		int wHeight = 4; // change value to increase or decrease the height of wave
		int wLength = 4; // wave length->change value to increase or decrease the length of wave
		int wHigh = wHeight - 1; // for loop cond.
		int wPrint = wHigh; // if cond for printing
		System.out.println("OUTPUT: ");
		for (int i = 0; i <= wHigh; i++) {
			for (int j = 0; j <= wHigh * wLength * 2; j++) {

				if (j % (wHigh * 2) == wPrint || j % (wHigh * 2) == wHigh + i) 
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


   |     |     |     |   
  | |   | |   | |   | |  
 |   | |   | |   | |   | 
|     |     |     |     |

*/