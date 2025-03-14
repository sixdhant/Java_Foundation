/********************************************* ASSIGNMENT NO - 11B ***************************************
 
 STATEMENT: Accept number of rows and number of columns from user and display below pattern.
 
 INPUT :   4, 4
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_11;

import java.util.Scanner;

public class Assignment_11B {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter number of Rows: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iNo2 = Sobj.nextInt();

		Siddhant11B.assign11B(iNo1, iNo2);
	}
}

class Siddhant11B 
{
	public static void assign11B(int iRow, int iCol) 
	{
		int i = 0, j = 0;
		char ch = 'A', cVal = 'a';
		if (iRow != iCol) 
		{
			return;
		}
		System.out.print("Output: ");
		System.out.print("\n");
		for (i = 1, ch = 'A', cVal = 'a'; i <= iRow; i++, ch++, cVal++) 
		{
			for (j = 1, ch = 'A', cVal = 'a'; j <= iCol; j++, ch++, cVal++) 
			{
				if (i % 2 != 0) 
				{
					System.out.print("\t" + ch);
				} 
				else 
				{
					System.out.print("\t" + cVal);
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
	A	B	C	D
	a	b	c	d
	A	B	C	D
	a	b	c	d


Enter number of Rows: 6
Enter number of columns: 6
Output: 
	A	B	C	D	E	F
	a	b	c	d	e	f
	A	B	C	D	E	F
	a	b	c	d	e	f
	A	B	C	D	E	F
	a	b	c	d	e	f

Enter number of Rows: 4
Enter number of columns: 5

*/


