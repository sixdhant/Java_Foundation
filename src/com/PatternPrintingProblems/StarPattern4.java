package com.PatternPrintingProblems;

import java.util.Scanner;

public class StarPattern4 {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		int iRow = 0, iCol = 0;

		System.out.println("Enter Row Size:");
		iRow = sobj.nextInt();

		System.out.println("Enter Colunm Size:");
		iCol = sobj.nextInt();

		System.out.println("\nPrint pattern: ");
		Pattern4 pobj = new Pattern4();
		pobj.Pattern(iRow, iCol);
		
	}
}

class Pattern4 {

	public void Pattern(int iRow, int iCol) {
		int i = 0, j = 0;
		System.out.println();

		for(i=iRow;i>=1;i--)
		{
			for(j=1;j<=iCol;j++)
			{
				 if(i>j)
				{
					 System.out.print("*\t");
				}
				else if(i==j)
				{
					System.out.print("#\t");
				}
				else
				{
					System.out.print("@\t");
				}
			}
			System.out.print("\n");	
		}
	}
}


/* OUTPUT :

Enter Row Size:
5
Enter Colunm Size:
5

Print pattern: 

*	*	*	*	#	
*	*	*	#	@	
*	*	#	@	@	
*	#	@	@	@	
#	@	@	@	@	


*/
