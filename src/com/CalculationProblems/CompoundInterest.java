package com.CalculationProblems;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String args[]) {

		double iAmount = 0, iPrinciple, iRate, iTime, iCompoundInterest, itemp = 1;
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter principle : ");
		iPrinciple = sobj.nextDouble();

		System.out.print("Enter rate : ");
		iRate = sobj.nextDouble();

		System.out.print("Enter time : ");
		iTime = sobj.nextDouble();

		iRate = (1 + iRate / 100);

		for (int i = 0; i < iTime; i++) 
		{
			itemp *= iRate;
		}
		iAmount = iPrinciple * itemp;

		System.out.println("Amount = " + iAmount);

		iCompoundInterest = iAmount - iPrinciple;
		System.out.println("Compound intrest = " + iCompoundInterest);
	}
}
/*OUTPUT:

Enter principle : 10000
Enter rate : 5
Enter time : 5
Amount = 12762.815625000003
Compound intrest = 2762.815625000003
*/