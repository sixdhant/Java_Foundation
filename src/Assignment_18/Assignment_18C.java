/********************************************* ASSIGNMENT NO - 18C  ***************************************
 
 STATEMENT: Accept N numbers from user and accept one another number as NO ,return index of last 
 			occurrence of that NO.
 
 INPUT :   6, 11
 OUTPUT :  Last occurance of Number11 is there at index : 5
  
*********************************************************************************************************/
 
package Assignment_18;

import java.util.Scanner;

public class Assignment_18C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0, iNo = 0;
		int iRet = 0;

		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter " + iSize + " number of Rows: ");
		for (iCnt = 0; iCnt < Arr.length; iCnt++) {
			Arr[iCnt] = Sobj.nextInt();
		}

		System.out.print("Enter the Number Want To Search: ");
		iNo = Sobj.nextInt();

		iRet = Siddhant18C.assign18C(Arr, iNo);

		if(iRet == -1)
	    {
		 	System.out.println("There is no such number");
	    }
	    else
	    {
	    	System.out.println("Last occurance of Number" +iNo+" is there at index : "+iRet);
	    }	
	}
}

class Siddhant18C
{
	public static int assign18C(int Brr[], int iValue)
	{
		int n = Brr.length;
        int ifirst = -1, ilast = -1;
        for (int i = 0; i < n; i++) 
        {
            if (iValue != Brr[i])
            {
                continue;
            }
            if (ifirst == -1)
            {
                ifirst = i;
            }
            ilast = i;
        }
        return ilast;      
	}
}

/*OUTPUT: 

Enter number of Rows: 
6
Enter 6 number of Rows: 
11
22
33
44
55
11
Enter the Number Want To Search: 
11
Last occurance of Number11 is there at index : 5



Enter number of Rows: 
6
Enter 6 number of Rows: 
11
22
33
44
55
66
Enter the Number Want To Search: 
12
There is no such number


*/





