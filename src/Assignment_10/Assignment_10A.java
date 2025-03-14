/********************************************* ASSIGNMENT NO - 10A ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 3
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_10;

import java.util.Scanner;

public class Assignment_10A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant10A.assign10A(iNo1, iNo2);       	
	}
}

class Siddhant10A 
{
	public static void assign10A(int iRow, int iCol) 
	{
		int i = 0, j = 0;
		System.out.print("Output: ");
		System.out.print("\n");
		for (i = 1; i <= iRow; i++) 
		{
			for (j = 1; j <= iCol; j++) 
			{
				System.out.print("*\t");
			}
			System.out.print("\n");
		}
	}
}

/*OUTPUT: 

Enter number of Rows: 4
Enter number of columns: 3
Output: 
*	*	*	
*	*	*	
*	*	*	
*	*	*	

Enter number of Rows: 5
Enter number of columns: 4
Output: 
*	*	*	*	
*	*	*	*	
*	*	*	*	
*	*	*	*	
*	*	*	*	
	
*/

