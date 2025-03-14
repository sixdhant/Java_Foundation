/**************************************** ASSIGNMENT NO - 37C ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_37;

import java.lang.*;
import java.util.Scanner;

public class Assignment_37C {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		int iRow=0, iCol=0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
	
		
		Siddhant37C sid37C = new Siddhant37C();
		sid37C.assign37C(iRow, iCol);
		
	}
}

class Siddhant37C {
	public void  assign37C(int iRow, int iCol) 
	{
		System.out.println("Output : ");
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
				System.out.print(j);
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
4	3	2	1	
4	3	2	1	
4	3	2	1	
4	3	2	1

*/


