package com.PatternPrintingProblems;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		int iCount = 0;

		System.out.println("Enter Row Size:");
		iCount = sobj.nextInt();

		System.out.println("\nPrint pattern: ");
		Pattern3 pobj = new Pattern3();
		pobj.Pattern(iCount);
	}
}

class Pattern3 {

	public void Pattern(int iRow) {
		int i = 0, j = 0, iNum = 1;
		System.out.println();

		for (i = 0; i < iRow; i++) {
			iNum = 1;
			for (j = iRow - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {

				System.out.print(iNum + " ");
				iNum++;
			}
			System.out.println();
		}
	}
}

/* OUTPUT :

Enter Row Size:
5

Print pattern: 

    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 

*/


