package com.PatternPrintingProblems;

import java.util.Scanner;

public class StarPattern5 {

	public static void main(String[] args) {
		

		Scanner sobj = new Scanner(System.in);
		int iRow = 0;

		System.out.println("Enter numbers of row size:");
		iRow = sobj.nextInt();

		System.out.println("\nPrint pattern: ");
		Diamond pobj = new Diamond();
		pobj.Pattern(iRow);

	}
}
class Diamond {
	public void Pattern(int iRow) {
		
		System.out.println(iRow);
		int i, j, space=1;
		space = iRow - 1;
			
		System.out.println();

		for (j = 1; j <= iRow; j++) 
		{

			for (i = 1; i <= space; i++) 
			{
				System.out.print(" ");
			}
			space--;
			
			for(i = 1; i <= 2 * j -1; i++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		
		 for(j=1; j<= iRow -1; j++)
		 {
			 for(i = 1; i <= space; i++)
			 {
				 System.out.print(" ");
			 }
			 space++;
			 
			 for(i=1; i <= 2 * (iRow - j) - 1; i++)
			 {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
	}
}

/* OUTPUT :

Enter numbers of row size:
4

Print pattern: 
4

   *
  ***
 *****
*******
 *****
  ***
   *

 */











