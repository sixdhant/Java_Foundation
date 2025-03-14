/********************************************* ASSIGNMENT NO - 11C ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_11;

import java.util.Scanner;

public class Assignment_11C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant11C.assign11C(iNo1, iNo2);
	}
}

class Siddhant11C 
{
	public static void assign11C(int iRow, int iCol) 
	{
		int i= 0, j= 0;
	    char ch= '\0';
	    System.out.print("Output: ");
		System.out.print("\n");
	    
	    for(i=1, ch= 'A'; i<=iRow; i++,ch++)
	    {
	        for(j=1; j<=iCol; j++)
	        {
	        	System.out.print("\t"+ch);
	        }
	        System.out.print("\n");    
	    }
	}
}

/*OUTPUT: 

Enter number of Rows: 3
Enter number of columns: 5
Output: 
	A	A	A	A	A
	B	B	B	B	B
	C	C	C	C	C


Enter number of Rows: 4
Enter number of columns: 6
Output: 
	A	A	A	A	A	A
	B	B	B	B	B	B
	C	C	C	C	C	C
	D	D	D	D	D	D
*/


