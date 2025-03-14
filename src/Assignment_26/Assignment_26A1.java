/**************************************** ASSIGNMENT NO - 26A ***************************************
 
 STATEMENT: Write a program which accept string from user and copy that characters of that string
  			into another string in reverse order.
 
 INPUT :   Siddhant Suryakant Deshmukh
 OUTPUT :  hkumhseD tnakayruS tnahddiS
  
*****************************************************************************************************/

package Assignment_26;

import java.lang.*;
import java.util.Scanner;

public class Assignment_26A1 {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();
		
		rString = Siddhant26A1.assign26A(str);

		System.out.println("Modified String: " + rString);
	}
}

class Siddhant26A1 
{
	public static String assign26A(String str) 
	{
		String newString = ""; 

        for (int i = str.length() - 1; i >= 0 ; i--) 
        {
            newString = newString + str.charAt(i);
        }
        return newString;
	}
}

/** OUTPUT:

Enter String: Siddhant Suryakant Deshmukh
Modified String: hkumhseD tnakayruS tnahddiS
*/