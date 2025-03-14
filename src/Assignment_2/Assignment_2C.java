/*********************************************** ASSIGNMENT NO - 2C *******************************************************
 
 STATEMENT: Accept on number from user if number is less than 100 then print �Siddhant� otherwise print �Deshmukh�.
 
 INPUT :    55				105
 OUTPUT :   Siddhant		Deshmukh
 
***************************************************************************************************************************/

package Assignment_2;

import java.util.Scanner;

public class Assignment_2C {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iNo1 = 0;
				
		System.out.print("Enter Number: ");
		iNo1 = scan.nextInt();
		
		Siddhant2C.assign2C(iNo1);		
	}
}

class Siddhant2C 
{
	public static void assign2C(int iValue1) 
	{
		if (iValue1 <= 0) 
		{
			iValue1 = -iValue1;
		}
		System.out.print("OUTPUT: ");
		if (iValue1 < 100) 
		{
			System.out.println("Siddhant");
		} 
		else 
		{
			System.out.println("Deshmukh");
		}
	}
}

/* OUTPUT: 

Enter Number: 95
OUTPUT: Siddhant

Enter Number: 105
OUTPUT: Deshmukh
*/
