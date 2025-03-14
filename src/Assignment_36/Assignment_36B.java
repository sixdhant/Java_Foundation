/**************************************** ASSIGNMENT NO - 36B ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_36;

import java.util.Scanner;

public class Assignment_36B {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter Row Size: ");
		int iRow = sobj.nextInt();

		System.out.print("Enter Colunm Size: ");
		int iCol = sobj.nextInt();

		Siddhant36B.assign36B(iRow, iCol);

	}
}

class Siddhant36B {
	public static void assign36B(int iRow, int iCol) {

		int i = 0, j = 0;
		char ch = 'A', cVal = 'a';
		if (iRow != iCol) {
			return;
		}
		System.out.println("Output : ");
		for (i = 1, ch = 'A', cVal = 'a'; i <= iRow; i++, ch++, cVal++) {
			for (j = 1, ch = 'A', cVal = 'a'; j <= iCol; j++, ch++, cVal++) {
				if (i % 2 != 0) {
					System.out.print(ch);
					System.out.print("\t");
				} else {
					System.out.print(cVal);
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}

/*
 * OUTPUT:
 * 
 * Enter Row Size: 4 Enter Colunm Size: 4 Output : A B C D a b c d A B C D a b c
 * d
 */
