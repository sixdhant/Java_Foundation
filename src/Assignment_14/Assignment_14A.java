/********************************************* ASSIGNMENT NO - 14A ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_14;

import java.util.Scanner;

public class Assignment_14A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant14A.assign14A(iNo1, iNo2);	       	
	}
}

class Siddhant14A 
{
	public static void assign14A(int iRow, int iCol) 
	{
		int i= 0, j= 0;
		System.out.print("Output: ");
		System.out.print("\n"); 
	    if(iRow != iCol)
	    {
	        return;
	    }	    
	    for(i=1; i<=iRow; i++)
	    {
	        for(j=1; j<=iCol;j++)
	        {
	            if(i<j)
	            {
	            	System.out.print("\t");
	            }
	            else
	            {
	            	System.out.print("*\t"); 
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
*				
*	*			
*	*	*		
*	*	*	*	


Enter number of Rows: 5
Enter number of columns: 5
Output: 
*					
*	*				
*	*	*			
*	*	*	*		
*	*	*	*	*	
*/




