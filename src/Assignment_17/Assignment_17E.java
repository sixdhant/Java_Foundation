/********************************************* ASSIGNMENT NO - 17E ***************************************
 
 STATEMENT: Accept N numbers from user and accept one another number as NO, return frequency of NO form it.
 
 INPUT :   6, 25
 OUTPUT :  Frequency of 25 is: 1
  
*********************************************************************************************************/
 
package Assignment_17;

import java.util.Scanner;

public class Assignment_17E {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iSize= 0,iRet= 0, iCnt= 0, iNo = 0;
		
		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();
		
		int Arr[]=new int[iSize]; 
		
		System.out.println("Enter "+iSize+" number of Rows: ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	        Arr[iCnt] = Sobj.nextInt ();
	    }
		
		System.out.println("Enter the Number Want To Search: ");
		iNo = Sobj.nextInt();
		
		iRet = Siddhant17E.assign17E(Arr, iNo);
			
		System.out.println("Frequency of "+iNo+" is: "+iRet);
	}
}

class Siddhant17E
{
	public static int assign17E(int Brr[], int iValue)
	{
		int i= 0, iCnt= 0;
		 
	    for(i= 0; i < Brr.length; i++)
	    {
	       if(Brr[i] == iValue)
	       {
	          iCnt++; 
	       }
	    }
	    return iCnt;	    	 	
	}
}

/*OUTPUT: 

Enter number of Rows: 6
Enter 6 number of Rows: 
21
54
85
74
69
25
Enter the Number Want To Search:
25
Frequency of 25 is: 1


Enter number of Rows: 6
Enter 6 number of Rows: 
11
22
33
44
11
88
Enter the Number Want To Search: 
11
Frequency of 11 is: 2


*/





