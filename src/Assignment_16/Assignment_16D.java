/*************************************** ASSIGNMENT NO - 16D ******************************************
 
 STATEMENT: Write Java program which accept N numbers from user and display
            all such elements which are divisible by 5.
 
 INPUT :    6   
 OUTPUT :   The Numbers are Divisible by 3 & 5 are:
  
******************************************************************************************************/
 
package Assignment_16;

import java.util.Scanner;

public class Assignment_16D {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		
		int iSize= 0, iRet= 0, iCnt= 0;
		
		System.out.println("Enter number of Rows: ");
		iSize = Sobj.nextInt();
		
		int Arr[]=new int[iSize]; 
		
		System.out.println("Enter "+iSize+" number of Rows: ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	        Arr[iCnt] = Sobj.nextInt ();
	    }		
		 Siddhant16D.assign16D(Arr);	
	}
}

class Siddhant16D
{
	public static void assign16D(int Brr[])
	{
		int iCnt = 0, iSum = 0;
	    System.out.println ("The Numbers are Divisible by 3 & 5 are:");
	    
	    for (iCnt = 0; iCnt < Brr.length; iCnt++)
	    {
		  if ((Brr[iCnt] % 3 == 0) && (Brr[iCnt] % 5 == 0))
		  {
		    System.out.println (+Brr[iCnt]);
		  }
	    }
	}
}

/*OUTPUT: 

Enter How many elements wants to add:
6
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
