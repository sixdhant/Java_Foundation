/********************************************* ASSIGNMENT NO - 19C   ***************************************
 
 STATEMENT: Accept N numbers from user and return the difference between largest and smallest number.
 
 INPUT :   6
 OUTPUT :  Difference between largest and smallest number is : 90
  
*********************************************************************************************************/
 
package Assignment_19;

import java.util.Scanner;

public class Assignment_19C {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);		
		int iSize= 0,iCnt= 0, iNo = 0, iRet = 0;
				
		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();
		
		int Arr[]=new int[iSize]; 
		
		System.out.println("Enter "+iSize+" number of Rows: ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	        Arr[iCnt] = Sobj.nextInt ();
	    }
			
		iRet = Siddhant19C.assign19C(Arr);
				
		System.out.println("Difference between largest and smallest number is : "+iRet);		 
	}
}

class Siddhant19C
{
	public static int assign19C(int Brr[])
	{
		int i = 0, iMax= Brr[0], iMin = Brr[0], iDiff= 0;
		
		for(i = 0; i < Brr.length; i++)
	    {
	        if(Brr[i] > iMax) 
	        {   
	            iMax = Brr[i];    
	        }
	    }
	    for(i = 0; i < Brr.length; i++)
	    {
	        if(Brr[i] < iMin) 
	        {   
	        	iMin = Brr[i];    
	        }
	    }	    
	    iDiff = iMax - iMin; 	    
	   return iDiff; 	      	 	
	}
}

/*OUTPUT: 


Enter number of elements: 6
Enter 6 Elements:
85
66
3
66
93
88
Difference between largest and smallest number is : 90


Enter number of elements: 8
Enter 8 Elements:
11
22
33
44
55
66
77
88
Difference between largest and smallest number is : 77
*/





