package com.PatternPrintingProblems;

import java.util.Scanner;

public class HollowMirroredRhombus {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int iNo = sobj.nextInt();
		System.out.print("Enter Symbol : ");

		char c = sobj.next().charAt(0);

		System.out.println("Output :");
		for (int i = 1; i <= iNo; i++) 
		{
			for (int j = i; j > 0; j--)
			{
				System.out.print(" ");
			}
			if (i == 1 || i == iNo)
			{
				for (int j = 1; j <= iNo; j++)
				{
					System.out.print(c);
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
Enter Symbol : *
 ******
  *    *
   *    *
    *    *
     *    *
      ******

Enter Number : 12
Enter Symbol : #
 ############
  #          #
   #          #
    #          #
     #          #
      #          #
       #          #
        #          #
         #          #
          #          #
           #          #
            ############
     
*/