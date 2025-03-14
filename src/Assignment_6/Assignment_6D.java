/************************************ ASSIGNMENT NO - 6D **********************************************
 
 STATEMENT: Write a program which accept number from user and return multiplication of all digits.
 
 INPUT :  12345     8055   985647
 OUTPUT :  120       0     60480
 
 *****************************************************************************************************/

package Assignment_6;

import java.util.Scanner;

public class Assignment_6D {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo = 0, iRet = 0;

		System.out.print("Enter Number: ");
		iNo = Sobj.nextInt();

		iRet = Siddhant6D.assign6D(iNo);

		System.out.println("Multiplication of all digits is: " + iRet);
	}
}

class Siddhant6D
{
	public static int assign6D(int iValue)
	{
		int iMult=1, iDigit= 0;
	     
	     if(iValue < 0) 
	     {
	    	 iValue = - iValue; 
	     }
	     while(iValue > 0)  //(iNo != 0)
	     {
	        iDigit= iValue % 10;
	        iMult = iMult * iDigit;
	        iValue= iValue / 10;
	     }
	     return iMult;
	}
}


/* OUTPUT:

Enter the Number: 12345
Multiplication of all digits is: 120

Enter the Number: 8055
Multiplication of all digits is: 0

Enter the Number: 986547
Multiplication of all digits is: 60480
*/












