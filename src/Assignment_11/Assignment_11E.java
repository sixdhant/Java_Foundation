/********************************************* ASSIGNMENT NO - 11E ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_11;

import java.util.Scanner;

public class Assignment_11E {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant11E.assign11E(iNo1, iNo2);
	}
}

class Siddhant11E 
{
	public static void assign11E(int iRow, int iCol) 
	{
		int i= 0, j= 0, iSum=0;
		System.out.print("Output: ");
		System.out.print("\n");
	    
	    for(i=1; i<=iRow; i++)
	    {
	        for(j=1; j<=iCol;j++)
	        {
	            iSum = iSum + 1;
	            System.out.print("\t"+iSum);
	        }
	        System.out.print("\n");    
	    }
	}
}

/*OUTPUT: 

Enter number of Rows: 3
Enter number of columns: 4
Output: 
	1	2	3	4
	5	6	7	8
	9	10	11	12


Enter number of Rows: 4
Enter number of columns: 6
Output: 
	1	2	3	4	5	6
	7	8	9	10	11	12
	13	14	15	16	17	18
	19	20	21	22	23	24
*/



