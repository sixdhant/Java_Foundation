package com.TrigonometricProblems;

import java.util.Scanner;

public class FibonacciSeries_ForLoop {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int iNo = sobj.nextInt();
		
		int i = 0, j = 1, iNextTerm;
		
		System.out.println("Fibonacci series is :");
		for (int iCount = 0; iCount < iNo; iCount++) 
		{
			if (iCount <= 1)
			{
				iNextTerm = iCount;
			}	
			else 
			{
				iNextTerm = i + j;
				i = j;
				j = iNextTerm;
			}
			System.out.print(iNextTerm + " ");
		}
	}
}
/*OUTPUT: 

Enter number of terms : 8
Fibonacci series is 
0 1 1 2 3 5 8 13 
*/