package com.CalculationProblems;

import java.util.Scanner;

public class CalculateDiscountOfProduct {

	public static void main(String[] args) 
	{
		double iDiscount, iAmount, iMarkedprice, iResult;
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter markedprice : ");
		iMarkedprice = sobj.nextDouble();

		System.out.print("Enter discount percentage : ");
		iDiscount = sobj.nextDouble();

		iResult = 100 - iDiscount;

		iAmount = (iResult * iMarkedprice) / 100;

		System.out.println("Amount after discount =" + iAmount);
	}
}
/*OUTPUT:

Enter markedprice : 100
Enter discount percentage : 10
Amount after discount =90.0
 */