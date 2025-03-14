package com.JavaStringProblems;

public class RemoveNonASCIIString {

	public static void main(String[] args) 
	{	
		String str = "Instance¡of¥java";
		System.out.println(str);
		str = str.replaceAll("[^\\p{ASCII}]", "");
		System.out.println("After removing non ASCII chars: "+str);
	}
}

/* OUTPUT:

Instance¡of¥java
After removing non ASCII chars: Instanceofjava
*/