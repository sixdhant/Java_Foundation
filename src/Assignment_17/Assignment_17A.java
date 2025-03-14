/********************************************* ASSIGNMENT NO - 17A ***************************************
 
 STATEMENT: Accept N numbers from user and return frequency of even numbers.
 
 INPUT :   8
 OUTPUT :  Frequency of even numbers is: 4
  
*********************************************************************************************************/
 
package Assignment_17;

import java.util.Scanner;

public class Assignment_17A {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);		
		int iSize= 0, iRet= 0, iCnt= 0;
		
		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();
		
		int Arr[]=new int[iSize]; 
		
		System.out.println("Enter "+iSize+" number of Rows: ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	        Arr[iCnt] = Sobj.nextInt ();
	    }
		
		 iRet = Siddhant17A.assign17A(Arr);
		
		 System.out.println("Frequency of even numbers is: "+iRet);
	}
}

class Siddhant17A
{
	public static int assign17A(int Brr[])
	{
		int i= 0,iCnt= 0;
		 
	    for(i= 1; i < Brr.length; i++)
	    {
	       if(Brr[i] % 2 == 0 )
	       {
	          iCnt++;
	       }
	    }
	    return iCnt;	
	}
}

/*OUTPUT: 

Enter the Number of Elements: 6
Enter 6 Elements:
85
66
3
80
93
88

Frequency of even numbers is: 3


Enter the Number of Elements: 9
Enter 9 Elements:
11
22
33
44
55
66
77
88
99

Frequency of even numbers is: 4
*/





