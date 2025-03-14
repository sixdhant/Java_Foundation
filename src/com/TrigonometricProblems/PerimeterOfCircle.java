package com.TrigonometricProblems;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double iRadius = sobj.nextDouble();

		double iPatameter = (22 * 2 * iRadius) / 7;
		
		System.out.println("Perimeter of Circle is: " + iPatameter);
	}
}
/*OUTPUT: 

Enter the radius: 7
Perimeter of Circle is: 44.0
*/