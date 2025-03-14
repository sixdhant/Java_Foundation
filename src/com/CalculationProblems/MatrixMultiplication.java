package com.CalculationProblems;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String args[]) 
	{
		int iRow1, iRow2, iCol1, iCol2, i, j, k, iSum;
		
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter the number of rows of matrix 1 : ");
		iRow1 = sobj.nextInt();

		System.out.print("Enter the number of columns of matrix 1 : ");
		iCol1 = sobj.nextInt();
		
		System.out.print("Enter the number of rows of matrix 2 : ");
		iRow2 = sobj.nextInt();

		System.out.print("Enter the number of columns of matrix 2 : ");
		iCol2 = sobj.nextInt();

		if (iCol1 == iRow2) 
		{
			int mat1[][] = new int[iRow1][iCol1];
			int mat2[][] = new int[iRow2][iCol2];
			int res[][] = new int[iRow1][iCol2];

			System.out.println("Enter the elements of matrix1 :");
			for (i = 0; i < iRow1; i++) 
			{

				for (j = 0; j < iCol1; j++)
				{
					mat1[i][j] = sobj.nextInt();
				}
			}
			System.out.println("Enter the elements of matrix2 :");

			for (i = 0; i < iRow2; i++) 
			{
				for (j = 0; j < iCol2; j++)
				{
					mat2[i][j] = sobj.nextInt();
				}
			}
			System.out.println("\n\nOutput matrix:-");
			
			for (i = 0; i < iRow1; i++)
			{
				for (j = 0; j < iCol2; j++) 
				{
					iSum = 0;
					for (k = 0; k < iRow2; k++) 
					{
						iSum += mat1[i][k] * mat2[k][j];

					}
					res[i][j] = iSum;
				}
			}
			for (i = 0; i < iRow1; i++) 
			{
				for (j = 0; j < iCol2; j++)
				{
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
			}
		} 
		else
		{
			System.out.print("Multipication does not exist ");
		}
	}
}
/*OUTPUT:

Enter the number of rows of matrix 1 : 3
Enter the number of columns of matrix 1 : 3
Enter the number of rows of matrix 2 : 3
Enter the number of columns of matrix 2 : 3
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
Enter the elements of matrix2 :
9
8
7
6
5
4
3
2
1


Output matrix:-
30 24 18 
84 69 54 
138 114 90 


*/