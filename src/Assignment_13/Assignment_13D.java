/********************************************* ASSIGNMENT NO - 13D ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_13;

import java.util.Scanner;

public class Assignment_13D {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.println("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.println("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant13D.assign13D(iNo1, iNo2);       	
	}
}

class Siddhant13D 
{
	public static void assign13D(int iRow, int iCol) 
	{
		int i=0,j=0;
		System.out.print("Output: ");
		System.out.print("\n");
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i==1||i==iRow||j==1|j==iCol)
				{
					System.out.print("*\t");
				}				
				else
				{
					System.out.print("@\t");
				}
			}
			System.out.print("\n");
	   }
	}
}

/*OUTPUT: 

Enter number of Rows: 5
Enter number of columns: 4
Output: 
*	*	*	*	
*	@	@	*	
*	@	@	*	
*	@	@	*	
*	*	*	*	

Enter number of Rows: 6
Enter number of columns: 6
Output: 
*	*	*	*	*	*	
*	@	@	@	@	*	
*	@	@	@	@	*	
*	@	@	@	@	*	
*	@	@	@	@	*	
*	*	*	*	*	*	
*/



