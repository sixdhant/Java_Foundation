package com.CalculationProblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String arg[]) 
	{	
		Scanner sobj = new Scanner(System.in);
		int iCount = 0;
		System.out.print("Enter a number :");		
		int iNo = sobj.nextInt();
		
		for (int i = 1; i <= iNo; i++) 
		{
			if (iNo % i == 0) 
			{
				iCount++;
			}
		}
		if (iCount == 2)
		{
			System.out.println("prime number ");
		}
		else
		{
			System.out.println("Not a prime number ");
		}
	}
}
/*OUTPUT: 

Enter a number :57
Not a prime number 

Enter a number :97
prime number 

*/