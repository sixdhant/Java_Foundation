package com.TrigonometricProblems;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the length of the Rectangle: ");
		double iLength = sobj.nextDouble();

		System.out.print("Enter the width of the Rectangle: ");
		double iWidth = sobj.nextDouble();

		double iPerimeter = 2 * (iLength + iWidth);
		System.out.println("perimeter of Rectangle is: " + iPerimeter);
	}
}
/*OUTPUT: 

Enter the length of the Rectangle: 3
Enter the width of the Rectangle: 4
perimeter of Rectangle is: 14.0
*/