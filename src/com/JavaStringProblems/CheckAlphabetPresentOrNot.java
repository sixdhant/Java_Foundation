package com.JavaStringProblems;

import java.util.Scanner;

public class CheckAlphabetPresentOrNot {
	
	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str;
		boolean bRet = false;

		System.out.print("Enter String: ");
		str = sobj.nextLine();

		System.out.print("Enter Character to search: ");
		char cChar = sobj.next().charAt(0);   
		
		Alphabet pobj = new Alphabet();
		bRet = pobj.Check(str, cChar);
		
		if(bRet == true)
		{
			System.out.println(""+ cChar + " Characters found in given string.");
		}
		else
		{
			System.out.println(""+ cChar + " Characters not found in given string.");
		}
	}
}
class Alphabet {
	public boolean Check(String str, char chara) 
	{
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)== chara)
			{	
				return true;
			}
		}		
		return false;	
	}
}

/*OUTPUT: 

Enter String: siddhant deshmukh
Enter Character to search: k
k Characters found in given string.

Enter String: siddhant deshmukh
Enter Character to search: x
x Characters not found in given string.
*/
