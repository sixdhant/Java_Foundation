package com.TrigonometricProblems;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter the length of same sided : ");        
        double iLen= sobj.nextDouble();
        
        System.out.print("Enter the side2 of the Triangle : ");        
        double iSide= sobj.nextDouble();

        double  area=(iSide /4 )*Math.sqrt((4 * iLen * iLen)-(iSide * iSide));
     
        System.out.println("Area of Isosceles Triangle is: " + area);
	}
}
/*OUTPUT: 

Enter the length of same sided = 5
Enter the side2 of the Triangle = 8
Area of Isosceles Triangle is: 12.0
*/