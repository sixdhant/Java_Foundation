/*********************************************** ASSIGNMENT NO - 1D *******************************************************
 
 STATEMENT: Accept one number and check whether is is divisible by 5 or not.
 
 INPUT :    42
 OUTPUT :   42 is NOT divisible by 5.
 
***************************************************************************************************************************/

package Assignment_1;

import java.util.Scanner;

public class Assignment_1D {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;
		boolean bRet = false;
		
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		bRet = Siddhant1D.assign1D(iNo1);
		
		if(bRet == true)
		{
			System.out.println(""+iNo1+" is divisible by 5.");
		}
		else
		{
			System.out.println(""+iNo1+" is NOT divisible by 5.");
		}
	}
}

class Siddhant1D 
{
	 public static boolean assign1D(int iValue1)
	 {
		if(iValue1 <= 0)            
		{
			iValue1 = - iValue1;
		}		  
		if(iValue1  % 5 == 0)
		{
			return true;
		}
		return false;
	 }
}

/* OUTPUT: 

Enter Number: 15
15 is NOT divisible by 5.

Enter Number: 42
42 is NOT divisible by 5.

 */
