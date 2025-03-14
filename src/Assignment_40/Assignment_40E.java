/**************************************** ASSIGNMENT NO - 40E ***************************************
 
 STATEMENT: Write a java program which accept number of rows and number of columns from user 
 			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_40;

import java.lang.*;
import java.util.Scanner;

public class Assignment_40E {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		int iRow = 0, iCol = 0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
		
		Siddhant40E sid40E = new Siddhant40E();
		sid40E.assign40E(iRow, iCol);	
	}
}

class Siddhant40E 
{
	public void  assign40E(int iRow, int iCol) 
	{
		System.out.println("Output : ");
		int i = 0, j = 0;
		if (iRow != iCol) {
			System.out.println("Plz Enter Row and Colunm size equal...");
			return;
		}
		for (i = 1; i <= iRow; i++) {
			for (j = 1; j <= iCol; j++) {
				if (i == 1 || i == iRow || j == 1 || j == iCol || i == j) {
					System.out.print(j);
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
1	2	3	4	5	
1	2			5	
1		3		5	
1			4	5	
1	2	3	4	5	

*/





