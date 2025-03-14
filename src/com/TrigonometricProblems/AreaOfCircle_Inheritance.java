package com.TrigonometricProblems;

import java.util.Scanner;

class AreaCalculation
{
	double area;
	void circle(double r)
	{
	 area= (22*r*r)/7;
	}
}

public class AreaOfCircle_Inheritance extends AreaCalculation
{
	public static void main(String[] args) 
	{		
		  Scanner sobj = new Scanner(System.in);
		  
	      System.out.print("Enter the radius : ");
	      double iRadius = sobj.nextDouble();
	      
	      AreaOfCircle_Inheritance pobj =new AreaOfCircle_Inheritance();
	      pobj.circle(iRadius);
	      System.out.println("Area of Circle is: " + pobj.area);
	}
}

/*OUTPUT: 

Enter the radius : 5
Area of Circle is: 78.57142857142857
*/