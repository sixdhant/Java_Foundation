package com.TrigonometricProblems;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double iRadius = sobj.nextDouble();
		System.out.print("Enter the height: ");
		double iHeight = sobj.nextDouble();

		double iVolume = ((22 * iRadius * iRadius * iHeight) / 7);
		System.out.println("volume of Cylinder is: " + iVolume);
	}
}
/*OUTPUT: 

Enter the radius: 5
Enter the height: 10
volume of Cylinder is: 785.7142857142857
*/