package com.CalculationProblems;

import java.util.Scanner;

public class FutureInvestmentValue {
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter present value: ");
		double iPresent = sobj.nextInt();
		
		System.out.print("Enter the interest rate: ");
		double iInterest = sobj.nextInt();
		
		System.out.print("Enter the time period in years: ");
		double iPeriod = sobj.nextInt();

		iFitureCalculation pobj = new iFitureCalculation(iPresent, iInterest, iPeriod);
		System.out.print("value is:= " + pobj.iFiture + "\n");
	}
}

class iFitureCalculation 
{
	double iFiture;

	iFitureCalculation(double iPresent, double iInterest, double iPeriod) 
	{
		iFiture = iPresent * Math.pow((1 + iInterest / 100), iPeriod);
	}
}
/*OUTPUT: 

Enter present value: 20000
Enter the interest rate: 20
Enter the time period in years: 20
value is:= 766751.9984894944
*/