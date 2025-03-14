/****************************** ASSIGNMENT NO - 8D **************************************
 
 STATEMENT: Write a program which accept range from user and return addition of all even
            numbers in between that range. (Range should contains positive numbers only)
 
 INPUT :    10, 18
 OUTPUT :   Addition of even numbers in range is: 70
  
****************************************************************************************/
 
package Assignment_8;

import java.util.Scanner;

public class Assignment_8D {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0, iRet = 0;

		System.out.print("Enter starting point: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter ending point: ");
		iNo2 = Sobj.nextInt();

		if (iNo1 > iNo2) 
		{
			System.out.println("Invalid Input");
		}

		iRet = Siddhant8D.assign8D(iNo1, iNo2);

		System.out.println("Addition of even numbers in range is: " + iRet);
	}
}

class Siddhant8D
{
	public static int assign8D(int iStart, int iEnd)
	{
		int iCnt=0, iSum= 0;
	    
	    for(iCnt=iStart; iCnt<=iEnd; iCnt++)
	    {
	      if(iCnt % 2 == 0)
	      {
	      iSum = iSum + iCnt;
	      }
	    }
	    return iSum;
	}
}
/*OUTPUT: 

Enter starting point: 23
Enter ending point: 30
Addition of even numbers in range is: 108

Enter starting point: 10
Enter ending point: 18
Addition of even numbers in range is: 70

Enter starting point: 90 
Enter ending point: 18
Invalid Input
*/

