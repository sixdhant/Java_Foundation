package com.TrigonometricProblems;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		 double iRadius = 0;
		 Scanner sobj = new Scanner(System.in);
		 
         System.out.print("Enter the radius : ");
         iRadius = sobj.nextDouble();
         
         double area= (22 * iRadius * iRadius)/ 7 ;
         System.out.println("Area of Circle is: " + area);
	}
}

/*OUTPUT: 

Enter the radius : 5
Area of Circle is: 78.57142857142857
*/