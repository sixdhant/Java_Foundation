/***************************************** ASSIGNMENT NO - 7B *******************************************
 
 STATEMENT: Write a program which accept width & height of rectangle from user and calculate its area. 
 			(Area = Width * Height)
 
 INPUT :     5.3, 9.78 
 OUTPUT :     51.834
 
 ********************************************************************************************************/
package Assignment_7;

import java.util.Scanner;

public class Assignment_7B {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		float iNo1 = 0, iNo2 = 0;
		double dRet = 0;

		System.out.print("Enter Width:  ");
		iNo1 = Sobj.nextInt();

		System.out.print("Enter Height:  ");
		iNo2 = Sobj.nextInt();

		dRet = Siddhant7B.assign7B(iNo1, iNo2);

		System.out.println("Area of Rectangle is: " + dRet);
	}
}

class Siddhant7B
{
	public static double assign7B(float iValue1, float iValue2)
	{
		double pi = 3.14, area;
	    
	    if(iValue1 < 0)
	    {
	    	iValue1 = - iValue1;    
	    }
	    if(iValue2 < 0)
	    {
	    	iValue2 = - iValue2;    
	    }
	    
	    area = iValue1 * iValue2;
	    
	    return area;
	}
}

/*OUTPUT:

Enter Number: 5
Enter Number: 10
Area of Rectangle is:: 50.0

Enter Number: 25
Enter Number: 20
Area of Rectangle is: 500.0
*/  

