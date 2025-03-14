package com.SortingProblems;

import java.util.Scanner;

public class BubblSort {

	public static void Sort(int arr[]) {
		int n = arr.length, i = 0, j = 0, p = 0, temp = 0;
		for (i = 0; i < n - 1; i++) 
		{
			for (j = 0; j < n - i - 1; j++) 
			{
				if (arr[j + 1] < arr[j]) 
				{
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void printarray(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
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

Enter number of elements in the array : 5
Enter 5 elements : 
5
4
3
2
1
Elements in array : 
5 4 3 2 1 
Elements after sorting : 
1 2 3 4 5 
*/