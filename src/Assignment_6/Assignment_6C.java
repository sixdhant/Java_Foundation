/*********************************************** ASSIGNMENT NO - 6C *****************************************
 
 STATEMENT: Write a program which accept number from user and return the count of digits in  between 3 and 7.
 
 INPUT :  123456789   12365489224632
 OUTPUT :     5             5
 
 ************************************************************************************************************/

package Assignment_6;

import java.util.Scanner;

public class Assignment_6C {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo = 0, iRet = 0;

		System.out.print("Enter Number: ");
		iNo = Sobj.nextInt();

		iRet = Siddhant6C.assign6C(iNo);

		System.out.println("Count of digits in between 3 and 7 is: " + iRet);
	}
}
class Siddhant6C
{
	public static int assign6C(int iValue)
	{
		int iCnt=0, iDigit= 0;
	     
	     if(iValue < 0) 
	     {
	    	 iValue = - iValue; 
	     }		
	     while(iValue > 0)  
	     {
	        iDigit= iValue % 10;
	        
	        if(iDigit >= 3 && iDigit <= 7)
	        {
	            iCnt++;
	        }
	        iValue= iValue/10;
	     }	
		return iCnt;	
	}
}


/* OUTPUT:

Enter the Number: 123456789
Count of digits in between 3 and 7 is: 5

Enter the Number: 123456789224632
Count of digits in between 3 and 7 is: 3
*/












