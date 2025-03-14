package com.JavaStringProblems;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		String str;

		System.out.print("Enter String: ");
		str = sobj.nextLine();
		System.out.println("\nString is : " + str);

		StringRever pobj = new StringRever();
		String s = pobj.ReverseX(str);

		System.out.println("Reverse string is : " + s);
	}
}

class StringRever 
{
	public String ReverseX(String str)
	{
		char Arr[] = str.toCharArray();
		int iStart = 0, iEnd = Arr.length-1;
		char temp;
		while(iStart < iEnd)
		{
			temp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = temp;
			iStart++;
			iEnd--;
		}		
		return new String(Arr);
	}
}

/*OUTPUT:

Enter String: Siddhant Deshmukh
String is : Siddhant Deshmukh
Reverse string is : hkumhseD tnahddiS 


Enter String: Welcome to the LA Esfera organization
String is : Welcome to the LA Esfera organization
Reverse string is : noitazinagro arefsE AL eht ot emocleW

*/