/*************************************** ASSIGNMENT NO - 9B ***********************************
 
 STATEMENT: Accept number from user and display below pattern.
 
 INPUT :    5
 OUTPUT :   5       #       4       #       3       #       2       #       1       # 
  
************************************************************************************************/
 
package Assignment_9;

import java.util.Scanner;

public class Assignment_9B {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo = 0;

		System.out.print("Enter starting point: ");
		iNo = Sobj.nextInt();

		Siddhant9B.assign9B(iNo);
	}
}

class Siddhant9B
{
	public static void assign9B(int iStart)
	{
		int iCnt1= 0; 
		System.out.print("Output: ");
	    for(iCnt1=iStart; iCnt1>=1; iCnt1--)
	    {
	    	System.out.print("\t"+iCnt1);
	    	System.out.print("\t#");
	    }
	}
}
/*OUTPUT: 

Enter starting point: 5
Output: 	5	#	4	#	3	#	2	#	1	#


Enter starting point: 10
Output: 	10	#	9	#	8	#	7	#	6	#	5	#	4	#	3	#	2	#	1	#
*/

