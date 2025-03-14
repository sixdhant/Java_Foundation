package com.SeriesPatterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String agrs[]) {
		
		Scanner Sobj = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int iSize = Sobj.nextInt();
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.print("Fibonacci Series Output : ");
		while (c <= iSize) 
		{
			System.out.print(" " + c);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
/* OUTPUT: 

Enter Size: 5
Fibonacci Series Output :  1 1 2 3 5

*/