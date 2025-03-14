/**************************************** ASSIGNMENT NO - 6E *********************************************
 
 STATEMENT: Write a program which accept number from user and return difference between summation of even
  			digits and summation of odd digits.
 
 INPUT :   2395   1018  8440   5733
 OUTPUT :  -15     6     16    -18 
 
 ********************************************************************************************************/
package Assignment_6;

import java.util.Scanner;

public class Assignment_6E {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo = 0, iRet = 0;

		System.out.print("Enter Number: ");
		iNo = Sobj.nextInt();

		iRet = Siddhant6E.assign6E(iNo);

		System.out.println("Summation of even & odd digits is: " + iRet);
	}
}

class Siddhant6E
{
	public static int assign6E(int iValue)
	{
		 int iDigit= 0, iSum1= 0, iSum2= 0, iDiff= 0;
	     
	     if(iValue < 0) 
	     {
	    	 iValue = - iValue; 
	     }
	     while(iValue > 0)  //(iNo != 0)
	     {
	        iDigit= iValue % 10;
	        if(iDigit % 2 == 0)
	        {
	           iSum1 = iSum1 + iDigit;
	        }
	        else
	        {
	           iSum2 = iSum2 + iDigit;
	        }
	        iValue= iValue / 10;
	     }
	     iDiff = iSum1 - iSum2;
	     return iDiff;
	}
}


/* OUTPUT:

Enter the Number: 2395
Summation of even & odd digits is: -15

Enter the Number: 1018
Summation of even & odd digits is: 6

Enter the Number: 8440
Summation of even & odd digits is: 16

Enter the Number: 55733
Summation of even & odd digits is: -23
*/











