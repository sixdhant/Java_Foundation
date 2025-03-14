package com.ConversionPrograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String arg[]) 
	{
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter a decimal number : ");
		int iNo = sobj.nextInt();

		int bin[] = new int[100];
		int i = 0;
		while (iNo > 0) 
		{
			bin[i++] = iNo % 2;
			iNo = iNo / 2;
		}
		System.out.print("Binary number is : ");
		for (int j = i - 1; j >= 0; j--) 
		{
			System.out.print(bin[j]);
		}
	}
}
/* OUTPUT:

Enter a decimal number : 4
Binary number is : 100
*/