package com.SpiralPatterns;

import java.util.Scanner;

public class Pattern4 {
	
	 public static void main(String args[])
	    {
		 
		 int i=1;
	        int rows = 10;
	        int k = 1;
	        int x = 1;
	        System.out.print("Spiral Number Zig Zag Output : \n");
	        for (x = 1; x <= rows * 2; x += 2)
	        {
	            if (k % 2 == 1)
	            {
	                System.out.printf("%02d %02d %02d %02d ",i,(i+1),(i+2),(i+3));
	                k++;
	                i += 4;
	            }
	            else
	            {
	                System.out.printf("%02d %02d %02d %02d ",(i+3),(i+2),(i+1),i);
	                k++;
	                i += 4;
	            }
	            System.out.println();
	        }
	    }
}
/* OUTPUT: 

Spiral Number Zig Zag Output : 
01 02 03 04 
08 07 06 05 
09 10 11 12 
16 15 14 13 
17 18 19 20 
24 23 22 21 
25 26 27 28 
32 31 30 29 
33 34 35 36 
40 39 38 37 

*/