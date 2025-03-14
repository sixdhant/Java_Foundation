/********************************************* ASSIGNMENT NO - 18E  ***************************************
 
 STATEMENT: Accept N numbers from user and return product of all odd elements.
 
 INPUT :   6
 OUTPUT :  Product of all odd elements: 19965
  
*********************************************************************************************************/
 
package Assignment_18;

import java.util.Scanner;

public class Assignment_18E {

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
			
		iRet = Siddhant18E.assign18E(Arr);
				
		 if(iRet == 1)
		 {
			 	System.out.println("There is no such Odd number");
		 }
		 else
		 {
		    	System.out.println("Product of all odd elements: "+iRet);
		 }
	}
}

class Siddhant18E
{
	public static int assign18E(int Brr[])
	{
		int i = 0, iMult= 1, iSize= Brr.length;
		  
	    for(i = 0; i < iSize; i++)
	    {
	        if((Brr[i] % 2) != 0) 
	        {   
	            iMult = (iMult * Brr[i]);    
	        }
	    }	    
	    return iMult;  	      	 	
	}
}

/*OUTPUT: 

Enter number of elements: 6
Enter 6 elements:
11
22
33
44
55
66

Product of all odd elements: 19965


Enter number of elements: 10
Enter 10 elements:
12
65
85
75
14
62
86
12
16
20

Product of all odd elements: 414375

*/





