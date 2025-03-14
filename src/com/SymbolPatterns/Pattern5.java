package com.SymbolPatterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OUTPUT: ");
		int n = 5; // size

		for (int i = n; i >= 1; i--) {
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

		*****
		 ****
		  ***
		   **
		    *

*/
