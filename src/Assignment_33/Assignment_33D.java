/**************************************** ASSIGNMENT NO - 33D ***************************************
 
 STATEMENT: Write a program which accept number from user and return multiplication of all digits.
 
 INPUT : 
 OUTPUT :  
   
*****************************************************************************************************/

package Assignment_33;

import java.util.Scanner;

public class Assignment_33D {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner (System.in);
		int iValue = 0, iRet = 0;
		
		System.out.print("Enter Number: ");
		iValue = Sobj.nextInt();

		iRet = Siddhant33D.assign33D(iValue );
		
		System.out.println("Multiplication of all digits is: "+iRet);
	}
}

class Siddhant33D {
	public static int assign33D(int iNo) 
	{
		int iMulti=1, iDigit= 0;
	      
	      if(iNo < 0)
	      {
	          iNo = - iNo;
	      }
	         
	     while(iNo > 0)  //(iNo != 0)
	     {
	        iDigit= iNo % 10;
	        iMulti = iMulti * iDigit;
	        iNo= iNo/10;
	     }
	     return iMulti;
	}
}

/** OUTPUT:

Enter Number: 2395
Multiplication of all digits is: 270

Enter Number: 922432
Multiplication of all digits is: 864
*/