package com.JavaStringProblems;

import java.util.*;

public class CheckVowels {
	public static void main(String[] args) 
	{
		String str = "This is really simple sentence";
		Stringvowel pobj = new Stringvowel();
		pobj.vowel(str);
	}
}

class Stringvowel {
	public void vowel(String str) 
	{
		str = str.toLowerCase();
		char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };
		Set unique = new HashSet();

		for (int i = 0; i < str.length(); i++) 
		{
			for (int k = 0; k < vowels.length; k++) 
			{
				if (str.charAt(i) == vowels[k]) 
				{
					unique.add(str.charAt(i));
				}
			}
		}
		System.out.print("Vowels: " + unique);
	}
}


/*OUTPUT: 
 
 Vowels: [a, e, i]
 
*/
