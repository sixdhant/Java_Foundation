/********************************************* ASSIGNMENT NO - 19B   ***************************************
 
 STATEMENT: Accept N numbers from user and return the smallest number.
 
 INPUT :   6
 OUTPUT :  The smallest  number is: 11
  
*********************************************************************************************************/
 
package Assignment_19;

import java.util.Scanner;

public class Assignment_19B {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);		
		int iSize= 0,iCnt= 0, iNo = 0, iRet = 0;
				
		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();
		
		int Arr[]=new int[iSize]; 
		
		System.out.println("Enter "+iSize+" number of Rows: ");
		for(iCnt = 0; iCnt < iSize; iCnt++)
	    {
	        Arr[iCnt] = Sobj.nextInt ();
	    }
			
		iRet = Siddhant19B.assign19B(Arr);
				
		System.out.println("The smallest  number is: "+iRet);		 
	}
}

class Siddhant19B
{
	public static int assign19B(int Brr[])
	{		int i = 0, iMin= Brr[0];
		  
	    for(i = 0; i < Brr.length; i++)
	    {
	        if(Brr[i] < iMin) 
	        {   
	        	iMin = Brr[i];    
	        }
	    }
	   return iMin; 	      	 	
	}
}

/*OUTPUT: 

Enter number of Rows: 6
Enter 6 number of Rows: 
11
22
33
44
55
66
The smallest  number is: 11


Enter number of Rows: 5
Enter 5 number of Rows: 
7
63
5
74
1
The smallest  number is: 1

*/





