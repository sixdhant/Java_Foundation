/************************************** ASSIGNMENT NO - 7A *******************************************
 
 STATEMENT: Write a program which accept radius of circle from user and calculate its area.
            Consider value of PI as 3.14. (Area = PI * Radius * Radius)
 
 INPUT :      5.3           10.4
 OUTPUT :  88.202606     339.622375
 
 ****************************************************************************************************/
package Assignment_7;

import java.util.Scanner;

public class Assignment_7A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		float iNo = 0;
		double dRet = 0;

		System.out.print("Enter Number: ");
		iNo = Sobj.nextInt();

		dRet = Siddhant7A.assign7A(iNo);

		System.out.println("Area of Circle is: " + dRet);
	}
}

class Siddhant7A
{
	public static double assign7A(float iValue)
	{
		double pi = 3.14, area;
	    
	    if(iValue < 0)
	    {
	    	iValue = - iValue;    
	    }	    
	    area = (pi * iValue * iValue);	    
	    return area;
	}
}


/*OUTPUT:

Enter Number: 22
Area of Circle is: 1519.76

Enter Number: 10
Area of Circle is: 314.0
*/  

