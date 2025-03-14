package com.SeriesPatterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String agrs[]) {
		
		Scanner Sobj = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int iSize = Sobj.nextInt();
		
		System.out.print("Even Number Series Output : ");
		for (int i = 1; i <= iSize; i++) 
		{
			System.out.print(" " + (2 * i));
		}
	}
}

/* OUTPUT: 

Enter Size: 5
Even Number Series Output :  2 4 6 8 10

*/
