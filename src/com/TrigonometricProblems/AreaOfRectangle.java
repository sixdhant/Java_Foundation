package com.TrigonometricProblems;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String args[]) {

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		double iLength = sobj.nextDouble();
		System.out.print("Enter the Breadth : ");
		double iBreadth = sobj.nextDouble();

		double area = iLength * iBreadth;
		System.out.println("Area of Rectangle is: " + area);
	}
}
/*OUTPUT: 

Enter the Length : 10
Enter the Breadth : 5
Area of Rectangle is: 50.0
*/