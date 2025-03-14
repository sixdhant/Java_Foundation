/***************************************** ASSIGNMENT NO - 7C ********************************************
 
 STATEMENT: Write a program which accept distance in kilometre and convert it into meter. 
            (1 kilometre = 1000 Meter)
 
 INPUT :     5             8
 OUTPUT :   5000         8000
 
 *********************************************************************************************************/
package Assignment_7;

import java.util.Scanner;

public class Assignment_7C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iNo = 0, iRet = 0;

		System.out.print("Enter kilometer:  ");
		iNo = Sobj.nextInt();

		iRet = Siddhant7C.assign7C(iNo);

		System.out.println(" " + iNo + " KiloToMeter = " + iRet + " Meter.");
	}
}

class Siddhant7C
{
	public static int assign7C(int iValue )
	{
		int iMeter=0;
	    
	    if(iValue < 0)
	    {
	    	iValue = - iValue;
	    }	    
	    iMeter = iValue * 1000;	    
	    return iMeter;
	}
}

/*OUTPUT:

Enter KiloMeter: 5
5 KiloToMeter = 5000 Meter

Enter KiloMeter: 8
8 KiloToMeter = 8000 Meter
*/  

