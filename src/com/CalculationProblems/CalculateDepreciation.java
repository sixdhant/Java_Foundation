package com.CalculationProblems;

import java.util.Scanner;

public class CalculateDepreciation {

	public static void main(String[] args) 
	{
		long iAmount, iDeppercent, iYear, iAterdep, iTemp;

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter amount : ");
		iAmount = sobj.nextLong();

		System.out.print("Enter Depreciation percentage : ");
		iDeppercent = sobj.nextLong();

		System.out.print("Enter  number of years : ");
		iYear = sobj.nextLong();

		iTemp = depreciationCal(iAmount, iDeppercent, iYear);
		System.out.println("After depreciation = " + iTemp);

	}

	static long depreciationCal(long iAmount, long iDeppercent, long iYear) 
	{
		for (int i = 0; i < iYear; i++)
		{
			iAmount = ((100 - iDeppercent) * iAmount) / 100;
		}
		return iAmount;
	}
}
/*OUTPUT:

Enter amount : 10000
Enter Depreciation percentage : 50
Enter  number of years : 1
After depreciation = 5000
 */