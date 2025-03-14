/**************************************** ASSIGNMENT NO - 32C ***************************************
 
 STATEMENT: Write Java program which accept N numbers from user and display
            all such elements which are even and divisible by 5.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_32;

import java.util.Scanner;

public class Assignment_32C {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0, iRet = 0;

		System.out.print("Enter Number of elements: ");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter Numbers: ");
		for (iCnt = 0; iCnt < Arr.length; iCnt++) 
		{
			Arr[iCnt] = sobj.nextInt();
		}
		Siddhant32C.assign32C(Arr);
	}
}

class Siddhant32C {
	public static void assign32C(int Brr[]) 
	{
		int iCnt = 0, iSum = 0;
	    System.out.println ("The Numbers are Even & Divisible by 5 are:");
	    
	    for (iCnt = 0; iCnt < Brr.length; iCnt++)
	    {
		  if ((Brr[iCnt] % 2 == 0) && (Brr[iCnt] % 5 == 0))
		  {
		    System.out.println (+Brr[iCnt]);
		  }
	    }
	}
}

/* OUTPUT:

Enter How many elements wants to add: 6
Enter Numbers
85
66
3
80
93
88
The Numbers are Even & Divisible by 5 are:
80
*/