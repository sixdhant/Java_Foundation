/**************************************** ASSIGNMENT NO - 34A ***************************************
 
 STATEMENT: Write java program which accept N numbers from user and accept one another number as NO,
  			check whether NO is present or not.
            
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_34;

import java.util.Scanner;

public class Assignment_34A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner (System.in);
		int iSize = 0, iSearch= 0, i= 0;
		boolean bRet = false;
		
		System.out.print("Enter the Number of Elements: ");
		iSize = Sobj.nextInt();
		
		int Arr[] = new int[iSize];
		
		System.out.println("Enter Elements: ");
		for(i=0; i < Arr.length; i++)
		{
		    Arr[i] = Sobj.nextInt();
		}
		
		System.out.print("Enter Number want to search: ");
		iSearch = Sobj.nextInt();

		bRet  = Siddhant34A.assign34A(Arr, iSearch);


		if(bRet == true)
		{
		   System.out.println("TRUE!!! Number is Present");
		}
		else
		{
		   System.out.println("FALSE!!! Number is not Present");  
		} 
	}
}

class Siddhant34A {
	public static boolean  assign34A(int Brr[], int iNo) 
	{
		int iCnt= 0;
	      
	      for(iCnt = 0; iCnt < Brr.length; iCnt++)
			{
			   if(Brr[iCnt] == iNo)
			   {
			       return true;
			   }
			}
	      return false;
	}
}

/*  OUTPUT:

Enter the Number of Elements: 6
Enter Elements: 
85
66
3
93
80
88
Enter Number want to search: 66
TRUE!!! Number is Present

Enter the Number of Elements: 6
Enter Elements: 
85
66
3
93
80
88
Enter Number want to search: 12
FALSE!!! Number is not Present
 */