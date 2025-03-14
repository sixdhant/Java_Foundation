package com.TrigonometricProblems;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCube {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the side of cube : ");
		double iSide = sobj.nextDouble();
		double iResult = 4 * iSide * iSide;
		System.out.println("CurvedSurfaceArea Of Cube is:" + iResult);
	}
}
/*OUTPUT: 

Enter the side of cube : 4
CurvedSurfaceArea Of Cube is:64.0
*/