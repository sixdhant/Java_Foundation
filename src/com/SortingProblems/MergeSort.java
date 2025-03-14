package com.SortingProblems;

import java.util.Scanner;

public class MergeSort {

	public static void merge(int brr[], int l, int m, int h) 
	{
		int i, j, c = l;
		int mrr[] = new int[h + 1];

		for (i = l, j = m + 1; i <= m && j <= h; c++) 
		{
			if (brr[i] <= brr[j])
			{
				mrr[c] = brr[i++];
			}
			else
			{
				mrr[c] = brr[j++];
			}
		}
		while (i <= m)
		{
			mrr[c++] = brr[i++];
		}
		while (j <= h)
		{
			mrr[c++] = brr[j++];
		}

		for (i = l; i <= h; i++)
		{
			brr[i] = mrr[i];
		}
	}

	public static void Sort(int brr[], int l, int h) 
	{
		if (l < h) 
		{
			int m = (l + h) / 2;
			Sort(brr, l, m);
			Sort(brr, m + 1, h);
			merge(brr, l, m, h);
		}
	}

	public static void printarray(int brr[]) 
	{
		for (int i = 0; i < brr.length; i++) 
		{

			System.out.print(brr[i] + "  ");
		}
	}

	public static void main(String[] args) 
	{
		int iSize= 0, i = 0;
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter number of elements in the array: ");
		iSize = sobj.nextInt();
		
		int arr[] = new int[iSize];
		System.out.println("Enter " + iSize + " elements : ");
		for (i = 0; i < iSize; i++) 
		{
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

Enter number of elements in the array: 5
Enter 5 elements : 
12
4
0
5
3
Elements in array : 
12  4  0  5  3  
Elements after sorting : 
0  3  4  5  12  
*/