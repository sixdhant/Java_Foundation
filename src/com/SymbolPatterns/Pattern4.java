package com.SymbolPatterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OUTPUT: ");
		int n = 5; // size

		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
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