package com.SeriesPatterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String agrs[]) {
		
		Scanner Sobj = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int iSize = Sobj.nextInt();
		int iNum = 1, iCount = 0;
		System.out.print("Prime Numbers Series Output : ");
		while (iNum <= iSize) 
		{
			for (int i = 1; i <= iNum; i++) 
			{
				if (iNum % i == 0) 
				{
					iCount++;
				}
			}
			if (iCount == 2) // true if iNumber is prime
			{
				System.out.print(" " + iNum);
			}
			iCount = 0; // reset iCount
			iNum++; // for checking next iNum
		}
	}
}
/* OUTPUT: 

Enter Size: 25
Prime Numbers Series Output :  2 3 5 7 11 13 17 19 23

*/