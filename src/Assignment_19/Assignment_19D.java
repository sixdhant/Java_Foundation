/********************************************* ASSIGNMENT NO - 19D   ***************************************
 
 STATEMENT: Accept N numbers from user and display all such numbers which contains 3 digits in it.
 
 INPUT :   
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_19;

import java.util.Scanner;

public class Assignment_19D {

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
			
		iRet = Siddhant19D.assign19D(Arr);
				
		System.out.println("Numbers which contains 3 digits in it is : "+iRet);		 
	}
}

class Siddhant19D
{
	public static int assign19D(int Brr[])
	{
		int iDigit = 0, iCnt= 0, iSum= 0;
		 
		for(iCnt = 0; iCnt < Brr.length; iCnt++)
		{
			iDigit = Brr[iCnt] % 10;
			
			if(iDigit == 3)
			{
				iSum++;
			}
			Brr[iCnt] =  Brr[iCnt] / 10;
		}
		return iSum;     
	}
}

/*OUTPUT: 

Enter number of Rows: 4
Enter 4 number of Rows: 
123
123
123
456
Numbers which contains 3 digits in it is : 3

*/





