package com.PatternPrintingProblems;

import java.util.Scanner;

public class PlusStar {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int iNo = sobj.nextInt();

		System.out.print("Enter Symbol : ");
		char c = sobj.next().charAt(0);
		System.out.println("Output :");

		for (int i = 1; i <= iNo * 2 - 1; i++) 
		{
			if (i != iNo)
			{
				for (int j = 1; j <= iNo; j++)
				{
					if (j == iNo)
						System.out.print(c);
					System.out.print(" ");
				}
			}
			else
			{
				for (int j = 1; j <= iNo * 2 - 1; j++)
				{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

Enter Number : 5
Enter Symbol : *
Output :
    * 
    * 
    * 
    * 
*********
    * 
    * 
    * 
    * 

*/