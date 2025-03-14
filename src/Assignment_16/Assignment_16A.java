/********************************************* ASSIGNMENT NO - 16A ***************************************
 
 STATEMENT: Accept N numbers from user and return difference between summation of even elements and 
 			summation of odd elements.
 
 INPUT :   6  
 OUTPUT :  Difference Between Summation of even & odd elements: 53
  
*********************************************************************************************************/
 
package Assignment_16;

import java.util.Scanner;

public class Assignment_16A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);

		int iSize = 0, iRet = 0, iCnt = 0;

		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter " + iSize + " number of Rows: ");
		for (iCnt = 0; iCnt < Arr.length; iCnt++) 
		{
			Arr[iCnt] = Sobj.nextInt();
		}

		iRet = Siddhant16A.assign16A(Arr);

		System.out.println("Difference Between Summation of even & odd elements: " + iRet);
	}
}

class Siddhant16A
{
	public static int assign16A(int Brr[])
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

/*OUTPUT: 

Enter number of Rows: 6
Enter 6 number of Rows: 
85
66
3
80
93
88
Difference Between Summation of even & odd elements: 53


Enter Number of elements:6
Enter Numbers:
11
22
33
44
55
66
difference between summation of even & odd elements: 33
*/





