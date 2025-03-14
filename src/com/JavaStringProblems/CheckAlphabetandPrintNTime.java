package com.JavaStringProblems;

import java.util.Scanner;


public class CheckAlphabetandPrintNTime {
	
	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str;

		System.out.print("Enter String: ");
		str = sobj.nextLine();

		System.out.print("Enter Character to search: ");
		char cChar = sobj.next().charAt(0);   
		
		Alphabet2 pobj = new Alphabet2();
		pobj.Check2(str, cChar);
	}
}
class Alphabet2 {
	public void Check2(String str, char chara) 
	{
		System.out.print("The charater "+chara+" in the given string printed: ");
		
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) == chara)
			{	
				System.out.print("\t"+str.charAt(i));
			}
		}
	}
}

/*OUTPUT:

Enter String: siddhant deshmukh
Enter Character to search: d
The charater d in the given string printed: 	d	d	d
*/