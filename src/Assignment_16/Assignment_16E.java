/*************************************** ASSIGNMENT NO - 16E ******************************************
 
 STATEMENT: Write Java program which accept N numbers from user and display
            all such elements which are divisible by 5.
 
 INPUT :    8  
 OUTPUT :   The Numbers which are multiples of 11: 66 33 88 11
  
******************************************************************************************************/
 
package Assignment_16;

import java.util.Scanner;

public class Assignment_16E {

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
		 Siddhant16E.assign16E(Arr);	
	}
}

class Siddhant16E
{
	public static void assign16E(int Brr[])
	{
		int iCnt = 0, iSum = 0;
	    System.out.println ("The Numbers which are multiples of 11:");
	    
	    for (iCnt = 0; iCnt < Brr.length; iCnt++)
	    {
		  if ((Brr[iCnt] % 11 == 0))
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






