package com.ConversionPrograms;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String args[]) 
	{
		char ch[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int iRem, iNum;
		String hexadecimal = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal iNumber: ");
		iNum = sc.nextInt();
		System.out.print("Hexadecimal iNumber is : ");
		while (iNum != 0) {
			iRem = iNum % 16;
			hexadecimal = ch[iRem] + hexadecimal;
			iNum = iNum / 16;
		}
		System.out.print(hexadecimal);
	}
}
/* OUTPUT:

Enter a Decimal iNumber: 182
Hexadecimal iNumber is : B6
*/