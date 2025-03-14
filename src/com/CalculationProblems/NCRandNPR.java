package com.CalculationProblems;

import java.util.Scanner;

public class NCRandNPR {

	double fact(double n) 
	{
		int i = 1;
		double fact = 1;
		while (i <= n) 
		{
			fact = fact * i;
			i++;
		}
		return fact;
	}

	double permutation(int n, int r) 
	{
		double per = fact(n) / fact(n - r);
		return per;
	}

	double combination(int n, int r) 
	{
		double com = fact(n) / (fact(n - r) * fact(r));
		return com;
	}

	public static void main(String arg[]) 
	{
		NCRandNPR pobj = new NCRandNPR();
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter value of n:");
		int n = sobj.nextInt();
		
		System.out.println("Enter value of r:");
		int r = sobj.nextInt();
		
		if (n >= r) 
		{
			System.out.println("The value of " + n + "p" + r + " is : " + pobj.permutation(n, r));
			System.out.println("The value of " + n + "c" + r + " is : " + pobj.combination(n, r));
		} 
		else
		{	
			System.out.println("n value should be greater than or equals to r value");
		}	
	}
}
/*OUTPUT:

Enter value of n:
10
Enter value of r:
5
The value of 10p5 is : 30240.0
The value of 10c5 is : 252.0
*/
