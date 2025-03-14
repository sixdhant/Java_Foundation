package com.TrigonometricProblems;

import java.util.Scanner;

public class PerimeterOfRhombus {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the side of the Rhombus: ");
		double iSide = sobj.nextDouble();
		double iPerimeter = 4 * iSide;
		System.out.println("perimeter of Rhombus is: " + iPerimeter);
	}
}
/*OUTPUT: 

Enter the side of the Rhombus: 10
perimeter of Rhombus is: 40.0
*/