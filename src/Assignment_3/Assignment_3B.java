/*********************************************** ASSIGNMENT NO - 3B *******************************************************
 
 STATEMENT: Write a program which accept number from user and print even factors of that number.
 
 INPUT :   24
 OUTPUT :  1 2 3 4 6 8 12
 
***************************************************************************************************************************/

package Assignment_3;

import java.util.Scanner;

public class Assignment_3B {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;
						
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		Siddhant3B.assign3B(iNo1);	
	}
}
class Siddhant3B
{
	 public static void assign3B(int iValue1)
	 {
		if(iValue1 <= 0)            
		{
			iValue1 = - iValue1;
		}
		System.out.print("OUTPUT:");
		for(int i=1; (i <= iValue1 / 2); i++)
		{
			if(iValue1 % i == 0)
			{
				System.out.print("\t" +i);
			}
		}
	 }
}

/* OUTPUT: 

Enter Number: 24
OUTPUT:	1	2	3	4	6	8	12

Enter Number: 30
OUTPUT:	1	2	3	5	6	10	15
*/

