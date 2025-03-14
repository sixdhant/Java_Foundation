/**************************************** ASSIGNMENT NO - 34E ***************************************
 
 STATEMENT: Write java program which accept N numbers from user and return product of all odd elements.
 
 INPUT :  
 OUTPUT : 
   
*****************************************************************************************************/

package Assignment_34;

import java.util.Scanner;

public class Assignment_34E {

	public static void main(String[] args) {

		Scanner sobj=new Scanner(System.in);
		int iSize=0,iCnt=0, iValue=0, iRet=0;
	
		System.out.print("Enter How many elements wants to add: ");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		
	    System.out.println("Enter Numbers");
	    for(iCnt=0; iCnt< Arr.length; iCnt++)
	    {
	        Arr[iCnt] = sobj.nextInt();
	    }
		
		Siddhant34E.assign34E(Arr);

		System.out.println("Product of all odd elements:"+iRet);
	}
}

class Siddhant34E {
	public static int  assign34E(int Arr[]) 
	{
		int iCnt=0, iMul=1;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]%2)!=0)
			{
				iMul=iMul*Arr[iCnt];
			}
		}
			return iMul;
	}
}

/*  OUTPUT:

Enter How many elements wants to add: 6
Enter Numbers
15
66
3
70
10
88
Product of all odd elements: 45
 */