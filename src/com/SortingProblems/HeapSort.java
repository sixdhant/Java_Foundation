package com.SortingProblems;

import java.util.Scanner;

public class HeapSort {

	public static void heapify(int arr[], int i, int n) 
	{
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int temp, largest;

		if (l < n && arr[l] > arr[i])
		{
			largest = l;
		}
		else
		{
			largest = i;
		}

		if (r < n && arr[r] > arr[largest])
		{
			largest = r;
		}

		if (largest != i) 
		{
			temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;

			heapify(arr, largest, n);
		}
	}

	public static void bheap(int a[]) 
	{
		for (int i = (a.length / 2) - 1; i >= 0; i--) 
		{
			heapify(a, i, a.length);
		}
	}

	public static void Sort(int arr[]) 
	{
		int temp = 0, j = 0, i = 0;
		bheap(arr);

		for (i = (arr.length) - 1; i > 0;) 
		{
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, 0, i--);
		}
	}

	public static void printarray(int arr[]) 
	{
		System.out.println();
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

		System.out.println("Elements after sorting : ");
		printarray(arr);
	}
}
/* OUTPUT:

Enter number of elements in the array : 6
Enter 6 elements : 
8
7
4
5
2
1
Elements in array : 
8 7 4 5 2 1 
Elements after sorting : 
1 2 4 5 7 8 
*/