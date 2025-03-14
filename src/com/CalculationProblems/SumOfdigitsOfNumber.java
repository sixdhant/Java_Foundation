package com.CalculationProblems;

import java.util.Scanner;

public class SumOfdigitsOfNumber {

	public static void main(String arg[]) 
	{
		long iNo, iSum;
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter a number : ");
		iNo = sobj.nextLong();
		for (iSum = 0; iNo != 0; iNo /= 10) {
			iSum += iNo % 10;
		}
		System.out.println("Sum of digits of a number is " + iSum);
	}
}

/*OUTPUT: 

Enter a number : 1234567890
Sum of digits of a number is 45
*/
