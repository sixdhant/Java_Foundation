package com.JavaStringProblems;

import java.util.Scanner;

public class CheckAlphabetandPrintRestPart {
	

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str;

		System.out.print("Enter String: ");
		str = sobj.nextLine();

		System.out.print("Enter Character to search: ");
		char cChar = sobj.next().charAt(0);   
		
		Alphabet3 pobj = new Alphabet3();
		pobj.Check3(str, cChar);
	}
}
class Alphabet3 
{
	public void Check3(String str, char chara) 
	{
		System.out.print("The remaining unmatched string is: ");
		
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) != chara)
			{	
				System.out.print(str.charAt(i));
			}
		}
	}
}

/*OUTPUT:

Enter String: sidhhant deshmukh
Enter Character to search: d
The remaining unmatched string is: sihhant eshmukh
*/