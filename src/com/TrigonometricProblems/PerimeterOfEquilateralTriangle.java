package com.TrigonometricProblems;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the side of the Triangle  : ");
		double iSide = sobj.nextDouble();

		double iPatameter = 3 * iSide;
		System.out.println("perimeter of Triangle is: " + iPatameter);
	}
}
/*OUTPUT: 

Enter the side of the Triangle: 6
perimeter of Triangle is: 18.0
*/