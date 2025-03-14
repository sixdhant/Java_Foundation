/**************************************** ASSIGNMENT NO - 25B ***************************************
 
 STATEMENT: Write a program which accept string from user and copy the contents of that 
 			string into another string.
 
 INPUT :   siddhant deshmukh    -   4
 OUTPUT :  sidd
  
*****************************************************************************************************/

package Assignment_25;

import java.lang.*;
import java.util.Scanner;

public class Assignment_25B {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
		int iSize = 8;

		System.out.print("Enter String: ");
		str = sobj.nextLine();

		System.out.print("Enter Size : ");
		iSize = sobj.nextInt();

		rString = Siddhant25B.assign25B(str, iSize);

		System.out.println("Modified String: " + rString);
	}
}

class Siddhant25B 
{
	public static String assign25B(String str, int iSize) 
	{
		String newString = new String();
		int iCnt = 0;
		
		while((str != "\0" && iCnt != iSize))
		{
			newString += str.charAt(iCnt);
			iCnt ++;			
		}
		return newString;
	}
}

/* OUTPUT:

Enter String: Siddhant Deshmukh
Enter Size: 8
Modified String: Siddhant
*/