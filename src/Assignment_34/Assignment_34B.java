/**************************************** ASSIGNMENT NO - 34B ***************************************
 
 STATEMENT: Write java program which accept N numbers from user and accept  one another number as NO,
  			return index of first occurrence of that NO.
            
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_34;

import java.util.Scanner;

public class Assignment_34B {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner (System.in);
		int iSize = 0, iSearch= 0, i= 0;
		int iRet = 0;
		
		System.out.println("Enter the Number of Elements: ");
		iSize = Sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Enter Elements: ");
		for(i=0; i < Arr.length; i++)
		{
		    Arr[i] = Sobj.nextInt();
		}
		
		System.out.println("Enter Number want to search: ");
		iSearch = Sobj.nextInt();
		
		iRet  = Siddhant34B.assign34B(Arr, iSearch);
		
		if(iRet == -1)
		{
		    System.out.println("There is No such a Number in it.");
		}
		else
		{
	    System.out.println("Index of first occurance of that Number is: "+iRet);
		}

	}
}

class Siddhant34B {
	public static int  assign34B(int Brr[], int iNo) 
	{
		int iCnt= 1;
	      
	      for(iCnt = 1; iCnt < Brr.length; iCnt++)
			{
			   if(Brr[iCnt] == iNo)
			   {
				   return iCnt;
			   }
			}
		   return -1;
	}
}

/*  OUTPUT:

Enter the Number of Elements: 6
Enter Elements: 
85
66
3
93
55
80
Enter Number want to search: 66
Index of first occurance of that Number is: 1

Enter the Number of Elements: 4
Enter Elements: 
11
22
33
44
Enter Number want to search: 12
There is No such a Number in it.
 */