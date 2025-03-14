/********************************************* ASSIGNMENT NO - 19A   ***************************************
 
 STATEMENT: Accept N numbers from user and return the largest number.
 
 INPUT :   6
 OUTPUT :  The largest number is: 66
  
*********************************************************************************************************/
 
package Assignment_19;

import java.util.Scanner;

public class Assignment_19A {

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
			
		iRet = Siddhant19A.assign19A(Arr);
				
		System.out.println("The largest number is: "+iRet);		 
	}
}

class Siddhant19A
{
	public static int assign19A(int Brr[])
	{
		int i = 0, iMax= Brr[0];
		  
	    for(i = 0; i < Brr.length; i++)
	    {
	        if(Brr[i] > iMax) 
	        {   
	            iMax = Brr[i];    
	        }
	    }
	   return iMax; 	      	 	
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
The largest number is: 66


Enter number of Rows: 5
Enter 5 number of Rows: 
85
42
874
635
854
The largest number is: 874
*/





