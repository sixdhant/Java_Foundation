/********************************************* ASSIGNMENT NO - 18D  ***************************************
 
 STATEMENT: Accept N numbers from user and accept Range, Display all elements from that range
 
 INPUT :   20, 80
 OUTPUT :  Range: 77       66      55      44      33      22
  
*********************************************************************************************************/
 
package Assignment_18;

import java.util.Scanner;

public class Assignment_18D {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);

		int iSize = 0, iCnt = 0, iNo1 = 0,iNo2 = 0;
	
		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter " + iSize + " number of Rows: ");
		for (iCnt = 0; iCnt < Arr.length; iCnt++) {
			Arr[iCnt] = Sobj.nextInt();
		}

		System.out.print("Enter the Starting Point: ");
		iNo1 = Sobj.nextInt();
		
		System.out.print("Enter the Ending Point: ");
		iNo2 = Sobj.nextInt();

		Siddhant18D.assign18D(Arr, iNo1, iNo2);	
	}
}

class Siddhant18D
{
	public static void assign18D(int Brr[], int iStart, int iEnd)
	{
		int i = 0, iLen = Brr.length;
		System.out.println("length: "+iLen);
		System.out.println("Output: ");
		
	    for(i = iLen; i >= 1; i--)
	    {
	        if(Brr[i] >= iStart && Brr[i] <= iEnd) 
	        {   
	        	System.out.print("\t"+Brr[i]);
	        }
	    }       
	}
}

/*OUTPUT: 

Enter number of elements: 8
Enter 8 elements:
11
22
33
44
55
66
77
88
Enter the Starting Point: 20
Enter the Ending Point: 80

Range: 77       66      55      44      33      22


Enter number of elements: 10
Enter 10 elements:
15
35
75
95
51
53
57
59
5
65
Enter the Starting Point: 30
Enter the Ending Point: 60

Range: 59       57      53      51      35

*/





