/**************************************** ASSIGNMENT NO - 25E ***************************************
 
 STATEMENT: Write a program which 2 strings from user and concat second string after first string.
 
 INPUT :   Siddhant Suryakant , Deshmukh
 OUTPUT :  Siddhant Suryakant Deshmukh

  
*****************************************************************************************************/

package Assignment_25;

import java.lang.*;
import java.util.Scanner;

public class Assignment_25E {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str1 ,str2, rString;
	
		System.out.print("Enter First String: ");
		str1 = sobj.nextLine();
		
		System.out.print("Enter Second String: ");
		str2 = sobj.nextLine();

		rString = Siddhant25E.assign25E(str1, str2);

		System.out.println("Modified String: " + rString);
	}
}

class Siddhant25E 
{
	public static String assign25E(String str1, String str2 ) 
	{
		String newString = new String();
	    newString = str1.concat(str2); 
		return newString;
	}
}

/** OUTPUT:

Enter First String: Siddhant Suryakant
Enter Second String: Deshmukh
Modified String: Siddhant Suryakant Deshmukh
*/