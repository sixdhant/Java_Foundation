package com.TrigonometricProblems;

import java.util.Scanner;

public class PerimeterOfParallelogram {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.print("Enter the height of the Parallelogram: ");
		double iHeight = sobj.nextDouble();

		System.out.print("Enter the breadth of the Parallelogram: ");
		double iBreadth = sobj.nextDouble();
		
		double iPatameter = 2 * (iHeight + iBreadth);
		System.out.println("perimeter of Parallelogram is: " + iPatameter);
	}
}
/*OUTPUT: 

Enter the height of the Parallelogram: 3
Enter the breadth of the Parallelogram: 4
perimeter of Parallelogram is: 14.0
*/