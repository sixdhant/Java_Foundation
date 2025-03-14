/*********************************************** ASSIGNMENT NO - 2B *******************************************************
 
 STATEMENT: Accept One number from user and print that number of * on screnn (while loop)
 
 INPUT :    5
 OUTPUT :   *	*	*	*	*
 
***************************************************************************************************************************/

package Assignment_2;

import java.util.Scanner;

public class Assignment_2B {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;
				
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		Siddhant2B.assign2B(iNo1);		
	}
}

class Siddhant2B 
{
	public static void assign2B(int iValue1) 
	{
		if (iValue1 <= 0) 
		{
			iValue1 = -iValue1;
		}
		System.out.print("\nOUTPUT: ");

		while (iValue1 > 0) 
		{
			System.out.print("\t*");
			iValue1--;
		}
	}
}

/* OUTPUT: 

Enter Number: 5
OUTPUT: 	*	*	*	*	*

Enter Number: 10
OUTPUT: 	*	*	*	*	*	*	*	*	*	*
 */
