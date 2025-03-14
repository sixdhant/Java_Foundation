package com.TrigonometricProblems;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the width of the Triangle : ");
		double iWidth = sobj.nextDouble();

		System.out.print("Enter the height of the Triangle : ");
		double iHeight = sobj.nextDouble();

		double area = (iWidth * iHeight) / 2;
		System.out.println("Area of Triangle is: " + area);
	}
}
/*OUTPUT: 

Enter the width of the Triangle: 10
Enter the height of the Triangle: 5
Area of Triangle is: 25.0
*/