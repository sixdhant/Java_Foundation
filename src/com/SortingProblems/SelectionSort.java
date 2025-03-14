package com.SortingProblems;

import java.util.Scanner;

public class SelectionSort {

	public static void Sort(int arr[])
	{
		int n = arr.length, i = 0, j = 0, p = 0, temp = 0;

		for (i = 0; i < n - 1; i++) 
		{
			p = i;
			for (j = i + 1; j < n; j++) 
			{
				if (arr[p] > arr[j])
					p = j;
			}
			temp = arr[p];
			arr[p] = arr[i];
			arr[i] = temp;
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
		for (i = 0; i < iSize; i++) 
		{
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
9
0
1
23
99
5
Elements in array : 
9 0 1 23 99 5 
Elements after sorting : 
0 1 5 9 23 99  
*/
