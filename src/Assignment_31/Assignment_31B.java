/**************************************** ASSIGNMENT NO - 31B ***************************************
 
 STATEMENT: Write a Java program which accept string from user and count number of small characters.
 
 INPUT :   siddhant
 OUTPUT :  8
   
*****************************************************************************************************/

package Assignment_31;

import java.util.Scanner;

public class Assignment_31B {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
	
		System.out.print("Enter String: ");
		String str = sobj.nextLine();
	
		int iRet= Siddhant31B.assign31B(str);
		
		System.out.println("Number of Capital characters are: "+iRet);	
	}
}

class Siddhant31B 
{
	public static int assign31B(String str) 
	{	
		int iSmall=0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if((ch>= 'a') && (ch<= 'z'))
				iSmall++;
		}
		return iSmall;
	}
}

/* OUTPUT:

Enter String: siddhant
Number of Capital characters are: 8
*/