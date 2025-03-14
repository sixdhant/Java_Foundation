/**************************************** ASSIGNMENT NO - 36C ***************************************
 
 STATEMENT: Write Java program which accept number of rows and number of columns from user
  			and display below pattern.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_36;

import java.util.Scanner;

public class Assignment_36C {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		int iRow = 0, iCol = 0;

		System.out.print("Enter Row Size: ");
		iRow = sobj.nextInt();

		System.out.print("Enter Colunm Size: ");
		iCol = sobj.nextInt();

		Siddhant36C sid36C = new Siddhant36C();
		sid36C.assign36C(iRow, iCol);

	}
}

class Siddhant36C {
	public void assign36C(int iRow, int iCol) {

		int i = 0, j = 0;
		char ch = 'A';
		System.out.println("Output : ");
		for (i = 1; i <= iRow; i++) {
			for (j = 1; j <= iCol; j++) {
				System.out.print(ch);
				System.out.print("\t");

			}
			ch++;
			System.out.println();
		}
	}
}

/*  OUTPUT:

Enter Row Size: 4
Enter Colunm Size: 4
Output : 
A	A	A	A	
B	B	B	B	
C	C	C	C	
D	D	D	D		
 */
