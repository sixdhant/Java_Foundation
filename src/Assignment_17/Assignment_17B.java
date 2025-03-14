/********************************************* ASSIGNMENT NO - 17B ***************************************
 
 STATEMENT: Accept N numbers from user and return difference between frequency of even number and odd numbers.
 
 INPUT :   8
 OUTPUT :  Difference between frequency of even & odd numbers.: 1
  
*********************************************************************************************************/
 
package Assignment_17;

import java.util.Scanner;

public class Assignment_17B {

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
		
		 iRet = Siddhant17B.assign17B(Arr);
		
		 System.out.println("Difference between frequency of even & odd numbers : "+iRet);
	}
}

class Siddhant17B
{
	public static int assign17B(int Brr[])
	{
		int i= 0,iEven= 0, iOdd=0, iDiff= 0;
		 
	    for(i= 0; i < Brr.length; i++)
	    {
	       if(Brr[i] % 2 == 0 )
	       {
	          iEven++;
	       }
	       else
	       {
	          iOdd++; 
	       }
	    }	    
	    iDiff = iEven - iOdd;	    
	    return iDiff;	
	}
}

/*OUTPUT: 

Enter the Number of Elements: 7
Enter 7 Elements:
85
66
3
80
93
88
90

Difference between frequency of even & odd numbers.: 1

Enter the Number of Elements: 10
Enter 10 Elements:
14
98
13
99
75
66
88
44
100
1000

Difference between frequency of even & odd numbers.: 4


*/





