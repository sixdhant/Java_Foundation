package com.CalculationProblems;

import java.util.Scanner;

public class CommissionPercentage {

	public static void main(String arg[]) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter amount: ");

		double iAmount = sobj.nextDouble();
		System.out.print("Enter commission Percentage: ");
		double iPercentage = sobj.nextDouble();

		Calculate pobj = new Calculate(iAmount, iPercentage);

		System.out.println("Commission amount = " + pobj.iResult);
	}
}

class Calculate 
{
	double iResult;
	Calculate(double iAmount, double iPercentage)
	{
		iResult = (iPercentage / 100) * iAmount;
	}
}
/*OUTPUT:

Enter amount:3000
Enter commission Percentage:20
Commission amount = 600.0
 */