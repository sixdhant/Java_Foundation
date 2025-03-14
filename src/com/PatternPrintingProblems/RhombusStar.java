package com.PatternPrintingProblems;

import java.util.Scanner;

public class RhombusStar {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int iNo = sobj.nextInt();

		System.out.print("Enter Symbol : ");
		char c = sobj.next().charAt(0);
		System.out.println("Output :");

		for (int i = 1; i <= iNo; i++) 
		{
			for (int j = 1; j <= iNo - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= iNo; j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

Enter Number : 8
Enter Symbol : *
Output :
       ********
      ********
     ********
    ********
   ********
  ********
 ********
********

*/