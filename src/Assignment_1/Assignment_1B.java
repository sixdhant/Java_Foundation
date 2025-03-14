/*********************************************** ASSIGNMENT NO - 1B *******************************************************
 
 STATEMENT: Program to print 'n' times "Siddhant" on Screen.
 
 INPUT :    5
 OUTPUT :  Siddhant  Siddhant  Siddhant  Siddhant  Siddhant
 
***************************************************************************************************************************/

package Assignment_1;

import java.util.Scanner;

public class Assignment_1B {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0;
		
		System.out.print("Enter Number: ");
		iNo1 = Sobj.nextInt();
		
		Siddhant1B.assign1B(iNo1);
	}
}

class Siddhant1B 
{
	 public static void assign1B(int iValue1)
	 {
		if(iValue1 <= 0)            
		{
			iValue1 = - iValue1;
		}		 
			System.out.print("\nOUTPUT: ");
		for(int i=0; i< iValue1; i++)
		{
			System.out.print("\tSiddhant");
		}
	 }
}

/* OUTPUT: 

Enter Number: 5
OUTPUT: 	Siddhant	Siddhant	Siddhant	Siddhant	Siddhant


Enter Number: 3
OUTPUT: 	Siddhant	Siddhant	Siddhant
 */