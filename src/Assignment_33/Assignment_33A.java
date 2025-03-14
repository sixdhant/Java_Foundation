/**************************************** ASSIGNMENT NO - 33A ***************************************
 
 STATEMENT: Write a java program which accept number from user and return the count of even digits.
 
 INPUT :  2468    3179   123456
 OUTPUT :  4       0       3
   
*****************************************************************************************************/

package Assignment_33;

import java.util.Scanner;

public class Assignment_33A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner (System.in);
		int iValue = 0, iRet = 0;
		
		System.out.print("Enter Number: ");
		iValue = Sobj.nextInt();

		iRet = Siddhant33A.assign33A(iValue );
		
		System.out.println("Count of Even even digit is: "+iRet);
	}
}

class Siddhant33A {
	public static int assign33A(int iNo) 
	{
		int iCnt=0, iDigit= 0;
	      
	      if(iNo < 0)
	      {
	          iNo = - iNo;
	      }
	         
	     while(iNo > 0)  //(iNo != 0)
	     {
	        iDigit= iNo % 10;
	        
	        if(iDigit % 2 == 0)
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
Count of Even even digit is: 1

Enter Number: 1018
Count of Even even digit is: 2

Enter Number: -1018
Count of Even even digit is: 2
*/