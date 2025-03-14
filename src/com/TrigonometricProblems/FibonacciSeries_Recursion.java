package com.TrigonometricProblems;

import java.util.Scanner;

public class FibonacciSeries_Recursion {

	int iCount = 0, i = 0, j = 1, iNext;
	
	void fib(int iNo) 
	{
		if (iNo > 0) 
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
			iCount++;
			fib(--iNo);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int iNo = sobj.nextInt();
		
		FibonacciSeries_Recursion pobj = new FibonacciSeries_Recursion();
		System.out.println("Fibonacci series is : ");
		pobj.fib(iNo);
	}
}
/*OUTPUT: 

Enter number of terms : 8
Fibonacci series is 
0 1 1 2 3 5 8 13 
*/