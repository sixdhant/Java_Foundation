package com.TrigonometricProblems;

import java.util.Scanner;

public class FibonacciSeries_WhileLoop {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int iNo = sobj.nextInt();
		
		int iFirst = 0, iSecond = 1, iNext;
		System.out.println("Fibonacci series is :");
		
		int i = 0;
		while (i < iNo) 
		{
			if (i <= 1)
			{
				iNext = i;
			}
			else 
			{
				iNext = iFirst + iSecond;
				iFirst = iSecond;
				iSecond = iNext;
			}
			System.out.print(iNext + " ");
			i++;
		}
	}
}
/*OUTPUT: 

Enter number of terms : 8
Fibonacci series is 
0 1 1 2 3 5 8 13 
*/