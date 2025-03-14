/*********************************************** ASSIGNMENT NO - 3C *******************************************************
 
 STATEMENT: Write a program which accept number from user and print even factors of that number.
 
 INPUT :   36
 OUTPUT :  2 4 6 12 18
 
***************************************************************************************************************************/

package Assignment_3;

import java.util.Scanner;

public class Assignment_3C {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;
						
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		Siddhant3C.assign3C(iNo1);	
	}
}

class Siddhant3C
{
	 public static void assign3C(int iValue1)
	 {
		if(iValue1 <= 0)            
		{
		  iValue1 = - iValue1;
		}
		System.out.print("OUTPUT:");
		for(int i=1; (i <= iValue1 / 2); i++)
		{
			if(iValue1 % i == 0 && i % 2 == 0)
			{
				System.out.print("\t" +i);
			}
		}
	 }
}

/* OUTPUT: 

Enter Number: 36
OUTPUT:	2	4	6	12	18

Enter Number: 50
OUTPUT:	2	10
*/

