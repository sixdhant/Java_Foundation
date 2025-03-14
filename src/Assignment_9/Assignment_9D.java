/********************************************* ASSIGNMENT NO - 9D ***************************************
 
 STATEMENT: Accept number from user and display below pattern.
 
 INPUT :   4
 OUTPUT :  #       4       *       #       3       *       #       2       *       #       1       *
  
*********************************************************************************************************/
 
package Assignment_9;

import java.util.Scanner;

public class Assignment_9D {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo = 0;

		System.out.print("Enter starting point: ");
		iNo = Sobj.nextInt();

		Siddhant9D.assign9D(iNo);      	
	}
}

class Siddhant9D
{
	public static void assign9D(int iStart)
	{
		int iCnt1= 0; 
		System.out.print("Output: ");
	    for(iCnt1=iStart; iCnt1>=1; iCnt1--)
	    {
	    	System.out.print("\t#");
	    	System.out.print("\t"+iCnt1);
	    	System.out.print("\t*");
	    }
	}
}
/*OUTPUT: 

Enter starting point: 4
Output: 	#	4	*	#	3	*	#	2	*	#	1	*

Enter starting point: 6
Output: 	#	6	*	#	5	*	#	4	*	#	3	*	#	2	*	#	1	*	
*/

