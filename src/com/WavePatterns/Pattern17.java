package com.WavePatterns;

public class Pattern17 {

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
		int num = wHeight;
		System.out.println("OUTPUT: ");
		for (i = 1; i <= wHeight; i++) 
		{
			for (j = 1; j <= wLength; j++)
			{
				for (k = 1; k <= os; k++) 
				{
					System.out.print(" ");
				}
				System.out.printf("%02d", num);

				for (k = 1; k <= is; k++) 
				{
					System.out.print(" ");
				}
				num += inc;

				System.out.printf("%02d", num);

				for (k = 1; k <= os; k++) 
				{
					System.out.print(" ");
				}

				System.out.print(" ");
				num += jump;
			}

			os = ((i + 1) != wHeight) ? 1 : 0;
			/*
			 * set value of os to 1 if i+1 is not equal to wave height or 0 otherwise
			 */

			is = (i + 1 != wHeight) ? 3 : 5;
			/*
			 * set value of is to 3 if i+1 is not equal to wave height or 5 otherwise
			 */

			num = wHeight - i;
			inc = inc + 2;
			jump -= 2;

			System.out.print(" \n");
		}
	}
}
/* OUTPUT: 

	  05 06     15 16     25 26     35 36    
	 04   07   14   17   24   27   34   37   
	 03   08   13   18   23   28   33   38   
	 02   09   12   19   22   29   32   39   
	01     10 11     20 21     30 31     40  
                       
*/