/**************************************** ASSIGNMENT NO - 26E ***************************************
 
 STATEMENT: Write a program which accept string from user and copy that characters of that string 
 			into another string by converting Toggle.
 
 INPUT :   Siddhant Deshmukh
 OUTPUT :   s I D D H A N T d E S H M U K H
   
*****************************************************************************************************/

package Assignment_26;

import java.util.Scanner;

public class Assignment_26E1 {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();
	
		Siddhant26E1.assign26E(str);
	}
}

class Siddhant26E1 
{
	public static void assign26E(String str) 
	{	
		String nString = new String();

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch))
	        {
				ch = Character.toUpperCase(ch);
				System.out.print(" " + ch);
	        }
	        else if(Character.isUpperCase(ch))
	        {
	        	ch = Character.toLowerCase(ch);
	        	System.out.print(" "+ ch);
	        }
		}		
	}
}

/* OUTPUT:

Enter String: Siddhant Deshmukh
 s I D D H A N T d E S H M U K H
*/