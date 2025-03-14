package com.CalculationProblems;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String arg[]) 
	{
		Scanner sobj = new Scanner(System.in);
		
		long iNo, iSum = 0;		
		System.out.print("Enter a number : ");
		iNo = sobj.nextLong();
		
		int i = 1;
		while (i <= iNo / 2) 
		{
			if (iNo % i == 0) 
			{
				iSum += i;
			}
			i++;
		}
		if (iSum == iNo) 
		{
			System.out.println(iNo + " is a perfect number");
		} 
		else
		{
			System.out.println(iNo + " is not a  perfect number");
		}
	}
}
/*OUTPUT: 

Enter a number : 6
6 is a perfect number
*/