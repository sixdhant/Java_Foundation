package com.WavePatterns;

public class Pattern3 {

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
					System.out.printf("%02d",j);
				} else 
				{
					System.out.print("  ");
				}
			}
			wPrint--;
			System.out.println();
		}
	}
}
/* OUTPUT: 


      03          09          15          21      
    02  04      08  10      14  16      20  22    
  01      05  07      11  13      17  19      23  
00          06          12          18          24

*/