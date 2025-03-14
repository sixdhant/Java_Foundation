/********************************************* ASSIGNMENT NO - 17D ***************************************
 
 STATEMENT: Accept N numbers from user and return frequency of 11 form it.
 
 INPUT :   6
 OUTPUT :  Frequency of 11 is: 1
  
*********************************************************************************************************/
 
package Assignment_17;

import java.util.Scanner;

public class Assignment_17D {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);	
		int iSize= 0,iRet= 0, iCnt= 0;
			
		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();
		
		int Arr[]=new int[iSize]; 
		
		System.out.println("Enter "+iSize+" number of Rows: ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	        Arr[iCnt] = Sobj.nextInt ();
	    }
		
		 iRet = Siddhant17D.assign17D(Arr);
			
		 System.out.println("Frequency of 11 is: "+iRet);
	}
}

class Siddhant17D
{
	public static int assign17D(int Brr[])
	{
		int i= 0, iCnt= 0;
		 
	    for(i= 0; i < Brr.length; i++)
	    {
	       if(Brr[i] == 11)
	       {
	          iCnt++; 
	       }
	    }
	    return iCnt;	    	 	
	}
}

/*OUTPUT: 

Enter the Number of Elements: 5
Enter 5 Elements:
55
44
33
22
11

Frequency of 11 is: 1


Enter the Number of Elements: 6
Enter 6 Elements:
55
11
99
88
11
25

Frequency of 11 is: 2

*/





