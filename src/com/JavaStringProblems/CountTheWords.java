package com.JavaStringProblems;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) 
	{	
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str =sobj.nextLine();
		
		String[] words = str.trim().split(" ");
		System.out.println("Number of words in the string = "+words.length);
	}
}

/* OUTPUT:

Enter the string : siddhant suryakant deshmukh
Number of words in the string = 3
*/