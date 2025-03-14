package com.CalculationProblems;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
	public static void main(String[] arg) 
	{
		int iNo1= 0, iNo2= 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		iNo1 = sobj.nextInt();
		
		System.out.print("Enter second number : ");
		iNo2 = sobj.nextInt();
		
		AdditinCal pobj = new AdditinCal(iNo1, iNo2);
		System.out.println("Addition of two numbers is : " + pobj.iResult);
	}
}

class AdditinCal 
{
	int iResult = 0;
	AdditinCal(int iValue1, int iValue2) 
	{
		iResult = iValue1 + iValue2;
	}
}

/*OUTPUT:

Enter first number : 11
Enter second number : 21
Addition of two numbers is : 32
*/