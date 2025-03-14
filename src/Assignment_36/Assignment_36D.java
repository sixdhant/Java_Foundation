/**************************************** ASSIGNMENT NO - 36D ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_36;

import java.util.Scanner;

public class Assignment_36D {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		int iRow=0, iCol=0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
	
		
		Siddhant36D sid36D = new Siddhant36D();
		sid36D.assign36D(iRow, iCol);
		
	}
}

class Siddhant36D {
	public void  assign36D(int iRow, int iCol) 
	{
		int i=0,j=0;
		System.out.println("Output : ");
		for(i=iRow;i>=1;i--)
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
4	4	4	4	
3	3	3	3	
2	2	2	2	
1	1	1	1	
 */
