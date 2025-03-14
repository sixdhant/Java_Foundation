/****************************************** ASSIGNMENT NO - 7D *******************************************
 
 STATEMENT: Write a program which accept temperature in Fahrenheit and convert it into celsius.
            (1 celsius = (Fahrenheit -32) * (5/9))
 
 INPUT :        10          34
 OUTPUT :   -12.100000    1.100000
  
 *********************************************************************************************************/
package Assignment_7;

import java.util.Scanner;

public class Assignment_7D {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo = 0;
		double iRet = 0;

		System.out.print("Enter temperature in Fahrenheit:  ");
		iNo = Sobj.nextInt();

		iRet = Siddhant7D.assign7D(iNo);

		System.out.println(" " + iNo + " KiloToMeter = " + iRet + " celsius.");
	}
}

class Siddhant7D
{
	public static double assign7D(int iValue )
	{
		double celsius = 0;

		if (iValue < 0) // Input Updater
		{
			iValue = -iValue;
		}

		celsius = ((iValue - 32) * 0.55); // (1 celsius = (Fahrenheit -32) * (5/9))

		return celsius;
	}
}

/*OUTPUT:

Enter temperature in Fahrenheit: 10
10.000000 Fahrenheit = -12.100000 celsius

Enter temperature in Fahrenheit: 34
34.000000 Fahrenheit = 1.100000 celsius

*/  


