/********************************************* ASSIGNMENT NO - 17C ***************************************
 
 STATEMENT: Accept N numbers from user check whether that numbers contains 11 in it or not.
 
 INPUT :   8
 OUTPUT :  11 is Present
  
*********************************************************************************************************/
 
package Assignment_17;

import java.util.Scanner;

public class Assignment_17C {

	public static void main(String[] args) {

		Scanner Sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0;
		boolean bRet = false;

		System.out.print("Enter number of Rows: ");
		iSize = Sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter " + iSize + " number of Rows: ");
		for (iCnt = 0; iCnt < Arr.length; iCnt++) 
		{
			Arr[iCnt] = Sobj.nextInt();
		}

		bRet = Siddhant17C.assign17C(Arr);

		if (bRet == true) 
		{
			System.out.println("\n11 is Present");
		} 
		else 
		{
			System.out.println("\n11 is Absent");
		}
	}
}

class Siddhant17C
{
	public static boolean assign17C(int Brr[])
	{
		int i= 0;		 
	    for(i= 0; i < Brr.length; i++)
	    {
	       if(Brr[i] == 11)
	       {
	          return true;
	       }
	    }	    
	    return false;	
	}
}

/*OUTPUT: 

Enter the Number of Elements: 5
Enter 5 Elements:
55
44
77
88
99

11 is Absent

Enter the Number of Elements: 5
Enter 5 Elements:
55
44
33
11
22

11 is Present

*/





