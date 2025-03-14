/*************************************** ASSIGNMENT NO - 9A ***********************************
 
 STATEMENT: Accept number from user and display below pattern.
 
 INPUT :    Enter starting point: 6
 OUTPUT :   A       B       C       D       E       F
  
************************************************************************************************/
 
package Assignment_9;

import java.util.Scanner;

public class Assignment_9A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo = 0;

		System.out.print("Enter starting point: ");
		iNo = Sobj.nextInt();

		Siddhant9A.assign9A(iNo);       	
	}
}

class Siddhant9A
{
	public static void assign9A(int iStart)
	{
		int iCnt = 0;
		char ch = 'A';

		System.out.print("Output: ");
		for (iCnt = 1; iCnt <= iStart; iCnt++) 
		{
			System.out.print("\t" + ch);
			ch++;
		}
	}
}
/*OUTPUT: 

Enter starting point: 6
Output: 	A	B	C	D	E	F

Enter starting point: 10
Output: 	A	B	C	D	E	F	G	H	I	J
*/

