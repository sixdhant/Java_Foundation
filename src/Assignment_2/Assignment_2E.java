/*********************************************** ASSIGNMENT NO - 2E *******************************************************
 
 STATEMENT: Accept number from user and check whether number is even or odd.
 
 INPUT :    12
 OUTPUT :   12 is EVEN number.
 
***************************************************************************************************************************/

package Assignment_2;

import java.util.Scanner;

public class Assignment_2E {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iNo1 = 0;
		boolean bRet= false;
				
		System.out.print("Enter Number: ");
		iNo1 = scan.nextInt();
		
		bRet = Siddhant2E.assign2E(iNo1);
		
		if(bRet == true)
		{
			System.out.println(""+iNo1+" is EVEN number.");
		}
		else
		{
			System.out.println(""+iNo1+" is ODD number.");
		}		
	}
}

class Siddhant2E 
{
	 public static boolean assign2E(int iValue1)
	 {
		if(iValue1 <= 0)            
		{
			iValue1 = - iValue1;
		}
		if(iValue1 % 2 == 0)
		{
			return true;
		}
		return false;
	 }
}

/* OUTPUT: 

Enter Number: 12
12 is EVEN number.

Enter Number: 99
99 is ODD number.
*/
