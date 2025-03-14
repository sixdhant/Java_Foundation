/**************************************** ASSIGNMENT NO - 33B ***************************************
 
 STATEMENT: Write a java program which accept number from user and return the count of odd digits.
 
 INPUT :  2468    3179   123456
 OUTPUT :  0       4       3
   
*****************************************************************************************************/

package Assignment_33;

import java.util.Scanner;

public class Assignment_33B {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner (System.in);
		
		System.out.print("Enter Number: ");
		int iValue = Sobj.nextInt();

		int iRet = Siddhant33B.assign33B(iValue );
		
		System.out.println("Count of odd digit is: "+iRet);
	}
}

class Siddhant33B {
	public static int assign33B(int iNo) 
	{
		int iCnt=0, iDigit= 0;
	      
	      if(iNo < 0)
	      {
	          iNo = - iNo;
	      }
	         
	     while(iNo > 0)  //(iNo != 0)
	     {
	        iDigit= iNo % 10;
	        
	        if(iDigit % 2 != 0)
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
Count of odd digit is: 3

Enter Number: 1018
Count of odd digit is: 2

Enter Number: -1018
Count of odd digit is: 2
*/