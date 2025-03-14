package com.TrigonometricProblems;

import java.util.Scanner;

public class TotalSurfaceAreaOfCylinder {

	public static void main(String[] args) {
	
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double iRadius = sobj.nextDouble();
		System.out.print("Enter the height: ");
		double iHeight = sobj.nextDouble();
		
		double iResult = ((2 * 22 * iRadius) / 7) * (iRadius + iHeight);
		System.out.println("TotalSurfaceArea Of Cylinder is:  " + iResult);
	}
}
/*OUTPUT: 

Enter the radius: 4
Enter the height: 7
TotalSurfaceArea Of Cylinder is:  276.57142857142856
*/