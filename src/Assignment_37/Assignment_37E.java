/**************************************** ASSIGNMENT NO - 37E ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_37;

import java.lang.*;
import java.util.Scanner;

public class Assignment_37E {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		int iRow=0, iCol=0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
	
		
		Siddhant37E sid37E = new Siddhant37E();
		sid37E.assign37E(iRow, iCol);
		
	}
}

class Siddhant37E 
{
	public void  assign37E(int iRow, int iCol) 
	{
		System.out.println("Output : ");
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(i);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

/*  OUTPUT:

Enter Row Size: 4
Enter Colunm Size: 4
Output : 
1	1	1	1	
2	2	2	2	
3	3	3	3	
4	4	4	4
*/


