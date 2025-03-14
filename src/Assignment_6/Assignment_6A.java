/************************************ ASSIGNMENT NO - 6A *************************************
 
 STATEMENT: Write a program which accept number from user and return the count of even digits.
 
 INPUT :  2468    3179   123456
 OUTPUT :  4       0       3
 
 **********************************************************************************************/
package Assignment_6;

import java.util.Scanner;

public class Assignment_6A {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo = 0, iRet = 0;

		System.out.print("Enter Number: ");
		iNo = Sobj.nextInt();

		iRet = Siddhant6A.assign6A(iNo);

		System.out.println("Count of even digits is: " + iRet);
	}
}

class Siddhant6A
{
	public static int assign6A(int iValue)
	{
		int iCnt=0, iDigit= 0;
	     
	     if(iValue < 0) 
	     {
	    	 iValue = - iValue; 
	     }		
	     while(iValue > 0)  //(iNo != 0)
	     {
	        iDigit= iValue % 10;
	        
	        if(iDigit % 2 == 0)
	        {
	            iCnt++;
	        }
	        iValue= iValue/10;
	     }	
		return iCnt;	
	}
}

/*OUTPUT: 

Enter Number: 2468
Count of even digits is: 4

Enter Number: 3197
Count of even digits is: 0

Enter Number: 123456
Count of even digits is: 3
*/











