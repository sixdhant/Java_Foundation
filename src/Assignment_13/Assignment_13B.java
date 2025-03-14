/********************************************* ASSIGNMENT NO - 13B ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_13;

import java.util.Scanner;

public class Assignment_13B {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant13B.assign13B(iNo1, iNo2);
	}
}

class Siddhant13B 
{
	public static void assign13B(int iRow, int iCol) 
	{
		int i = 0, j = 0, iSum = 0;
		if (iRow != iCol) 
		{
			return;
		}
		System.out.print("Output: ");
		System.out.print("\n");
		for (i = 1; i <= iRow; i++) 
		{
			for (j = 1; j <= iCol; j++) 
			{
				if (j <= ((iRow - i) + 1)) 
				{
					System.out.print("*\t");
				} 
				else 
				{
					System.out.print("#\t");
				}
			}
			System.out.print("\n");
		}
	}
}

/*OUTPUT: 

Enter number of Rows: 4
Enter number of columns: 4
Output: 
*	#	#	#	
*	*	#	#	
*	*	*	#	
*	*	*	*	


Enter number of Rows: 5
Enter number of columns: 5
Output: 
*	*	*	*	*	
*	*	*	*	#	
*	*	*	#	#	
*	*	#	#	#	
*	#	#	#	#	

Enter number of Rows: 5
Enter number of columns: 4
Output: 
*/



