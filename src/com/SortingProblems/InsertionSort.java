package com.SortingProblems;

import java.util.Scanner;

public class InsertionSort {

	public static void Sort(int arr[]) 
	{
		int n = arr.length, i = 0, j = 0, p = 0, temp = 0;
		for (i = 1; i < n; i++) 
		{
			for (j = i - 1; j >= 0 && arr[j + 1] < arr[j]; j--) 
			{
				temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
	}

	public static void printarray(int a[]) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) 
	{
		int iSize = 0, i = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter number of elements in the array : ");
		iSize = sobj.nextInt();

		int arr[] = new int[iSize];
		System.out.println("Enter " + iSize + " elements : ");
		for (i = 0; i < iSize; i++) {
			arr[i] = sobj.nextInt();
		}

		System.out.println("Elements in array : ");
		printarray(arr);
		Sort(arr);

		System.out.println("\nElements after sorting : ");
		printarray(arr);
	}
}
/* OUTPUT:

Enter number of elements in the array : 6
Enter 6 elements : 
8
7
0
5
6
4
Elements in array : 
8 7 0 5 6 4 
Elements after sorting : 
0 4 5 6 7 8 
*/