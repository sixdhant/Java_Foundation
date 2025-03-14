package com.CalculationProblems;

import java.util.Scanner;

public class Factorial_Recursion {

	public static void main(String arg[]) 
	{		
		long iNo;
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number: ");
		iNo = sobj.nextLong();

		long iFact = Factorial_Recursion.factor(iNo);
		System.out.println("Factorial = " + iFact);
	}
	
	static long factor(long iNo) 
	{
		if (iNo <= 0)
		{
			return 1;
		}
		return Factorial_Recursion.factor(iNo - 1) * iNo;
	}
}
/*OUTPUT: 

Enter number: 7
Factorial = 5040
*/