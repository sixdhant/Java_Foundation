/********************************************* ASSIGNMENT NO - 18B  ***************************************
 
 STATEMENT: Accept N numbers from user and accept one another number as NO ,return index of first 
 			occurrence of that NO.
 
 INPUT :   6, 44
 OUTPUT :  Number is there at index : 3
  
*********************************************************************************************************/
 
package Assignment_18;

import java.util.Scanner;

public class Assignment_18B1 {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);		
		int iSize= 0,iCnt= 0, iNo = 0;
		int iRet = 0;
			
		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();
		
		int Arr[]=new int[iSize]; 
		
		System.out.println("Enter "+iSize+" number of Rows: ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
	    {
	        Arr[iCnt] = Sobj.nextInt ();
	    }
		
		System.out.print("Enter the Number Want To Search: ");
		iNo = Sobj.nextInt();
		
		iRet = Siddhant18B1.assign18B(Arr, iNo);
		
		if(iRet == -1)
		{
			System.out.println("There is no such number");
		}
		else
		{
		    System.out.println("First occuranceNumber is there at index : "+iRet);
		}		
	}
}

class Siddhant18B1
{
	public static int assign18B(int Brr[], int iValue)
	{
        for (int i = 0; i < Brr.length; i++) 
        {
            if (iValue == Brr[i])
            {
                return i;
            }
        }
        return -1;  
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
Enter the element to seach: 12

There is no such number



Enter number of elements: 6
Enter 6 elements:
11
22
33
44
55
66
Enter the element to search: 44

Number is there at index : 3


Enter number of elements: 6
Enter 6 elements:
11
22
33
11
22
33
Enter the element to search: 11

Number is there at index : 0



*/





