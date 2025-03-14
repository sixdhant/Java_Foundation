package com.TrigonometricProblems;

import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the side of the square: ");
		double iSide = sobj.nextDouble();
		double iPerimeter = 4 * iSide;
		System.out.println("perimeter of Square is: " + iPerimeter);
	}
}
/*OUTPUT: 

Enter the side of the square: 4
perimeter of Square is: 16.0
*/