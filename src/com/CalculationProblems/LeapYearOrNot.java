package com.CalculationProblems;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {

		long iYear;
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter  any calendar year : ");
		iYear = sobj.nextLong();
		leapOrNot(iYear);
	}

	static void leapOrNot(long iYear) 
	{
		if (iYear != 0) 
		{
			if (iYear % 400 == 0)
			{
				System.out.println(iYear + " is a leap year");
			}
			else if (iYear % 100 == 0)
			{
				System.out.println(iYear + " is not a leap year");
			}
			else if (iYear % 4 == 0)
			{
				System.out.println(iYear + " is a leap year");
			}
			else
			{
				System.out.println(iYear + " is not a leap year");
			}
		} 
		else
		{
			System.out.println("Year zero does not exist ");
		}
	}
}
/*OUTPUT: 

Enter  any calendar year :1997
1997 is not a leap year
*/