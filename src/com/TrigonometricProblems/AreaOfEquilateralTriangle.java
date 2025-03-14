package com.TrigonometricProblems;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the side of the Triangle : ");
        double iValue= sobj.nextDouble();
        
        double  area = (Math.sqrt(3)/4)*(iValue * iValue);
        System.out.println("Area of Triangle is: " + area);
	}
}
/*OUTPUT: 

Enter the side of the Triangle : 5
Area of Triangle is: 10.825317547305483
*/