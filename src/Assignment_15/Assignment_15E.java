/********************************************* ASSIGNMENT NO - 15E ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_15;

import java.util.Scanner;

public class Assignment_15E {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant15E.assign15E(iNo1, iNo2);	       	
	}
}

class Siddhant15E 
{
	public static void assign15E(int iRow, int iCol) 
	{
		int i= 0, j= 0, iSum=0;
		System.out.print("Output: ");
		System.out.print("\n");   
	   
	    for(i=1; i<iRow; i++)
	    {
	        for(j=1; j<=iCol;j++)
	        {
	            if(i==1 ||i== iRow || i==j || j==1 || j == iCol)
	            {
	            	System.out.print("\t"+j);
	            }
	            else
	            {
	            	System.out.print(" \t"); 
	            }
	        }
	        System.out.print("\n");    
	    }
	}
}

/*OUTPUT: 

Enter number of Rows: 4
Enter number of columns: 4
Output: 
	1	2	3	4
	1	2 		4
	1 		3	4
	1	2	3	4


Enter number of Rows: 6
Enter number of columns: 6
Output: 
	1	2	3	4	5	6
	1	2 	 	 		6
	1 		3 	 		6
	1 	 		4 		6
	1 	 	 		5	6
	1	2	3	4	5	6
*/




