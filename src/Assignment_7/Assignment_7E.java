/****************************************** ASSIGNMENT NO - 7E ***************************************
 
 STATEMENT: Write a program which accept  and convert it into square meter.
            (1 square feet = 0.0929 Square meter)
 
 INPUT :       5          7
 OUTPUT :   0.464500    0.650300
  
 ****************************************************************************************************/
package Assignment_7;

import java.util.Scanner;

public class Assignment_7E {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo = 0;
		double iRet = 0;

		System.out.print("Enter Area in Square Feet:  ");
		iNo = Sobj.nextInt();

		iRet = Siddhant7E.assign7E(iNo);

		System.out.println(" " + iNo + " Square Feet =" + iRet + " Square Meter.");
	}
}

class Siddhant7E
{
	public static double assign7E(int iValue )
	{
		double SqMeter= 0;
	    
	    if(iValue < 0)    //Input Updater
	    {
	    	iValue = - iValue;
	    }	    
	   SqMeter = iValue * 0.0929;   //1 Square Feet  = 0.0929 Square Meter	    
	    return SqMeter;
	}
}

/*OUTPUT:

Enter Area in Square Feet: 5
5 Square Feet = 0.464500 Square Meter

Enter Area in Square Feet: 7
7 Square Feet = 0.650300 Square Meter

*/  



