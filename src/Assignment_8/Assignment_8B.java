/****************************************** ASSIGNMENT NO - 8B *******************************************
 
 STATEMENT: Write a program which accept range from user and display all even numbers in between that range.
 
 INPUT :    1,30
 OUTPUT :   2	4	6	8	10	12	14	16	18	20	22	24	26	28	30

 *********************************************************************************************************/
 
package Assignment_8;

import java.util.Scanner;

public class Assignment_8B {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter starting point: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter ending point: ");
		iNo2 = Sobj.nextInt();

		Siddhant8B.assign8B(iNo1, iNo2);
	}
}

class Siddhant8B
{
	public static void assign8B(int iStart, int iEnd)
	{
		int iCnt=0;	
		System.out.print("Output: ");
	    for(iCnt=iStart; iCnt<=iEnd; iCnt++)
	    {
	      if(iCnt % 2 == 0)
	      {
	    	  System.out.print("\t"+iCnt);  
	      }
	    }			
	}
}
/*OUTPUT: 

Enter starting point: 1
Enter ending point: 30
Output: 	2	4	6	8	10	12	14	16	18	20	22	24	26	28	30
*/

