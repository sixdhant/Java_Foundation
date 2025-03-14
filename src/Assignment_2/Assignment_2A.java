/*********************************************** ASSIGNMENT NO - 2A *******************************************************
 
 STATEMENT: Accept One number from user and print that number of * on screnn (for loop)
 
 INPUT :    5
 OUTPUT :   *	*	*	*	*
 
***************************************************************************************************************************/

package Assignment_2;

import java.util.Scanner;

public class Assignment_2A {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;
				
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		Siddhant2A.assign2A(iNo1);		
	}
}

class Siddhant2A 
{
	public static void assign2A(int iValue1) 
	{
		if (iValue1 <= 0) 
		{
			iValue1 = -iValue1;
		}
		System.out.print("\nOUTPUT: ");
		for (int i = iValue1; i > 0; i--) 
		{
			System.out.print("\t*");
		}
	}
}

/* OUTPUT: 

Enter Number: 5
OUTPUT: 	*	*	*	*	*

Enter Number: 10
OUTPUT: 	*	*	*	*	*	*	*	*	*	*
 */
