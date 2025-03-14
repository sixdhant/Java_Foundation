package com.SpiralPatterns;

import java.util.Scanner;

public class Pattern2 {
	
	 public static void main(String args[])
	    {
		 
		 Scanner Sobj = new Scanner(System.in);
		 System.out.print("Enter Size: ");
		 int iSize = Sobj.nextInt(); // change to change size
	       
		 int[][] a = new int[5][5]; // same as 'n'
	        int i;
	        int j;
	        int ot;

	        int x = 0;
	        int y = 0;
	        int z = 25;
	        System.out.print("Spiral Reverse pattern Output : \n");
	        for (ot = 0; ot <= iSize / 2; ot++)
	        {
	            if (ot == iSize / 2)
	            {
	                z++;
	            }
	            for (j = y; j < iSize - y; j++)
	            {
	                a[x][j] = z;
	                z--;
	            }
	            for (i = x + 1; i < iSize - x - 1; i++)
	            {
	                a[i][iSize - y - 1] = z;
	                z--;
	            }
	            for (j = iSize - y - 1; j >= y; j--)
	            {
	                a[iSize - x - 1][j] = z;
	                z--;
	            }
	            for (i = iSize - x - 2; i > x; i--)
	            {
	                a[i][y] = z;
	                z--;
	            }
	            x++;
	            y++;
	        }

	        for (i = 0; i < iSize; i++)
	        {
	            for (j = 0; j < iSize; j++)
	            {
	                System.out.printf(" %02d", a[i][j]);
	            }
	            System.out.println();
	        }
	    }
}
/* OUTPUT: 

Enter Size: 5
Spiral Reverse pattern Output : 
 25 24 23 22 21
 10 09 08 07 20
 11 02 01 06 19
 12 03 04 05 18
 13 14 15 16 17

*/