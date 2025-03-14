/**************************************** ASSIGNMENT NO - 31C ***************************************
 
 STATEMENT: Write a java program which accept string from user and return difference between frequency
  			of small characters and frequency of capital characters.
 
 INPUT :  Siddhant
 OUTPUT : 6
   
*****************************************************************************************************/

package Assignment_31;

import java.util.Scanner;

public class Assignment_31C {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
	
		System.out.print("Enter String: ");
		String str = sobj.nextLine();
	
		int iDiff= Siddhant31C.assign31C(str);
		
		System.out.println("difference between frequency are: "+iDiff);		
	}
}

class Siddhant31C 
{
	public static int assign31C(String str) 
	{	
		int iSmall=0, iCap = 0, iDiff= 0;
		
		for( int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if((ch>= 'a') && (ch<= 'z'))
				iSmall++;
			else if((ch>= 'A') && (ch<= 'Z'))
				iCap++;
		}
		iDiff = iSmall - iCap;
		return iDiff;
	}
}

/* OUTPUT:

Enter String: Siddhant
difference between frequency are: 6
*/