/*********************************************** ASSIGNMENT NO - 1A *******************************************************
 
 STATEMENT: Program to divide two numbers.
 
 INPUT :   15, 5
 OUTPUT :  3
 
***************************************************************************************************************************/

package Assignment_1;

import java.util.Scanner;

public class Assignment_1A {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2= 0, iRet = 0;
		
		System.out.print("Enter First Number: ");
		iNo1 = Sobj.nextInt();
		
		System.out.print("Enter Second Number: ");
		iNo2 = Sobj.nextInt();
		
		iRet = Siddhant1A.assign1A(iNo1, iNo2);
		
		System.out.println("Division of given two numbers is: "+iRet);
	}
}

 class Siddhant1A 
 {
	 public static int assign1A(int iValue1, int iValue2)
	 {
		 int iDiv = 0;		 
		 if(iValue2 > iValue1)
		 {
			 return -1;
		 }		 
		 iDiv = iValue1 / iValue2;		 
		 return iDiv; 
	 }
 }

 
/* OUTPUT: 
 
Enter First Number: 15
Enter Second Number: 5
Division of given two numbers is: 3

Enter First Number: 5
Enter Second Number: 15
Division of given two numbers is: -1
*/