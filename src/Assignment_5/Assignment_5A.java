/**************************************** ASSIGNMENT NO - 5A **********************************************
 
 STATEMENT: Write a program which accept number from user and display its digits in reverse order.
 
 INPUT :    4691
 OUTPUT :   1  9  6  4
 
***********************************************************************************************************/

package Assignment_5;

import java.util.*;

public class Assignment_5A {
	public static void main(String arg[]) {
		Scanner Sobj = new Scanner(System.in);
		int iNo = 0, iRet = 0;

		System.out.print("Enter Number: ");
		iNo = Sobj.nextInt();

		iRet = Siddhant5A.assign5A(iNo);

		System.out.println("The Reverse of the given number is: " + iRet);
	}
}

class Siddhant5A {
	public static int assign5A(int iValue) {
		int Reverse = 0, Remainder = 0;

		while (iValue > 0) {
			Remainder = iValue % 10;
			Reverse = Reverse * 10 + Remainder;
			iValue = iValue / 10;
		}
		return Reverse;
	}
}

/*
 * OUTPUT:
 * 
 * Enter Number: 12345 The Reverse of the given number is: 54321
 * 
 * Enter Number: 1102 The Reverse of the given number is: 2011
 * 
 * Enter Number: 52304 The Reverse of the given number is: 40325
 */