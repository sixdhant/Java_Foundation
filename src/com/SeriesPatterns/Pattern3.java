package com.SeriesPatterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String agrs[]) {
		
		Scanner Sobj = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int iSize = Sobj.nextInt();
		
		System.out.print("Odd Number Series Output : ");
		for (int i = 1; i <= iSize; i++) 
		{
			System.out.print(" " + (2 * i - 1));
		}
	}
}

/* OUTPUT: 

Enter Size: 5
Odd Number Series Output :  1 3 5 7 9

*/
