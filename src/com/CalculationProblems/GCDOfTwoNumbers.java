package com.CalculationProblems;

import java.util.Scanner;

/*	GCD or Greatest Common Divisor of two

168 = 2 * 2 * 2 * 3 * 7
420 = 2 * 2 * 3 * 5 * 7
The common factors are 2 * 3 * 7 = 42.
Hence, the GCD of 168 and 420 is 42.

*/
public class GCDOfTwoNumbers {

	public static void main(String arg[]) 
	{
		long iNo1, iNo2;
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter  number 1: ");
		iNo1 = sobj.nextLong();
		
		System.out.print("Enter  number 2: ");
		iNo2 = sobj.nextLong();
		if (iNo1 > 0 && iNo2 > 0) 
		{
			while (iNo1 != iNo2) 
			{
				if (iNo1 > iNo2)
				{
					iNo1 = iNo1 - iNo2;
				}
				else
				{
					iNo2 = iNo2 - iNo1;
				}
			}
			System.out.println("Gcd of two numbers is = " + iNo1);
		} 
		else
		{
			System.out.println("Please enter numbers greater than zero");
		}
	}
}
/*OUTPUT: 

Enter  number 1:24
Enter  number 2: 48
Gcd of two numbers is = 24
*/