/**************************************** ASSIGNMENT NO - 40B ***************************************
 
 STATEMENT: Write a java program which accept number of rows and number of columns from user 
 			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_40;

import java.lang.*;
import java.util.Scanner;

public class Assignment_40B {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		int iRow = 0, iCol = 0;
	
		System.out.print("Enter Row Size: ");
		iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		iCol=sobj.nextInt();
		
		Siddhant40B sid40B = new Siddhant40B();
		sid40B.assign40B(iRow, iCol);	
	}
}

class Siddhant40B 
{
	public void  assign40B(int iRow, int iCol) 
	{
		System.out.println("Output : ");
		int i=0, j=0;
		if(iRow!=iCol)
		{
			System.out.println("Plz Enter Row and Colunm size equal...");
			return;
		}
		for(i=iRow-1;i>=0;i--)
		{
			for(j=0;j<iCol;j++)
			{
			
				if((i==j))
				{
					System.out.print("#");
					System.out.print("\t");
				}
				else if(i>=j)
				{
					System.out.print("*");
					System.out.print("\t");
				}
				else
				{
					System.out.print("@");
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
*	*	*	*	#	
*	*	*	#	@	
*	*	#	@	@	
*	#	@	@	@	
#	@	@	@	@	
*/




