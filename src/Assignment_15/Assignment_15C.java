/********************************************* ASSIGNMENT NO - 15C ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_15;

import java.util.Scanner;

public class Assignment_15C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant15C.assign15C(iNo1, iNo2);	       	
	}
}

class Siddhant15C 
{
	public static void assign15C(int iRow, int iCol) 
	{
		int i=0,j=0;		
		if(iRow!=iCol)
		{
			System.out.println("Plz enter row and column size same");
			return;
		}
		System.out.print("Output: ");
		System.out.print("\n"); 
		for(i=iRow;i>=1;i--)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i==1||i==iRow||j==1||j==iCol||i==j)
				{
					System.out.print("*\t");
				}
				
				else
				{
					System.out.print("\t");
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
*	*	*	*	
*		*	*	
*	*		*	
*	*	*	*	

Enter number of Rows: 6
Enter number of columns: 6
Output: 
*	*	*	*	*	*	
*				*	*	
*			*		*	
*		*			*	
*	*				*	
*	*	*	*	*	*	

*/




