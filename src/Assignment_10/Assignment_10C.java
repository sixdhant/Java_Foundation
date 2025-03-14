/********************************************* ASSIGNMENT NO - 10 ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   3, 5
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_10;

import java.util.Scanner;

public class Assignment_10C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant10C.assign10C(iNo1, iNo2);       	
	}
}

class Siddhant10C 
{
	public static void assign10C(int iRow, int iCol) 
	{
		int i = 0, j = 0;
		System.out.print("Output: ");
		System.out.print("\n");
		for (i=iRow; i>=1; i--) 
		{
			for (j=iCol; j>=1; j--) 
			{
				System.out.print("\t"+j);
			}
			System.out.print("\n");
		}
	}
}
/*OUTPUT: 

Enter number of Rows: 3
Enter number of columns: 5
Output: 
	5	4	3	2	1
	5	4	3	2	1
	5	4	3	2	1

Enter number of Rows: 4
Enter number of columns: 6
Output: 
	6	5	4	3	2	1
	6	5	4	3	2	1
	6	5	4	3	2	1
	6	5	4	3	2	1
*/









