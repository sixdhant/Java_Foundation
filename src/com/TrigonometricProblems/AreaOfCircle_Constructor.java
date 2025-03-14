package com.TrigonometricProblems;

import java.util.Scanner;

class Area 
{
	double area;
	Area(double r) 
	{
		area = (22 * r * r) / 7;
	}
}

public class AreaOfCircle_Constructor 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the radius : ");
		double rad = sobj.nextDouble();
		
		Area pobj = new Area(rad);
		System.out.println("Area of Circle is: " + pobj.area);
	}
}

/*OUTPUT: 

Enter the radius : 5
Area of Circle is: 78.57142857142857
*/