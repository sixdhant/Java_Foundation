package com.SortingProblems;

import java.util.Scanner;

public class QuickSort {

	public static int partition(int arr[], int l, int h) 
	{
		int i = l + 1, j = h, c = l, temp;

		for (; i <= j;) 
		{
			while (i <= h && arr[i] < arr[c])
			{
				i++;
			}
			while (arr[j] > arr[c] && j > l)
			{
				j--;
			}

			if (i < j) 
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			} 
			else
			{
				break;
			}
		}
		temp = arr[c];
		arr[c] = arr[j];
		arr[j] = temp;
		return j;
	}

	public static void Sort(int a[], int l, int h) 
	{
		if (l < h) 
		{
			int m = partition(a, l, h);
			Sort(a, l, m - 1);
			Sort(a, m + 1, h);
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
		Sort(arr, 0, iSize - 1);

		System.out.println("\nElements after sorting : ");
		printarray(arr);
	}
}
/* OUTPUT:

Enter number of elements in the array : 6
Enter 6 elements : 
12
0
-2
54
-1
-10
Elements in array : 
12 0 -2 54 -1 -10 
Elements after sorting : 
-10 -2 -1 0 12 54 
*/