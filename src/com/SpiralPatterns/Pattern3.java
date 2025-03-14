package com.SpiralPatterns;

import java.util.Scanner;

public class Pattern3 {
	
	 public static void main(String args[])
	    {
		 
		 Scanner Sobj = new Scanner(System.in);
		 System.out.print("Enter Size: ");
		 int iSize = Sobj.nextInt(); // change to change size
	       
		 int[][] a = new int[8][8]; // same as 'n'
	        int i;
	        int j;
	        int ot;

	        int x = 0;
	        int y = 0;
	        int z = 0;
	        System.out.print("Spiral Alphabets pattern Output : \n");
	        for (ot = 0; ot <= iSize / 2; ot++)
	        {
	            if (ot == iSize / 2)
	            {
	                z--;
	            }
	            for (j = y; j < iSize - y; j++)
	            {
	                a[x][j] = z;
	                z++;
	            }
	            for (i = x + 1; i < iSize - x - 1; i++)
	            {
	                a[i][iSize - y - 1] = z;
	                z++;
	            }
	            for (j = iSize - y - 1; j >= y; j--)
	            {
	                a[iSize - x - 1][j] = z;
	                z++;
	            }
	            for (i = iSize - x - 2; i > x; i--)
	            {
	                a[i][y] = z;
	                z++;
	            }
	            x++;
	            y++;
	        }

	        for (i = 0; i < iSize; i++)
	        {
	            for (j = 0; j < iSize; j++)
	            {
	                if (a[i][j] >= 26)
	                {
	                    a[i][j] %= 26; // reset print char to A
	                }

	                System.out.print((char)(a[i][j] + 65)+" ");
	            }
	            System.out.println();
	        }
	    }
}
/* OUTPUT: 

Enter Size: 8
Spiral Alphabets pattern Output : 
A B C D E F G H 
B C D E F G H I 
A V W X Y Z I J 
Z U H I J A J K 
Y T G L K B K L 
X S F E D C L M 
W R Q P O N M N 
V U T S R Q P O 


*/