package com.TrigonometricProblems;

import java.util.Scanner;

public class VolumeOfPrism {

	public static void main(String[] args) {
	
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the area of base: ");
		double iBase = sobj.nextDouble();
		System.out.print("Enter the height: ");
		double iHeight = sobj.nextDouble();

		double iArea = iBase * iHeight;
		System.out.println("Volume Of Prism is: " + iArea);
	}
}
/*OUTPUT: 

Enter the area of base: 4.5
Enter the height: 5
Volume Of Prism is: 22.5
*/