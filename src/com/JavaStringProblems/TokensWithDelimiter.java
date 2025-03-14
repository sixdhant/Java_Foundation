package com.JavaStringProblems;

import java.util.StringTokenizer;

public class TokensWithDelimiter {
	
	public static void main(String a[])
	{
		String str = "http://10.123.43.67:80/";
		StringTokenizer strToken = new StringTokenizer(str,"://.",true);
		while(strToken.hasMoreTokens())
		{
			System.out.println(strToken.nextToken());
		}
		System.out.println("\nReplaced String is: "+str.replaceAll("[://./]"," "));
	} 
}

/* OUTPUT:
 
http
:
/
/
10
.
123
.
43
.
67
:
80
/

Replaced String is: http   10 123 43 67 80 


*/