/****************************** ASSIGNMENT NO - 8C *****************************************
 
 STATEMENT: Write a program which accept range from user and return addition of all numbers
            in between that range. (Range should contains positive numbers only)
 
 INPUT :    23,30
 OUTPUT :   Addition is: 212

*******************************************************************************************/
 
package Assignment_8;

import java.util.Scanner;

public class Assignment_8C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0, iRet = 0;

		System.out.print("Enter starting point: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter ending point: ");
		iNo2 = Sobj.nextInt();

		iRet = Siddhant8C.assign8C(iNo1, iNo2);

		System.out.println("\nAddition is: " + iRet);
	}
}

class Siddhant8C
{
	public static int assign8C(int iStart, int iEnd)
	{
		int iCnt=0, iSum= 0;
	    
	    for(iCnt=iStart; iCnt<=iEnd; iCnt++)
	    {
	      iSum = iSum + iCnt;
	    }
	    return iSum;
	}
}
/*OUTPUT: 

Enter starting point: 23
Enter ending point: 30
Addition is: 212
*/

