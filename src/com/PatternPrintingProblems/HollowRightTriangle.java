package com.PatternPrintingProblems;

import java.util.Scanner;

public class HollowRightTriangle {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int iNo = sobj.nextInt();
		
		System.out.print("Enter Symbol : ");
		char cChar = sobj.next().charAt(0);
		
		System.out.println("Output :");
		for (int i = 1; i <= iNo; i++) 
		{
			if (i == 1 || i == iNo)
				for (int j = 1; j <= i; j++) 
				{
					System.out.print(cChar);
				}
			else 
			{
				for (int j = 1; j <= i; j++) 
				{
					if (j == 1 || j == i)
					{
						System.out.print(cChar);
					}						
					else
					{
						System.out.print(" ");
					}						
				}
			}
			System.out.println();
		}
	}
}

/* OUTPUT: 

Enter Number : 8
Enter Symbol : *
Output :
*
**
* *
*  *
*   *
*    *
*     *
********


*/