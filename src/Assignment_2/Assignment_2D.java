/*********************************************** ASSIGNMENT NO - 2D *******************************************************
 
 STATEMENT: Accept two numbers from user and display first number in second number of times
 
 INPUT :    12   5
 OUTPUT :   12	12	12	12	12
 
***************************************************************************************************************************/

package Assignment_2;

import java.util.Scanner;

public class Assignment_2D {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iNo1 = 0, iNo2= 0;
				
		System.out.print("Enter Number: ");
		iNo1 = scan.nextInt();
		
		System.out.print("Enter Number: ");
		iNo2 = scan.nextInt();
		
		Siddhant2D.assign2D(iNo1, iNo2);		
	}
}

class Siddhant2D 
{
	public static void assign2D(int iValue1, int iValue2) 
	{
		System.out.print("OUTPUT: ");
		for (int i = 0; i < iValue2; i++) 
		{
			System.out.print("\t" + iValue1);
		}
	}
}

/* OUTPUT: 

Enter Number: 12
Enter Number: 5
OUTPUT: 	12	12	12	12	12


Enter Number: 21
Enter Number: 10
OUTPUT: 	21	21	21	21	21	21	21	21	21	21
*/
