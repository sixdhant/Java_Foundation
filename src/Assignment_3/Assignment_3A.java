/*********************************************** ASSIGNMENT NO - 3A *******************************************************
 
 STATEMENT: Accept number from user and check whether number is even or odd.
 
 INPUT :   7
 OUTPUT :  2	4	6	8	10	12	14	16
 
***************************************************************************************************************************/

package Assignment_3;

import java.util.Scanner;

public class Assignment_3A {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;
					
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		Siddhant3A.assign3A(iNo1);	
	}
}
class Siddhant3A 
{
	 public static void assign3A(int iValue1)
	 {
		if(iValue1 <= 0)            
		{
			iValue1 = - iValue1;
		}
		int iSum = 0, i = 0;
		System.out.print("OUTPUT:");
		for(i=0; i <= iValue1; i++)
		{
			iSum = iSum + 2;
			System.out.print("\t"+iSum);
		}
	 }
}

/* OUTPUT: 

Enter Number: 7
OUTPUT:	2	4	6	8	10	12	14	16

Enter Number: 10
OUTPUT:	2	4	6	8	10	12	14	16	18	20	22
*/

