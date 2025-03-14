/*
 *  
If a sequence of values follows a pattern of adding a fixed 
amount from one term to the next, it is referred to as an  
arithmetic sequence.
The number added to each term is constant is called as the 
common difference, d.

e.g.

1, 4, 7, 10, 13, 16, ...

*/
package com.SeriesPatterns;

public class Pattern1 {

	public static void main(String args[]) {
		int iLimit = 5;  // limit
		int iComDiff = 3;   //common difference
		int iTerms = 2; // terms
		System.out.print("Arithmetic Series Output : ");
		for (int i = 1; i <= iLimit; i++) 
		{
			System.out.print("  " + iTerms);
			iTerms = iTerms + iComDiff; 
		}
	}
}

/* OUTPUT: 

Arithmetic Series Output :   2  5  8  11  14

*/