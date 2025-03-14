package com.CalculationProblems;

import java.util.Scanner;

public class CGPAPercentage {
	public static void main(String args[]) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number of subjects: ");
		int iSub = sobj.nextInt();

		double[] marks = new double[iSub];

		System.out.println("Enter marks :");
		for (int i = 0; i < iSub; i++) 
		{
			marks[i] = sobj.nextInt();
		}

		double grade[] = new double[iSub];
		double iCgpa, iSum;

		CGPACalculation pobj = new CGPACalculation(marks);

		iCgpa = pobj.iSum / iSub;

		System.out.println("CGPA is = " + iCgpa);
		System.out.println("Percantage from CGPA = " + iCgpa * 9.5);
	}
}

class CGPACalculation {
	double iSum = 0;
	
	CGPACalculation(double marks[]) 
	{
		double grade[] = new double[marks.length];

		for (int i = 0; i < marks.length; i++) 
		{
			grade[i] = (marks[i] / 10);
		}

		for (int i = 0; i < marks.length; i++)
		{
			iSum += grade[i];
		}
	}
}

/*OUTPUT:

Enter number of subjects: 
3
Enter marks :
100
100
100
CGPA is =10.0
Percantage from CGPA =95.0
*/