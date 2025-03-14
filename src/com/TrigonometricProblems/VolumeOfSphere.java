package com.TrigonometricProblems;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
	
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the radius of sphere: ");
		double iRadius = sobj.nextDouble();
		double iVolume = (4 * 22 * iRadius * iRadius * iRadius) / (3 * 7);
		System.out.println("Volume is: " + iVolume);
	}
}
/*OUTPUT: 

Enter the radius of sphere: 5
Volume is: 523.8095238095239
*/