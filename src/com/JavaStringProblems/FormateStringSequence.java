package com.JavaStringProblems;

public class FormateStringSequence {
	
	public static void main(String[] args) 
	{
		String input = "Microsoft";
		String replace = "Apple";
		StringFormate sobj = new StringFormate();
		sobj.formate(input, replace);
	}
}

class StringFormate {
	public void formate(String input, String replace) 
	{
		String temp = " ";
		int j = 0;

		for (int i = 0; i <= input.length(); i++) 
		{
			temp = temp + input.charAt(i) + replace.charAt(j);
			j++;
			if (j == 5) 
			{
				for (int k = i; k < input.length(); k++) 
				{
					temp = temp + input.charAt(k);
				}
				System.out.println("Output String: " + temp);
				break;
			}
		}
	}
}

/*OUTPUT:

Output String:  MAipcprloeosoft

*/