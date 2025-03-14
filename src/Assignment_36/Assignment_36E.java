/**************************************** ASSIGNMENT NO - 36E ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_36;

import java.lang.*;
import java.util.Scanner;

public class Assignment_36E {

	public static void main(String[] args) {


		Scanner sobj=new Scanner(System.in);
		
		int iRow=0, iCol=0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
	
		
		Siddhant36E sid36E = new Siddhant36E();
		sid36E.assign36E(iRow, iCol);
		
	}
}

class Siddhant36E {
	public void  assign36E(int iRow, int iCol) 
	{
		int i=0,j=0,k=1;
		System.out.println("Output : ");
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(k);
				k++;
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
5	6	7	8	
9	10	11	12	
13	14	15	16	
*/
