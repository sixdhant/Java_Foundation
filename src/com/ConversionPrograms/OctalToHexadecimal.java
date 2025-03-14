package com.ConversionPrograms;

import java.util.Scanner;

public class OctalToHexadecimal {

	public static void main(String arg[]) 
	{
		int iOct, iDec = 0, i = 0, temp = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Octal Number : ");
		iOct = sobj.nextInt();

		while (iOct != 0) 
		{
			iDec = iDec + (iOct % 10) * (int) Math.pow(8, i);
			i++;
			iOct = iOct / 10;
		}

		String hex = iHexiDecimal(iDec);
		System.out.println("iHexiDecimal number is :" + hex);
	}

	static String iHexiDecimal(int iDec) 
	{
		char arr[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int rem;
		String iHexiDec = "";
		while (iDec != 0) 
		{
			rem = iDec % 16;
			iHexiDec = arr[rem] + iHexiDec;
			iDec = iDec / 16;
		}
		return iHexiDec;
	}
}
/* OUTPUT:

Enter Octal Number : 10
iHexiDecimal number is :8
*/