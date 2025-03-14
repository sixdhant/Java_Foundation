package com.CalculationProblems;

import java.util.Scanner;

/* HCF or Highest Common Factor is the greatest common divisor between two or more given numbers.
	
	Let there be two arbitrary numbers such as 75 and 90.	
	75 = 3 * 5 * 5	
	90 = 2 * 3 * 3 * 5	
	Common Divisor = 3 * 5 = 15
	Here, the HCF of the three given numbers would be 15 since it divides every given number without leaving a fraction behind.
*/
public class HCFOfTwoNNumbers {

	public static void main(String arg[]) 
	{
		HCFOfTwoNNumbers pobj = new HCFOfTwoNNumbers();
		Scanner sobj = new Scanner(System.in);
		
		int iNo1, iNo2;
		
		System.out.print("Enter  first number : ");
		iNo1 = sobj.nextInt();
		
		System.out.print("Enter second number : ");
		iNo2 = sobj.nextInt();
		
		System.out.println("Hcf of two numbers is = " + pobj.highest(iNo1, iNo2));
	}

	int temp;
	int highest(int iNo1, int iNo2) 
	{
		if (iNo1 != iNo2) 
		{
			if (iNo1 > iNo2)
			{
				iNo1 = iNo1 - iNo2;
			}
			else
			{
				iNo2 = iNo2 - iNo1;
			}
			return highest(iNo1, iNo2);
		}
		return iNo1;
	}
}

/*OUTPUT: 

Enter  first number : 25
Enter second number : 3
Hcf of two numbers is = 1
*/
