/**************************************** ASSIGNMENT NO - 36A ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_36;

import java.util.Scanner;

public class Assignment_36A {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);

		System.out.print("Enter Row Size: ");
		int iRow=sobj.nextInt();
		
		System.out.print("Enter Colunm Size: ");
		int iCol=sobj.nextInt();
	
		Siddhant36A.assign36A(iRow, iCol);
	}
}

class Siddhant36A {
	public static void  assign36A(int iRow, int iCol) 
	{
		int i=0, j=0;
		char ch;
		System.out.println("Output : ");
		for(i=1,ch='A';i<=iRow;i++,ch++)
		{
		
			for(j=1,ch='A';j<=iCol;j++,ch++)
			{
				System.out.print(ch);
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
A       B       C       D
A       B       C       D
A       B       C       D
A       B       C       D
 */