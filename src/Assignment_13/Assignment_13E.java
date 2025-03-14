/********************************************* ASSIGNMENT NO - 1E ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_13;

import java.util.Scanner;

public class Assignment_13E {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant13E.assign13E(iNo1, iNo2);	       	
	}
}

class Siddhant13E 
{
	public static void assign13E(int iRow, int iCol) 
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
					System.out.print("\t"+j);
				}				
				else
				{
					System.out.print("\t*");
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
	1	2	3	4
	1	*	*	4
	1	*	*	4
	1	2	3	4


Enter number of Rows: 6
Enter number of columns: 6
Output: 
	1	2	3	4	5	6
	1	*	*	*	*	6
	1	*	*	*	*	6
	1	*	*	*	*	6
	1	*	*	*	*	6
	1	2	3	4	5	6
*/




