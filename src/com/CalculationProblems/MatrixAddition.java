package com.CalculationProblems;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		
		int iRow, iCol, i, j;
		
		System.out.print("Enter the number of rows :");
		iRow = in.nextInt();

		System.out.print("Enter the number columns :");
		iCol = in.nextInt();

		int mat1[][] = new int[iRow][iCol];
		int mat2[][] = new int[iRow][iCol];
		int result[][] = new int[iRow][iCol];

		System.out.println("Enter the elements of matrix1 :");

		for (i = 0; i < iRow; i++) 
		{
			for (j = 0; j < iCol; j++)
			{
				mat1[i][j] = in.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter the elements of matrix2 :");

		for (i = 0; i < iRow; i++) 
		{
			for (j = 0; j < iCol; j++)
			{
				mat2[i][j] = in.nextInt();
			}
			System.out.println();
		}

		for (i = 0; i < iRow; i++)
		{
			for (j = 0; j < iCol; j++)
			{
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
		}

		System.out.println("Sum of matrices:-");

		for (i = 0; i < iRow; i++) 
		{
			for (j = 0; j < iCol; j++)
			{
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
/*OUTPUT: 

Enter the number of rows :2
Enter the number columns :2
Enter the elements of matrix1
1
1

1
1

Enter the elements of matrix2
2
2

2
2

Sum of matrices:-
3	3	
3	3	
*/