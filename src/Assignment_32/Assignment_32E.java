/**************************************** ASSIGNMENT NO - 32E ***************************************
 
 STATEMENT: Write Java program which accept N numbers from user and display
            all such elements which are multiples of 11.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_32;

import java.lang.*;
import java.util.Scanner;

public class Assignment_32E {

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

		Siddhant32E.assign32E(Arr);
	}
}

class Siddhant32E {
	public static void assign32E(int Arr[]) 
	{
		int iCnt = 0, iSum = 0;
	    System.out.println ("The Numbers which are multiples of 11:");
	    
	    for (iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
		  if ((Arr[iCnt] % 11 == 0))
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
33
93
88
99
The Numbers which are multiples of 11:
66
33
88
99
*/