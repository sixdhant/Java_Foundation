package com.CalculationProblems;

import java.util.Scanner;

/* Least Common Multiplier or LCM of any n numbers is the least value that is a multiple of the given numbers.

Let us take three numbers such as 12, 15 and 18.

12 = 2 * 2 * 3
15 = 3 * 5
18 = 2 * 3 * 3
So we take the common prime factors and then the iResultt of the ones and multiply them with each other which would give us the LCM.

LCM = 2 * 2 * 3 * 3 * 5 = 180
*/

public class LCMOfTwoNumbers {

	static int i = 2;

	long lcmCal(long iNo1, long iNo2, long iTemp, long iResult) 
	{
		if (iResult % iNo2 != 0 || iResult % iNo1 != 0) 
		{
			iResult = iTemp * i;
			i = i + 1;
			return lcmCal(iNo1, iNo2, iTemp, iResult);
		}
		return iResult;
	}

	public static void main(String arg[]) 
	{
		Scanner sobj = new Scanner(System.in);
		long iValue1, iValue2, iRest, temp, iReturn;
		
		System.out.print("Enter  number 1 : ");
		iValue1 = sobj.nextLong();
		System.out.print("Enter  number 2 : ");
		iValue2 = sobj.nextLong();
		
		if (iValue1 == 0 || iValue2 == 0) 
		{
			System.out.println("Numbers should not be 0");
			System.exit(0);
		}
		LCMOfTwoNumbers pobj = new LCMOfTwoNumbers();
		if (iValue1 > iValue2)
		{
			iRest = iValue1;
		}
		else
		{
			iRest = iValue2;
		}
		temp = iRest;
		iReturn = pobj.lcmCal(iValue1, iValue2, temp, iRest);
		System.out.println("LCM of 2 numbers is = " + iReturn);
	}
}

/*OUTPUT: 

Enter  number 1 : 5
Enter  number 2 : 25
LCM of 2 numbers is = 25
*/

