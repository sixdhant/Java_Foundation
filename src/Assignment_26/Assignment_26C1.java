/**************************************** ASSIGNMENT NO - 26C ***************************************
 
 STATEMENT: Write a program which accept string from user and copy that characters of that string 
 			into another string by converting all small characters into capital case
 
 INPUT :   Siddhant Suryakant Deshmukh
 OUTPUT :   S I D D H A N T D E S H M U K H
   
*****************************************************************************************************/

package Assignment_26;

import java.util.Scanner;

public class Assignment_26C1 {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();
	
		Siddhant26C1.assign26C(str);
	}
}

class Siddhant26C1 
{
	public static void assign26C(String str) 
	{	
		StringBuffer nString = new StringBuffer();
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch))
	        {
				System.out.print(" "+ch);
	        }
	        else 
	        {
	        	System.out.print(" "+ch);
	        }
		}
	}
}

/* OUTPUT:

Enter String: siddhant deshmukh
 S I D D H A N T D E S H M U K H
*/