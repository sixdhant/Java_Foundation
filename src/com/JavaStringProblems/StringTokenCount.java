package com.JavaStringProblems;

import java.util.StringTokenizer;

public class StringTokenCount {

	public static void main(String[] args) 
	{		
		String str = "Siddhant Suryakant Deshmukh";
		System.out.println(str);
		StringTokenizer strToken = new StringTokenizer(str," ");
		System.out.println("Count: "+strToken.countTokens());
	}
}

/* OUTPUT:

Siddhant Suryakant Deshmukh
Count: 3
*/