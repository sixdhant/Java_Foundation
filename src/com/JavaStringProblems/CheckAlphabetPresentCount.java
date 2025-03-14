package com.JavaStringProblems;

import java.util.Scanner;

public class CheckAlphabetPresentCount {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str;
		int iValue = 0;

		System.out.print("Enter String: ");
		str = sobj.nextLine();

		System.out.print("Enter Character to search: ");
		char cChar = sobj.next().charAt(0);

		Alphabet1 pobj = new Alphabet1();
		iValue = pobj.Check1(str, cChar);

		System.out.println("The character " + cChar + " found in string " + iValue + " times.");
	}
}

class Alphabet1 {
	public int Check1(String str, char chara) {
		int iValue = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == chara) 
			{
				iValue++;
			}
		}
		return iValue;
	}
}

/*OUTPUT:

Enter String: siddhant deshmukh
Enter Character to search: d
The character d found in string 3 times 

Enter String: siddhant deshmukh
Enter Character to search: s
The character s found in string 2 times.

Enter String: siddhant deshmukh
Enter Character to search: x
The character x found in string 0 times.
*/