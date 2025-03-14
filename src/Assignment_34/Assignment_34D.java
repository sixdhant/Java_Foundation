/**************************************** ASSIGNMENT NO - 34D ***************************************
 
 STATEMENT: Write java program which accept N numbers from user and accept Range, 
 			Display all elements from that range
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_34;

import java.util.Scanner;

public class Assignment_34D {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		int iSize=0, iCnt=0, iValue=0;
	
		System.out.print("Enter How many elements wants to add: ");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		
		System.out.println("Enter Numbers : ");
	    for(iCnt=0; iCnt< Arr.length; iCnt++)
	    {
	        Arr[iCnt] = sobj.nextInt();
	    }
	   
	    System.out.print("Enter Starting Number: ");
	    int iStart=sobj.nextInt();
		
		System.out.print("Enter Ending Number: ");
	    int iEnd=sobj.nextInt();
		
	    Siddhant34D.assign34D(Arr,iStart,iEnd);


	}
}

class Siddhant34D {
	public static void  assign34D(int Arr[], int iStart, int iEnd) 
	{
		int iCnt=0;
		System.out.println("\nOutput is: ");
		for(iCnt=0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt] > iStart) && (Arr[iCnt] < iEnd))
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
}

/*  OUTPUT:

Enter How many elements wants to add:6
Enter Numbers
85
66
3
93
80
88
Enter Starting Number:60
Enter Ending Number:90

Output is: 
85
66
80
88
 */