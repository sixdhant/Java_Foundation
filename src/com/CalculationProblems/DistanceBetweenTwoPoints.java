package com.CalculationProblems;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String args[])
	{
		int xPoint1, xPoint2, yPoint1, yPoint2;
		double idistance;

		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter xPoint1 point : ");
		xPoint1 = sobj.nextInt();

		System.out.print("Enter yPoint1 point : ");
		yPoint1 = sobj.nextInt();

		System.out.print("Enter xPoint2point : ");
		xPoint2 = sobj.nextInt();

		System.out.print("Enter yPoint2 point : ");
		yPoint2 = sobj.nextInt();

		idistance = DistanceBetweenTwoPoints.calDistance(xPoint1, yPoint1, xPoint2, yPoint2);

		System.out.println("distancebetween" + "(" + xPoint1 + "," + yPoint1 + ")," + "(" + xPoint2 + "," + yPoint2 + ")===> " + idistance);

	}

	static double calDistance(int xPoint1, int yPoint1, int xPoint2, int yPoint2) 
	{
		return (Math.sqrt((xPoint2 - xPoint1) * (xPoint2 - xPoint1) + (yPoint2 - yPoint1) * (yPoint2 - yPoint1)));
	}

}
/*OUTPUT:

Enter xPoint1 point : 1
Enter yPoint1 point : 2
Enter xPoint2point : 3
Enter yPoint2 point : 4
distancebetween(1,2),(3,4)===> 2.8284271247461903

 */