/********************************************* ASSIGNMENT NO - 14 ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_14;

import java.util.Scanner;

public class Assignment_14E {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant14E.assign14E(iNo1, iNo2);	       	
	}
}

class Siddhant14E 
{
	public static void assign14E(int iRow, int iCol) 
	{
		int i= 0, j= 0, iSum=0;
		System.out.print("Output: ");
		System.out.print("\n");
		if (iRow != iCol) 
		{
			return;
		}   
	    for(i=1; i<=iRow; i++)
	    {
	        for(j=1; j<=iCol;j++)
	        {
	            if(i>j)
	            {
	            	System.out.print("\t");
	            }
	            else
	            {
	            	System.out.print("\t"+j); 
	            }
	        }
	        System.out.print("\n");    
	    }
	}
}

/*OUTPUT: 
 * 
Enter number of Rows: 4
Enter number of columns: 4
Output: 
	1	2	3	4
		2	3	4
			3	4
				4


Enter number of Rows: 6
Enter number of columns: 6
Output: 
	1	2	3	4	5	6
		2	3	4	5	6
			3	4	5	6
				4	5	6
					5	6
						6
*/




