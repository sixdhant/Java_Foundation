/**************************** ASSIGNMENT NO - 6B ********************************************
 
 STATEMENT: Write a program which accept number from user and return the count of odd digits.
 
 INPUT :  2486   4196  805531
 OUTPUT :  0      2       4
 
 *********************************************************************************************/
package Assignment_6;

import java.util.Scanner;

public class Assignment_6B {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo = 0, iRet = 0;

		System.out.print("Enter Number: ");
		iNo = Sobj.nextInt();

		iRet = Siddhant6B.assign6B(iNo);

		System.out.println("Count of odd digits is: " + iRet);
	}
}
class Siddhant6B
{
	public static int assign6B(int iValue)
	{
		int iCnt=0, iDigit= 0;
	     
	     if(iValue < 0) 
	     {
	    	 iValue = - iValue; 
	     }		
	     while(iValue > 0)  //(iNo != 0)
	     {
	        iDigit= iValue % 10;
	        
	        if(iDigit % 2 != 0)
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












