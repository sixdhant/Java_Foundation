/**************************************** ASSIGNMENT NO - 31E ***************************************
 
 STATEMENT: Write a java program which accept string from user and display  it in reverse order.
 
 INPUT :  Siddhant Suryakant Deshmukh
 OUTPUT : hkumhseD tnakayruS tnahddiS
   
*****************************************************************************************************/

package Assignment_31;

import java.util.Scanner;

public class Assignment_31E {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
	
		System.out.print("Enter String: ");
		String	str = sobj.nextLine();
	
		String rString = Siddhant31E.assign31E(str);
		
		System.out.println("Reverse string is : "+rString);	
	}
}

class Siddhant31E 
{
	public static String assign31E(String str) 
	{	
		String temp = "";
		for(int i = str.length() - 1; i >= 0; i--)
		{
			temp = temp + str.charAt(i);
		}
		return temp;
	}
}

/* OUTPUT:

Enter String: Siddhant Suryakant Deshmukh
Reverse string is : hkumhseD tnakayruS tnahddiS
*/