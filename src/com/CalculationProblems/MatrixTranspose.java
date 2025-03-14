package com.CalculationProblems;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String args[]) 
	{
		int iRow, iCol, i, j, iTemp, iNum;
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter the number of iRows : ");
		iRow = sobj.nextInt();

		System.out.print("Enter the number  iColumns : ");
		iCol = sobj.nextInt();
		
		if (iRow > iCol) 
		{
			iNum = iRow;
		} 
		else 
		{
			iNum = iCol;
		}
		int mat1[][] = new int[iNum][iNum];

		System.out.println("Enter the elements of matrix");

		for (i = 0; i < iRow; i++) 
		{
			for (j = 0; j < iCol; j++) {
				mat1[i][j] = sobj.nextInt();
			}
		}

		System.out.println("\n\nOriginal   matrix:-");
		for (i = 0; i < iRow; i++) 
		{
			for (j = 0; j < iCol; j++) 
			{
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}

		for (i = 0; i < iNum; i++) 
		{
			for (j = i + 1; j < iNum; j++) 
			{
				iTemp = mat1[i][j];
				mat1[i][j] = mat1[j][i];
				mat1[j][i] = iTemp;
			}

			System.out.println("Transpose  of   matrix:-");
			for (i = 0; i < iCol; i++) 
			{
				for (j = 0; j < iRow; j++) 
				{
					System.out.print(mat1[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
/*OUTPUT:

Enter the number of iRows : 2
Enter the number  iColumns : 3
Enter the elements of matrix
1
5
6
4
2
3


Original   matrix:-
1 5 6 
4 2 3 
Transpose  of   matrix:-
1 4 
5 2 
6 0 


*/