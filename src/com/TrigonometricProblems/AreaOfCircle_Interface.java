package com.TrigonometricProblems;

import java.util.Scanner;

interface AreaCal 
{
	void circle(double r);
}

public class AreaOfCircle_Interface implements AreaCal 
{
	double area;
	public void circle(double r) 
	{
		area = (22 * r * r) / 7;
	}

	public static void main(String args[]) 
	{
		AreaOfCircle_Interface x;
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		double iRadius = sobj.nextDouble();
		x = new AreaOfCircle_Interface();
		x.circle(iRadius);
		System.out.println("Area of Circle is: " + x.area);
	}
}

/*OUTPUT: 

Enter the radius:5
Area of Circle is: 78.57142857142857
*/
