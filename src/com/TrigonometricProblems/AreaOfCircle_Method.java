package com.TrigonometricProblems;

import java.util.Scanner;

public class AreaOfCircle_Method {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double iRadius = sobj.nextDouble();
		double a = area(iRadius);
		System.out.println("Area of Circle is: " + a);
	}
	static double area(double r)
    {
		return (22 * r * r)/ 7;
    }
}

/*OUTPUT: 

Enter the radius:
5
Area of Circle is: 78.57142857142857
*/