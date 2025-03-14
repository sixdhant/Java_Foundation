package com.WavePatterns;

public class Pattern23 {

	public static void main(String args[]) {

		int wHeight = 4; // change value to increase or decrease the height of wave
		int wLength = 4; // change value to increase or decrease the length of wave
		int i;
		int j;
		int k;
		int num = wHeight + 1;
		int jump = (num * 3 + 2) - (num + 3);
		int inc = 1;
		int x = 0;
		System.out.println("OUTPUT: ");
		for (i = 1; i <= wHeight; i++) {
			for (j = 1; j <= wLength; j++) {
				if (i != wHeight) {
					System.out.print("   ");
				} else {
					System.out.printf("%02d ", (num - 1));
				}

				for (k = 1; k <= 4; k++) {
					if (i == 1 || k == 1 || k == 4) {
						System.out.printf("%02d ", (num));
						num = num + inc;
					} else {
						System.out.print("   ");
					}
				}
				num = num - inc; // restore value of n (false increment)

				if (i != wHeight) {
					System.out.print("   ");
				} else {
					System.out.printf("%02d ", (num + 1));
				}
				num += jump;
			}

			jump -= 2;
			inc = 5 + x;
			x += 2;

			num = wHeight - i + 1;

			System.out.print("\n");
		}

	}
}
/* OUTPUT:

			   05 06 07 08       17 18 19 20       29 30 31 32       41 42 43 44    
			   04       09       16       21       28       33       40       45    
			   03       10       15       22       27       34       39       46    
			01 02       11 12 13 14       23 24 25 26       35 36 37 38       47 48 
 */