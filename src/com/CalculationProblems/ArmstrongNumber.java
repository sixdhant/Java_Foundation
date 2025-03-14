package com.CalculationProblems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] arg) 
	{
		int iValue, iArm = 0, iNo, iTemp;
		
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter a number :");
		iNo = sobj.nextInt();
		
		iTemp = iNo;
		for (; iNo != 0; iNo /= 10) 
		{
			iValue = iNo % 10;
			iArm = iArm + (iValue * iValue * iValue);
		}
		if (iArm == iTemp)
		{
			System.out.println(iTemp + " is a armstrong number ");
		}
		else
		{
			System.out.println(iTemp + " is not a armstrong number ");
		}
	}
}
/*OUTPUT:

Enter a number : 153
153 is a armstrong number 
*/
