package com.JavaStringProblems;

import java.util.HashSet;
import java.util.Set;

public class ReverseOneCharacterOnce {

	public static void main(String[] args) 
	{
		String input = "SiddhantSuryakantDeshmukh";
		reverseWithOneCharacterOnce(input);
	}
	
	private static void reverseWithOneCharacterOnce(String input) 
	{
		Set<Character> printedChar = new HashSet<Character>();
		String reversed = " ";
		for (int index = input.length() - 1; index >= 0; index--) 
		{
			Character ch = input.charAt(index);
			if (!printedChar.contains(ch)) 
			{
				printedChar.add(ch);
				reversed = reversed + ch;
			}
		}
		System.out.println(reversed);
	}
}

/* OUTPUT:

SiddhantSuryakantDeshmukh
hkumseDtnayrSdi
*/