package com.CalculationProblems;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String arg[]) 
	{
		int iNo, iSum = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter how many numbers you want sum : ");
		iNo = sobj.nextInt();
		
		int a[] = new int[iNo];
		
		System.out.println("Enter the " + iNo + " numbers :");
		for (int i = 0; i < iNo; i++) 
		{
			System.out.println("Enter  number " + (i + 1) + ":");
			a[i] = sobj.nextInt();
		}
		for (int i = 0; i < iNo; i++) 
		{
			iSum += a[i];
		}
		System.out.println("Sum of " + iNo + " numbers is =" + iSum);
	}
}
/*OUTPUT:

Enter how many numbers you want sum : 5
Enter the 5 numbers :
Enter  number 1:
100
Enter  number 2:
100
Enter  number 3:
100
Enter  number 4:
100
Enter  number 5:
100
Sum of 5 numbers is =500
*/
