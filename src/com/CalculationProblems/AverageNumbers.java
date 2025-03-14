package com.CalculationProblems;

import java.util.Scanner;

public class AverageNumbers {

	public static void main(String args[]) 
	{
		int iNo;
		double iResult = 0;

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter how many numbers to cal Average : ");
		iNo = sobj.nextInt();

		int arr[] = new int[iNo];

		System.out.println("Enter " + iNo + " numbers : ");

		for (int i = 0; i < iNo; i++)
		{	
			arr[i] = sobj.nextInt();
		}
		for (int i = 0; i < iNo; i++)
		{
			iResult = iResult + arr[i];
		}
		System.out.println("Average = " + iResult / iNo);
	}
}
/*OUTPUT:

Enter how many numbers to cal Average : 6
Enter 6 numbers : 
1
2
3
4
5
6
Average =3.5
 */