package com.JavaStringProblems;

import java.util.Scanner;

public class CheckPalindrome1 {

	public static void main(String[] args) 
	{
		String str = "Hi my name is nitin and i cant speack malayalam";
		StringPlindro pobj = new StringPlindro();
		pobj.palindro(str);
	}
}

class StringPlindro {
	public void palindro(String sentence) 
	{
		String[] array = sentence.split(" ");
		System.out.println("Palindrome word from given Sentence is: ");

		for (int i = 0; i < array.length; i++) 
		{
			String original = array[i];
			String reverseStr = "";
			
			for (int j = original.length() - 1; j >= 0; j--) 
			{
				reverseStr = reverseStr + original.charAt(j);
			}
			if (original.equalsIgnoreCase(reverseStr)) 
			{
				System.out.println(original);
			}
		}
	}
}

/* OUTPUT:
 
Palindrome word from given Sentence is: 
nitin
i
malayalam
 
*/

