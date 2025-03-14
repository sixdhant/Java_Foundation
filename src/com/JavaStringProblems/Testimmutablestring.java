package com.JavaStringProblems;

public class Testimmutablestring {

	public static void main(String[] args) {
		
		String str="Sachin";
		str.concat(" Tendulkar");
		System.out.println("Given String: "+str);
		System.out.println("\nOutput after concat method: " +str.concat(" Tendulkar"));
	}
}

/* OUTPUT:

Given String: Sachin
Output after concat method: Sachin Tendulkar
*/