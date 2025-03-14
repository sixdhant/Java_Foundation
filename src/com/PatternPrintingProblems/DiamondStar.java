package com.PatternPrintingProblems;

import java.util.Scanner;

public class DiamondStar {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sobj.nextInt();
		
		System.out.print("Enter Symbol : ");
		char c = sobj.next().charAt(0);

		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= n - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) 
		{
			for (int j = 1; j <= n - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
/* OUTPUT:

Enter Number : 6
Enter Symbol : *
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *


Enter Number : 12
Enter Symbol : #
           #
          ###
         #####
        #######
       #########
      ###########
     #############
    ###############
   #################
  ###################
 #####################
#######################
 #####################
  ###################
   #################
    ###############
     #############
      ###########
       #########
        #######
         #####
          ###
           #

*/