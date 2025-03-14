/**************************************** ASSIGNMENT NO - 26B ***************************************
 
 STATEMENT: Write a program which accept string from user and copy that characters of that string 
 			into another string by removing all white spaces.
 
 INPUT :   Siddhant Suryakant Deshmukh
 OUTPUT :  SiddhantSuryakantDeshmukh
   
*****************************************************************************************************/

package Assignment_26;

import java.lang.*;
import java.util.Scanner;

public class Assignment_26B {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();
	
		Siddhant26B sid26B = new Siddhant26B();
		rString = sid26B.assign26B(str);

		System.out.println("Modified String: " + rString);
	}
}

class Siddhant26B 
{
	public String assign26B(String str) 
	{	
		str = str.replaceAll(" ", "");
		return str;
	}
}

/* OUTPUT:

Enter String: Siddhant Suryakant Deshmukh
Modified String: SiddhantSuryakantDeshmukh
*/