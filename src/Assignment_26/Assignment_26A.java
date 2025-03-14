/**************************************** ASSIGNMENT NO - 26A ***************************************
 
 STATEMENT: Write a program which accept string from user and copy that characters of that string
  			into another string in reverse order.
 
 INPUT :   Siddhant Suryakant Deshmukh
 OUTPUT :  hkumhseD tnakayruS tnahddiS
  
*****************************************************************************************************/

package Assignment_26;

import java.lang.*;
import java.util.Scanner;

public class Assignment_26A {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();
		
		Siddhant26A sid26A = new Siddhant26A();
		rString = sid26A.assign26A(str);

		System.out.println("Modified String: " + rString);
	}
}

class Siddhant26A 
{
	public String assign26A(String str) 
	{
		char[] newString;
		newString= str.toCharArray();
		int iStart = 0, iEnd = newString.length-1;
		char temp;
		while(iStart < iEnd)
		{
			temp = newString[iStart];
			newString[iStart] = newString[iEnd];
			newString[iEnd] = temp;
			iStart++;
			iEnd--;
		}		
		return new String(newString);
	}
}

/* OUTPUT:

Enter String: Siddhant Suryakant Deshmukh
Modified String: hkumhseD tnakayruS tnahddiS
*/