package com.JavaStringProblems;

public class ReverseStringWihtoutAPI {

	public static void main(String[] args) 
	{
		reverseString("I Am Siddhant Suryakant Deshmukh");
		reverseString("Hello What's up!!");
		reverseString("1 22 333 4444 55555");
	}

	static void reverseString(String instr) 
	{
		char[] input = instr.toCharArray();
		char[] result = new char[input.length];
		int j = result.length - 1;
		for (int i = 0; i < input.length; i++) 
		{
			result[j] = input[i];
			j--;
		}
		System.out.println(instr + " ---> " + String.valueOf(result));
	}
}

/* OUTPUT:

I Am Siddhant Suryakant Deshmukh ---> hkumhseD tnakayruS tnahddiS mA I
Hello What's up!! ---> !!pu s'tahW olleH
1 22 333 4444 55555 ---> 55555 4444 333 22 1
*/