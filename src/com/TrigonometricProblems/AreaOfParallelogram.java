package com.TrigonometricProblems;

import java.util.Scanner;

public class AreaOfParallelogram {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the height : ");
        double height = sobj.nextDouble();
        
        System.out.print("Enter the breadth : ");
        double breadth = sobj.nextDouble();
         
        double  area=(height * breadth) ;
        System.out.println("Area of Parallelogram is : " + area);
	}
}
/*OUTPUT: 

Enter the height: 5
Enter the breadth: 5
Area of Parallelogram is: 25.0
*/