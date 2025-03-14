/**************************************** ASSIGNMENT NO - 25D ***************************************
 
 STATEMENT: Write a program which accept string from user and copy small characters of that string 
 			into another string.
 
 INPUT :   Siddhant Suryakant Deshmukh
 OUTPUT :  iddhanturyakanteshmukh
  
*****************************************************************************************************/

package Assignment_25;

import java.lang.*;
import java.util.Scanner;

public class Assignment_25D {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();

		rString = Siddhant25D.assign25D(str);

		System.out.println("Modified String: " + rString);
	}
}

class Siddhant25D 
{
	public static String assign25D(String str ) 
	{
		String newString = new String();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if((ch>='a') && (ch<='z'))
			{
				newString = newString + ch;
			}
		}
		return newString;
	}
}

/** OUTPUT:

Enter String: Siddhant Suryakant Deshmukh
Modified String: iddhanturyakanteshmukh

*/