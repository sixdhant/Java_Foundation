/**************************************** ASSIGNMENT NO - 34C ***************************************
 
 STATEMENT: Write java program which accept N numbers from user and accept  one another number as NO,
  			return index of last occurrence of that NO.
            
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_34;

import java.util.Scanner;

public class Assignment_34C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner (System.in);
		
		System.out.println("Enter the Number of Elements: ");
		int iSize = Sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Enter Elements: ");
		for(int i=0; i < Arr.length; i++)
		{
		    Arr[i] = Sobj.nextInt();
		}
		
		System.out.println("Enter Number want to search: ");
		int iSearch = Sobj.nextInt();
		
		int iRet  = Siddhant34C.assign34C(Arr, iSearch);
		
		if(iRet == -1)
		{
		    System.out.println("There is No such a Number in it.");
		}
		else
		{
	    System.out.println("Index of last occurance of that Number is: "+iRet);
		}
	}
}

class Siddhant34C {
	public static int  assign34C(int Brr[], int iNo) 
	{
		int iCnt= 1;
	      
	      for(iCnt = Brr.length-1; iCnt < 0; iCnt++)
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
66
80
88
Enter Number want to search: 66
Index of last occurance of that Number is: 5
 */