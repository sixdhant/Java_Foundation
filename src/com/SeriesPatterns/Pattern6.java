package com.SeriesPatterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String agrs[]) {

		Scanner Sobj = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int iSize = Sobj.nextInt();

		System.out.print("Cube Numbers Series Output : ");
		for (int i = 1; i <= iSize; i++) {
			System.out.print(" " + (i * i));
		}
	}
}
/* OUTPUT: 

Enter Size: 5
Cube Numbers Series Output :  1 4 9 16 25

*/