/**************************************** ASSIGNMENT NO - 26D ***************************************
 
 STATEMENT: Write a program which accept string from user and copy that characters of that string 
 			into another string by converting all capital characters into small case.
 
 INPUT :   SIDDHANT DESHMUKH
 OUTPUT :  s i d d h a n t   d e s h m u k h
   
*****************************************************************************************************/

package Assignment_26;

import java.util.Scanner;

public class Assignment_26D1 {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();
	
		Siddhant26D1.assign26D(str);
	}
}

class Siddhant26D1 
{
	public static void assign26D(String str) 
	{	
		String nString = new String();

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) 
			{
				ch = Character.toLowerCase(ch);
				System.out.print(" " +ch);
			} 
			else 
			{
				System.out.print(" " +ch);
			}
		}		
	}
}

/* OUTPUT:

Enter String: SIDDHANT DESHMUKH
 s i d d h a n t   d e s h m u k h
*/