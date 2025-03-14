package com.WavePatterns;

public class Pattern27 {

	public static void main(String args[]) {

		int wHeight = 4; // change value to increase or decrease the height of wave
		int wLength = 4; // change value to increase or decrease the length of wave
		int i;
		int j;
		int k;
		System.out.println("OUTPUT: ");
		for (i = 1; i <= wHeight; i++) {
			for (j = 1; j <= wLength; j++) {
				for (k = 1; k <= wHeight; k++) {
					if (i == k || i + k == wHeight + 1) {
						System.out.print(">>");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
/*  OUTPUT:

				>>    >>>>    >>>>    >>>>    >>
				  >>>>    >>>>    >>>>    >>>>  
				  >>>>    >>>>    >>>>    >>>>  
				>>    >>>>    >>>>    >>>>    >>
 */
