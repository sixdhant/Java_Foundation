package com.TrigonometricProblems;

import java.util.Scanner;

public class AreaOfRhombus {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the height: ");
        double iHeight = sobj.nextDouble();
        
        System.out.print("Enter the breadth: ");
        double iBreadth = sobj.nextDouble();
         
        double  area=(iHeight * iBreadth) / 2 ;
        System.out.println("Area of Rhombus is: " + area);
	}

}
/*OUTPUT: 

Enter the height: 15
Enter the breadth: 18
Area of Rhombus is: 135.0
*/