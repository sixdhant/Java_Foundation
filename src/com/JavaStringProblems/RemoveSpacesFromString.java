package com.JavaStringProblems;

import java.util.StringTokenizer;

public class RemoveSpacesFromString {

	public static void main(String[] args) 
	{
		String str = "I Am Siddhant Suryakant Deshmukh";
		StringTokenizer stoken = new StringTokenizer(str," ");
	
		StringBuffer sbuff = new StringBuffer();
		while (stoken.hasMoreElements()) 
		{
			sbuff.append(stoken.nextElement()).append(" ");
		}
		System.out.println(sbuff.toString().trim());
	}
}
