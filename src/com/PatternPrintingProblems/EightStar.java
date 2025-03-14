package com.PatternPrintingProblems;

import java.util.Scanner;

public class EightStar {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int iNo = sobj.nextInt();
		
		System.out.print("Enter Symbol : ");
		char c = sobj.next().charAt(0);

		int k = iNo * 2 - 1;

		for (int i = 1; i <= k; i++) 
		{
			if (i == 1 || i == iNo || i == k)
			{
				for (int j = 1; j <= iNo; j++)
				{
					if (j == 1 || j == iNo)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(c);
					}
				}
			}
			else
			{
				for (int j = 1; j <= iNo; j++)
				{
					if (j == 1 || j == iNo)
					{
						System.out.print(c);
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
/* OUTPUT: 

Enter Number : 6
Enter Symbol : #
 #### 
#    #
#    #
#    #
#    #
 #### 
#    #
#    #
#    #
#    #
 #### 

Enter Number : 4
Enter Symbol : *
 ** 
*  *
*  *
 ** 
*  *
*  *
 ** 

*/