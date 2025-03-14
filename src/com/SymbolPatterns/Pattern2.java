package com.SymbolPatterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OUTPUT: ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

		*
		**
		***
		****
		*****
*/
