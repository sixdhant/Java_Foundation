/*********************************************** ASSIGNMENT NO - 1C *******************************************************
 
 STATEMENT: Program to print 5 to 1 numbers on screen.
 
 INPUT :    5
 OUTPUT :   5 4 3 2 1 
 
***************************************************************************************************************************/

package Assignment_1;

import java.util.Scanner;

public class Assignment_1C {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;
		
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		Siddhant1C.assign1C(iNo1);
	}
}

class Siddhant1C 
{
	 public static void assign1C(int iValue1)
	 {
		if(iValue1 <= 0)            
		{
			iValue1 = - iValue1;
		}
		System.out.print("\nOUTPUT: ");
		for (int i = iValue1; i > 0; i--) 
		{
			System.out.print("\t" + i);
		}
	 }
}

/* OUTPUT: 

Enter Number: 5
OUTPUT: 	5	4	3	2	1

Enter Number: 10
OUTPUT: 	10	9	8	7	6	5	4	3	2	1
 */