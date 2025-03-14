/********************************************* ASSIGNMENT NO - 11A ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_11;

import java.util.Scanner;

public class Assignment_11A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant11A.assign11A(iNo1, iNo2);	       	
	}
}

class Siddhant11A 
{
	public static void assign11A(int iRow, int iCol) 
	{		
		int i= 0, j= 0;
	    char ch= '\0';
	    System.out.print("Output: ");
		System.out.print("\n");	    
	    for(i=1; i<=iRow; i++)
	    {
	        for(j=1, ch= 'A'; j<=iCol; j++,ch++)
	        {
	        	System.out.print("\t"+ch);
	        }
	        System.out.print("\n");    
	    }
	}
}

/*OUTPUT: 

Enter number of Rows: 4
Enter number of columns: 4
Output: 
	A	B	C	D
	A	B	C	D
	A	B	C	D
	A	B	C	D


Enter number of Rows: 6
Enter number of columns: 6
Output: 
	A	B	C	D	E	F
	A	B	C	D	E	F
	A	B	C	D	E	F
	A	B	C	D	E	F
	A	B	C	D	E	F
	A	B	C	D	E	F
*/

