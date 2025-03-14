package com.JavaStringProblems;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] arg) {
		int i = 0;
		
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sobj.next().charAt(0);
		
		switch (ch) 
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				i++;
		}
		if (i == 1)
		{
			System.out.println("Entered character " + ch + " is  Vowel");
		}
		else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			System.out.println("Entered character " + ch + " is Consonent");
		}
		else
		{
			System.out.println("Not an alphabet");
		}
	}
}
/*OUTPUT: 

Enter a character : a
Entered character a is  Vowel

Enter a character : z
Entered character z is Consonent
*/