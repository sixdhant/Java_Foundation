package com.CalculationProblems;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

		long iNo, iPower, iResult = 1;

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter number : ");
		iNo = sobj.nextLong();

		System.out.print("Enter power : ");
		iPower = sobj.nextLong();

		if (iNo >= 0 && iPower == 0) 
		{
			iResult = 1;
		} 
		else if (iNo == 0 && iPower >= 1) 
		{
			iResult = 0;
		} 
		else 
		{
			for (int i = 1; i <= iPower; i++) 
			{
				iResult = iResult * iNo;
			}
		}
		System.out.println(iNo + "^" + iPower + " = " + iResult);
	}
}
/*OUTPUT:

Enter number : 6
Enter power : 6
6^6 = 46656
 */