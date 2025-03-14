/********************************************* ASSIGNMENT NO - 9E ***************************************
 
 STATEMENT: Accept number from user and display below pattern.
 
 INPUT :   8
 OUTPUT :  2       4       6       8       10      12      14      16
  
*********************************************************************************************************/
 
package Assignment_9;

import java.util.Scanner;

public class Assignment_9E {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo = 0;

		System.out.print("Enter starting point: ");
		iNo = Sobj.nextInt();

		Siddhant9E.assign9E(iNo);      	
	}
}

class Siddhant9E
{
	public static void assign9E(int iStart)
	{
		int iCnt= 1, iEven= 0; 
		System.out.print("Output: ");
	    
	    if(iStart < 0)
	    {
	    	iStart = - iStart;    
	    }	    
	    for(iCnt=1; iCnt<=iStart; iCnt++)
	    {
	      iEven= 2 * iCnt;
	      System.out.print("\t"+iEven);
	    }
	}
}
/*OUTPUT: 

Enter starting point: 8
Output: 	2	4	6	8	10	12	14	16

Enter starting point: 10
Output: 	2	4	6	8	10	12	14	16	18	20	
*/

