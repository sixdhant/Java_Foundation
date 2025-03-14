package com.PatternPrintingProblems;

import java.util.Scanner;

public class SquareStarPattern {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int iNo = sobj.nextInt();

		System.out.print("Enter Symbol : ");
		char c = sobj.next().charAt(0);
		System.out.println("Output :");

		for (int i = 0; i < iNo; i++) 
		{
			for (int j = 0; j < iNo; j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

Enter Number : 6
Enter Symbol : *
Output :
******
******
******
******
******
******  
*/