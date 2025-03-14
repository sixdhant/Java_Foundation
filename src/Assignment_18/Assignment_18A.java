/********************************************* ASSIGNMENT NO - 18A  ***************************************
 
 STATEMENT: Accept N numbers from user and accept one another number as NO, 
 			check whether NO is present or not.
 
 INPUT :  6, 55 
 OUTPUT : 55 is Present
  
*********************************************************************************************************/
 
package Assignment_18;

import java.util.Scanner;

public class Assignment_18A {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0, iNo = 0;
		boolean bRet = false;

		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter " + iSize + " number of Rows: ");
		for (iCnt = 0; iCnt < Arr.length; iCnt++) 
		{
			Arr[iCnt] = Sobj.nextInt();
		}

		System.out.print("Enter the Number Want To Search: ");
		iNo = Sobj.nextInt();

		bRet = Siddhant18A.assign18A(Arr, iNo);

		if (bRet == true) 
		{
			System.out.println(" " + iNo + " is Present");
		} 
		else 
		{
			System.out.println(" " + iNo + " is Absent");
		}
	}
}

class Siddhant18A
{
	public static boolean assign18A(int Brr[], int iValue)
	{
		int i= 0, iCnt= 0;
		 
	    for(i= 0; i < Brr.length; i++)
	    {
	       if(Brr[i] == iValue)
	       {
	          return true; 
	       }
	    }
	    return false;	    	 	
	}
}

/*OUTPUT: 
  
Enter the Number of Elements: 6
Enter 6 Elements:
11
22
33
44
55
66
Enter the Number Want To Search: 55

55 is Present


Enter the Number of Elements: 9
Enter 9 Elements:
1
2
3
4
5
6
7
8
9
Enter the Number Want To Search: 8

8 is Present

*/





