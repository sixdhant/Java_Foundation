package com.SeriesPatterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String agrs[]) {

		Scanner Sobj = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int iSize = Sobj.nextInt();

		System.out.print("Triangular Numbers Series Output : ");
		for(int i=1;i<=iSize;i++)
		  {
		      int num=(i*(i+1))/2;
		      System.out.print(" "+num);
		  }
	}
}
/* OUTPUT: 

Enter Size: 8
Triangular Numbers Series Output :  1 3 6 10 15 21 28 36

*/
