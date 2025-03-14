package com.CalculationProblems;

import java.util.Scanner;

public class BattingAverage {
	public static void main(String arg[]) 
	{
		long iMatches, iRuns, iInnings, iNotout;

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the number of matches played : ");
		iMatches = sobj.nextLong();

		while (true) 
		{
			System.out.print("Enter the number innings batted : ");
			iInnings = sobj.nextLong();

			if (iInnings <= iMatches)
			{
				break;
			}
			System.out.print("Enter the number innings batted correctly <=matches: ");
		}

		while (true) 
		{
			System.out.print("Enter number of times notout :");
			iNotout = sobj.nextLong();

			if (iNotout <= iInnings)
			{
				break;
			}
			System.out.println("Enter the number times became notout correctly <=innings:");
		}

		System.out.print("Enter runs scored: ");
		iRuns = sobj.nextLong();

		AvgCalculation average = new AvgCalculation(iRuns, iInnings, iNotout);
		System.out.println("Batting average= " + average.avg);
	}
}

class AvgCalculation 
{
	double avg = 0;
	AvgCalculation(long iRuns, long iInnings, long iNotout) 
	{
		if (iInnings == iNotout) 
		{
			avg = iRuns;
		} 
		else 
		{
			avg = iRuns / (iInnings - iNotout);
		}
	}
}

/*OUTPUT:

Enter the number of matches played : 5
Enter the number innings batted : 5
Enter number of times notout :5
Enter runs scored: 100
Batting average= 100.0
 */