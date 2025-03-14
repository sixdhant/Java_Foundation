package com.TrigonometricProblems;

import java.util.Scanner;

public class VolumeOfCone {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the radius of cone: ");
		double iRadius = sobj.nextDouble();
		System.out.print("Enter the height of cone: ");
		double iHeight = sobj.nextDouble();

		double volume = (22 * iRadius * iRadius * iHeight) / (3 * 7);

		System.out.println("Volume Of Cone is: " + volume);
	}
}
/*OUTPUT: 

Enter the radius of cone: 5
Enter the height of cone: 10
Volume Of Cone is: 261.9047619047619
*/