/******************************************** ASSIGNMENT NO - 8E **********************************************
 
 STATEMENT: Write a program which accept accept range from user and display all numbers in
            between that range in reverse order.
 
 INPUT :    23, 35 
 OUTPUT :   35      34      33      32      31      30      29      28      27      26      25      24      23
  
 ***************************************************************************************************************/
 
 
package Assignment_8;

import java.util.Scanner;

public class Assignment_8E {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter starting point: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter ending point: ");
		iNo2 = Sobj.nextInt();

		if (iNo1 > iNo2) 
		{
			System.out.println("Invalid Input");
		}

		Siddhant8E sid8E = new Siddhant8E();
		sid8E.assign8E(iNo1, iNo2);     	
	}
}

class Siddhant8E
{
	public void assign8E(int iStart, int iEnd)
	{
		int iCnt=0;
		System.out.print("Output: ");
	    
	    for(iCnt=iEnd; iCnt>=iStart; iCnt--)
	    {
	    	System.out.print("\t"+iCnt);
	    }
	}
}
/*OUTPUT: 

Enter starting point: 23
Enter ending point: 35
Output: 35      34      33      32      31      30      29      28      27      26      25      24      23

Enter starting point: 10
Enter ending point: 18
Output: 18      17      16      15      14      13      12      11      10

Enter starting point: -10
Enter ending point: 2
Output: 2       1       0       -1      -2      -3      -4      -5      -6      -7      -8      -9      -10

Enter starting point: 90
Enter ending point: 18
Invalid Input
*/

