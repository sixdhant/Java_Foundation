/*********************************** ASSIGNMENT NO - 8A ***********************************************
 
 STATEMENT: Write a program which accept range from user and display all numbers in between that range.
 
 INPUT :    24,35
 OUTPUT :   24      25      26      27      28      29      30      31      32      33      34      35
  
*******************************************************************************************************/
package Assignment_8;

import java.util.Scanner;

public class Assignment_8A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;

		System.out.print("Enter starting point: ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter ending point: ");
		iNo2 = Sobj.nextInt();

		Siddhant8A.assign8A(iNo1, iNo2);
	}
}

class Siddhant8A {
	public static void assign8A(int iStart, int iEnd) {
		int iCnt = 0;
		if (iStart < 0) {
			iStart = -iStart;
		}
		if (iEnd < 0) {
			iEnd = -iEnd;
		}
		System.out.print("Output: ");
		for (iCnt = iStart; iCnt <= iEnd; iCnt++) {
			System.out.print("\t " + iCnt);
		}
	}
}
/*
 * OUTPUT:
 * 
 * Enter starting point: 24 Enter ending point: 35 Output: 24 25 26 27 28 29 30
 * 31 32 33 34 35
 */
