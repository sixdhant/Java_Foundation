package com.JavaStringProblems;

import java.util.Arrays;

public class SortStringAPI {

	public static void main(String[] args) 
	{
		String original = "SiddhantSuryakantDeshmukh";
		char[] chars = original.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println(sorted);
	}
}

/* OUTPUT:

SiddhantSuryakantDeshmukh
DSSaaaddehhhikkmnnrsttuuy
*/