package com.ConversionPrograms;

import java.util.Scanner;

public class DecimalToOctal {

	static int i = 1;
	public static void main(String args[]) 
	{
		int iDecimal, q, j = 1;
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter a Decimal number: ");
		iDecimal = sobj.nextInt();
		
		System.out.print("Oct number is : ");
		int[] oct = octal(iDecimal);
		for (int iCnt = i - 1; iCnt > 0; iCnt--) 
		{
			System.out.print(oct[iCnt]);
		}
	}

	static int[] octal(int iDecimal) 
	{
		int arr[] = new int[50];
		while (iDecimal != 0) 
		{
			arr[i++] = iDecimal % 8;
			iDecimal = iDecimal / 8;
		}
		return arr;
	}
}
/* OUTPUT:

Enter a Decimal number: 52
Oct number is : 64
*/