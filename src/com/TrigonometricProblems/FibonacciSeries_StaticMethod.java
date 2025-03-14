package com.TrigonometricProblems;

import java.util.Scanner;

public class FibonacciSeries_StaticMethod {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int iNo = sobj.nextInt();
		series(iNo);
	}

	static void series(int iNum) 
	{
		System.out.println("Fibonacci series is :");
		int i = 0, j = 1, iNext;
		for (int iCount = 0; iCount < iNum; iCount++) 
		{
			if (iCount <= 1)
			{
				iNext = iCount;
			}				
			else 
			{
				iNext = i + j;
				i = j;
				j = iNext;
			}
			System.out.print(iNext + " ");
		}
	}
}
/*OUTPUT: 

Enter number of terms : 8
FibonaiNextci series is 
0 1 1 2 3 5 8 13 
*/