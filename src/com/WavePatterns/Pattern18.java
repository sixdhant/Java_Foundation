package com.WavePatterns;

public class Pattern18 {

	public static void main(String args[]) {

		int wHeight = 5; // change value to increase or decrease the height of wave
		int wLength = 4; // change value to increase or decrease the length of wave

		int i;
		int j;
		int k;
		int is = 1; // inner space
		int os = 2; // outer space
		int inc = 1;
		int jump = (wHeight * 3) - (wHeight + 1);
		int ch = 'A' + wHeight - 1;
		System.out.println("OUTPUT: ");
		for (i = 1; i <= wHeight; i++) 
		{
			for (j = 1; j <= wLength; j++) 
			{
				for (k = 1; k <= os; k++) 
				{
					System.out.print(" ");
				}

				System.out.print((char) ch);

				for (k = 1; k <= is; k++) 
				{
					System.out.print(" ");
				}
				ch += inc;

				if (ch > 'Z')
				{
					ch = ch - 26;
				}

				System.out.print((char) ch);

				for (k = 1; k <= os; k++) 
				{
					System.out.print(" ");
				}

				System.out.print(" ");
				ch += jump;
				if (ch > 'Z')
				{
					ch = ch - 26;
				}
			}

			os = ((i + 1) != wHeight) ? 1 : 0;
			/*
			 * set value of os to 1 if i+1 is not equal to wave height or 0 otherwise
			 */

			is = (i + 1 != wHeight) ? 3 : 5;
			/*
			 * set value of is to 3 if i+1 is not equal to wave height or 5 otherwise
			 */

			ch = 'A' + wHeight - i - 1;
			inc = inc + 2;
			jump -= 2;

			System.out.print("\n");
		}
	}
}
/* OUTPUT: 

	  E F     O P     Y Z     I J   
	 D   G   N   Q   X   A   H   K  
	 C   H   M   R   W   B   G   L  
	 B   I   L   S   V   C   F   M  
	A     J K     T U     D E     N 

                     
*/