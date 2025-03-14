/**************************************** ASSIGNMENT NO - 33C ***************************************
 
 STATEMENT: Write a program which accept number from user and return the count of digits in between 3 and 7.
 
 INPUT :  
 OUTPUT :  
   
*****************************************************************************************************/

package Assignment_33;

import java.lang.*;
import java.util.Scanner;

public class Assignment_33C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner (System.in);
		int iValue = 0, iRet = 0;
		
		System.out.print("Enter Number: ");
		iValue = Sobj.nextInt();

		iRet = Siddhant33C.assign33C(iValue );
		
		System.out.println("Count of digits in between 3 and 7 is: "+iRet);
	}
}

class Siddhant33C {
	public static int assign33C(int iNo) 
	{
		int iCnt=0, iDigit= 0;
	      
	      if(iNo < 0)
	      {
	          iNo = - iNo;
	      }
	         
	     while(iNo > 0)  //(iNo != 0)
	     {
	        iDigit= iNo % 10;
	        
	        if(iDigit > 3 && iDigit < 7)
	        {
	            iCnt++;
	        }
	        iNo= iNo/10;
	     }
	     return iCnt;
	}
}

/* OUTPUT:

Enter Number: 2395
Count of digits in between 3 and 7 is: 1

Enter Number: 1018
Count of digits in between 3 and 7 is: 0

Enter Number: 4521
Count of digits in between 3 and 7 is: 2
*/