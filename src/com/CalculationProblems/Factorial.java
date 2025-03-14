package com.CalculationProblems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		long iNo1, iFact1 = 1;
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number: ");
		iNo1 = sobj.nextLong();

		for (int i = 1; i <= iNo1; i++) 
		{
			iFact1 = iFact1 * i;
		}
		System.out.println("Factorial = " + iFact1);
//****************************************************************************************			
		
		//Using while loop
		long iNo2, iFact2 = 1;

		System.out.print("\nEnter number: ");

		iNo2 = sobj.nextLong();
		int i = 1;
		while (i <= iNo2) 
		{
			iFact2 = iFact2 * i;
			i++;
		}
		System.out.println("Factorial = " + iFact2);
//****************************************************************************************		
		
		//Using Do While Loop
		long iNo3, iFact3 = 1;

		System.out.print("\nEnter number: ");
		iNo3 = sobj.nextLong();

		i = 1;	
		do {
			iFact3 = iFact3 * i;
			i++;
		} while (i <= iNo3);

		System.out.println("Factorial = " + iFact3);
		
	}
}
/*OUTPUT: 

Enter number: 7
Factorial = 5040

Enter number: 7
Factorial = 5040

Enter number: 7
Factorial = 5040
*/