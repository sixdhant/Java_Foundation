/**************************************** ASSIGNMENT NO - 33E ***************************************
 
 STATEMENT: Write a program which accept number from user and return
            difference between summation of even digits and summation of odd digits.
 
 INPUT :  2395
 OUTPUT : -15 
   
*****************************************************************************************************/

package Assignment_33;

import java.util.Scanner;

public class Assignment_33E {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iValue = 0, iRet = 0;

		System.out.print("Enter Number: ");
		iValue = Sobj.nextInt();

		Siddhant33E sid33E = new Siddhant33E();
		iRet = Siddhant33E.assign33E(iValue);

		System.out.println("Difference between summation of even digits and summation of odd digits: " + iRet);
	}
}

class Siddhant33E {
	public static int assign33E(int iNo) {
		int iDigit = 0;
		int iEven = 0, iOdd = 0, iDiff = 0;
		if (iNo < 0) {
			iNo = -iNo;
		}
		while (iNo > 0) // (iNo != 0)
		{
			iDigit = iNo % 10;
			if (iDigit % 2 == 0) {
				iEven = iEven + iDigit;
			} else {
				iOdd = iOdd + iDigit;
			}
			iNo = iNo / 10;
		}
		iDiff = iEven - iOdd;
		return iDiff;
	}
}

/*  OUTPUT:

Enter Number: 2395
Difference between summation of even digits and summation of odd digits: -15

Enter Number: 1018
Difference between summation of even digits and summation of odd digits: 6

Enter Number: 5733
Difference between summation of even digits and summation of odd digits: -18
 */