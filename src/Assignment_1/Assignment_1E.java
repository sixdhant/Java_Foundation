/*********************************************** ASSIGNMENT NO - 1E *******************************************************
 
 STATEMENT: Accept One number from user and print that number of * on screnn
 
 INPUT :    5
 OUTPUT :   *	*	*	*	*
 
***************************************************************************************************************************/

package Assignment_1;

import java.util.Scanner;

public class Assignment_1E {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;		
		
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		Siddhant1E.assign1E(iNo1);	
	}
}

class Siddhant1E {
	public static void assign1E(int iValue1)
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
