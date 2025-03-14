package com.CalculationProblems;

import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String args[]) {
		int iRow, iCol, i, j;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of iRows : ");
		iRow = in.nextInt();

		System.out.print("Enter the number  iColumns : ");
		iCol = in.nextInt();

		int mat1[][] = new int[iRow][iCol];
		int mat2[][] = new int[iRow][iCol];
		int result[][] = new int[iRow][iCol];

		System.out.println("Enter the elements of matrix1 :");

		for (i = 0; i < iRow; i++) {

			for (j = 0; j < iCol; j++)
				mat1[i][j] = in.nextInt();

		}
		System.out.println("Enter the elements of  matrix2 :");

		for (i = 0; i < iRow; i++) {

			for (j = 0; j < iCol; j++)
				mat2[i][j] = in.nextInt();

		}

		for (i = 0; i < iRow; i++)
			for (j = 0; j < iCol; j++)
				result[i][j] = mat1[i][j] - mat2[i][j];

		System.out.println("Subtract  of  two matrices:-");

		for (i = 0; i < iRow; i++) {
			for (j = 0; j < iCol; j++)
				System.out.print(result[i][j] + "\t");

			System.out.println();
		}

	}
}

/*OUTPUT: 

Enter the number of iRows : 3
Enter the number  iColumns : 3
Enter the elements of matrix1 :
1
2
3
4
5
6
7
8
9
Enter the elements of  matrix2 :
0
0
0
0
0
0
0
0
0
Subtract  of  two matrices:-
1	2	3	
4	5	6	
7	8	9	

*/