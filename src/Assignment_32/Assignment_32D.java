/**************************************** ASSIGNMENT NO - 32D ***************************************
 
 STATEMENT: Write Java program which accept N numbers from user and display all such elements 
 			which are divisible by 3 and 5.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_32;

import java.lang.*;
import java.util.Scanner;

public class Assignment_32D {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0, iRet = 0;

		System.out.print("Enter Number of elements: ");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter Numbers: ");
		for (iCnt = 0; iCnt < Arr.length; iCnt++) {
			Arr[iCnt] = sobj.nextInt();
		}
		Siddhant32D.assign32D(Arr);
	}
}

class Siddhant32D {
	public static void assign32D(int Arr[]) 
	{
		int iCnt = 0, iSum = 0;
	    System.out.println ("The Numbers are Divisible by 3 & 5 are:");
	    
	    for (iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
		  if ((Arr[iCnt] % 3 == 0) && (Arr[iCnt] % 5 == 0))
		  {
		    System.out.println (+Arr[iCnt]);
		  }
	    }
	}
}

/* OUTPUT:

Enter How many elements wants to add: 6
Enter Numbers
85
66
15
93
80
88
The Numbers are Divisible by 3 & 5 are:
15
*/