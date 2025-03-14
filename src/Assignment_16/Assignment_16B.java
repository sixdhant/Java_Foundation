/*************************************** ASSIGNMENT NO - 16B ******************************************
 
 STATEMENT: Write Java program which accept N numbers from user and display
            all such elements which are divisible by 5.
 
 INPUT :    6   
 OUTPUT :   The numbers Divisible by 5 are:  85 80
  
******************************************************************************************************/
 
package Assignment_16;

import java.util.Scanner;

public class Assignment_16B {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);

		int iSize = 0, iRet = 0, iCnt = 0;

		System.out.println("Enter number of Rows: ");
		iSize = Sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter " + iSize + " number of Rows: ");
		for (iCnt = 0; iCnt < Arr.length; iCnt++) 
		{
			Arr[iCnt] = Sobj.nextInt();
		}

		Siddhant16B.assign16B(Arr);
	}
}

class Siddhant16B
{
	public static void assign16B(int Brr[])
	{
		int iCnt = 0, iSum = 0;
	    System.out.println ("The numbers Divisible by 5 are:");
	    
	    for (iCnt = 0; iCnt < Brr.length; iCnt++)
	    {
		  if ((Brr[iCnt] % 5) == 0)
		  {
		    System.out.println (+Brr[iCnt]);
		  }
	    } 
	}
}

/*OUTPUT: 

Enter 6 number of Rows: 
85
66
3
80
93
88
The numbers Divisible by 5 are:
85
80

*/









