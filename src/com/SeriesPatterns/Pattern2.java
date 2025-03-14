/*
 
If a sequence of values follows a pattern of multiplying a 
fixed amount times each term to arrive at the following term,
it is referred to as a  geometric sequence.
The number multiplied each time is constant and  is called 
as the common ratio, r.
e.g. 
		2, 6, 18, 54, ...
*/
package com.SeriesPatterns;

public class Pattern2 {

	public static void main(String args[])
	 {
	  int iLimit = 5; // limit
	  int iRatio = 2; //common ratio
	  int iTerms = 5; // terms
	  int iSum  = 0; // sum of the series
	  System.out.print("Geometric Series Output : ");              	  
	  for(int i=1;i<=iLimit;i++)
	  {
		  System.out.print("  "+iTerms);    
		  iTerms = iTerms * iRatio; // multiplying diff. with term
	  }
	 }
}

/* OUTPUT: 

Geometric Series Output :   5  10  20  40  80

*/
