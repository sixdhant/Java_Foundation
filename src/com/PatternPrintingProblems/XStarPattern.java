package com.PatternPrintingProblems;

import java.util.Scanner;

public class XStarPattern {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int iNo = sobj.nextInt();

		System.out.print("Enter Symbol : ");
		char c = sobj.next().charAt(0);
		System.out.println("Output :");
		
		int k = iNo * 2 - 1;

		for (int i = 1; i <= k; i++) {

			for (int j = 1; j <= k; j++)

			{
				if (j == i || j == k - i + 1)
					System.out.print(c);
				System.out.print(" ");

			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

Enter Number : 8
Enter Symbol : *
Output :
*              * 
 *            *  
  *          *   
   *        *    
    *      *     
     *    *      
      *  *       
       *        
      *  *       
     *    *      
    *      *     
   *        *    
  *          *   
 *            *  
*              * 

*/