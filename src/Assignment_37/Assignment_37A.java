/**************************************** ASSIGNMENT NO - 37A ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_37;

import java.lang.*;
import java.util.Scanner;

public class Assignment_37A {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		int iRow=0, iCol=0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
	
		
		Siddhant37A sid37A = new Siddhant37A();
		sid37A.assign37A(iRow, iCol);
		
	}
}

class Siddhant37A {
	public void  assign37A(int iRow, int iCol) 
	{
		System.out.println("Output : ");
		int i=0, j=0;
		char ch;
		for(i=1;i<=iRow;i++)
		{
		
			for(j=1;j<=iCol;j++)
			{
				System.out.print("*");
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
*	*	*	*	
*	*	*	*	
*	*	*	*	
*	*	*	*	
*/

