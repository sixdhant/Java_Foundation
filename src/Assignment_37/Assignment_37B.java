/**************************************** ASSIGNMENT NO - 37B ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_37;

import java.lang.*;
import java.util.Scanner;

public class Assignment_37B {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		int iRow=0, iCol=0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
	
		
		Siddhant37B sid37B = new Siddhant37B();
		sid37B.assign37B(iRow, iCol);
		
	}
}

class Siddhant37B {
	public void  assign37B(int iRow, int iCol) 
	{
		System.out.println("Output : ");
		int i=0,j=0;
		for(i=iRow;i>=1;i--)
		{
			for(j=1;j<=iCol;j++)
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
1	2	3	4	
1	2	3	4	
1	2	3	4	
1	2	3	4	

*/


