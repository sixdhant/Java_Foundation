/**************************************** ASSIGNMENT NO - 32A ***************************************
 
 STATEMENT: Write Java program which accept N numbers from user and return difference between 
 			summation of even elements and summation of odd elements.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_32;

import java.util.Scanner;

public class Assignment_32A {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0, iRet = 0;

		System.out.print("Enter Number of elements: ");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter Numbers:");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
		iRet = Siddhant32A.assign32A(Arr);
		
		System.out.println("Difference between summation of even & odd elements: "+iRet);
	}
}

class Siddhant32A 
{
	public static int  assign32A(int Brr[]) 
	{	
		int iEven = 0, iOdd= 0, iDiff= 0, iCnt = 0;
		for(iCnt = 0; iCnt < Brr.length; iCnt++)
		{
		   if(Brr[iCnt] % 2 == 0)
		   {
		       iEven = iEven + Brr[iCnt];
		   }
		   else
		   {
		       iOdd = iOdd + Brr[iCnt];
		   }
		}
		iDiff = iEven - iOdd;
		return iDiff;
	}
}

/* OUTPUT:

Enter Number of elements: 6
Enter Numbers:
85
3
66
80
93
88
Difference between summation of even & odd elements: 53

Enter Number of elements: 6
Enter Numbers:
11
22
33
44
55
66
Difference between summation of even & odd elements: 33
*/