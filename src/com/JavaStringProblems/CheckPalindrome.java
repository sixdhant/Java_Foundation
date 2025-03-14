package com.JavaStringProblems;

import java.util.Scanner;

public class CheckPalindrome 
{
	public static void main(String[] args) 
	{

		String str;
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter a string : ");
		str = sobj.nextLine();

		StringDemo pobj = new StringDemo();
		pobj.palindro(str);
	}
}
class StringDemo 
{
	public void palindro(String str) 
	{
		String reverseStr = "";
		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) 
		{
			reverseStr = reverseStr + str.charAt(i);
		}
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) 
		{
			System.out.println("\n'" + str + "' is a Palindrome String.");
		} 
		else 
		{
			System.out.println("\n'" + str + "' is not a Palindrome String.");
		}
	}
}

/* OUTPUT :

Enter a string : radar
'radar' is a Palindrome String.

Enter a string : siddhant
'siddhant' is not a Palindrome String.

Enter a string : level
'level' is a Palindrome String.

*/
