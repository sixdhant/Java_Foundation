/**************************************** ASSIGNMENT NO - 40C ***************************************
 
 STATEMENT: Write a java program which accept number of rows and number of columns from user 
 			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_40;

import java.lang.*;
import java.util.Scanner;

public class Assignment_40C {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		int iRow = 0, iCol = 0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
		
		Siddhant40C sid40C = new Siddhant40C();
		sid40C.assign40C(iRow, iCol);	
	}
}

class Siddhant40C 
{
	public void  assign40C(int iRow, int iCol) 
	{
		System.out.println("Output : ");
		int i = 0, j = 0;
		if (iRow != iCol) {
			System.out.println("Plz Enter Row and Colunm size equal...");
			return;
		}
		for (i = iRow; i >= 1; i--) {
			for (j = 1; j <= iCol; j++) {
				if (i == 1 || i == iRow || j == 1 || j == iCol || i == j) {
					System.out.print("*");
					System.out.print("\t");
				}

				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}

/*  OUTPUT:

Enter Row Size: 5
Enter Colunm Size: 5
Output : 
*	*	*	*	*	
*			*	*	
*		*		*	
*	*			*	
*	*	*	*	*	
*/




