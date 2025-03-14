/**************************************** ASSIGNMENT NO - 25C ***************************************
 
 STATEMENT: Write a program which accept string from user and copy capital characters of that string 
 			into another string.
 
 INPUT :   Siddhant Suryakant Deshmukh
 OUTPUT :  SSD
  
*****************************************************************************************************/

package Assignment_25;

import java.util.Scanner;

public class Assignment_25C {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();

		rString = Siddhant25C.assign25C(str);

		System.out.println("Modified String: " + rString);
	}
}

class Siddhant25C 
{
	public static String assign25C(String str ) 
	{
		String newString = new String();
		int i=0, iCap=0;
		char ch;

		for(i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			if((ch>='A') && (ch<='Z'))
			{
				newString = newString + ch;
			}
		}
		return newString;
	}
}

/** OUTPUT:

Enter String: Siddhant Suryakant Deshmukh
Modified String: SSD



*/