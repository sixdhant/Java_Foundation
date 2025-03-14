/**************************************** ASSIGNMENT NO - 26C ***************************************
 
 STATEMENT: Write a program which accept string from user and copy that characters of that string 
 			into another string by converting all small characters into capital case
 
 INPUT :   Siddhant Suryakant Deshmukh
 OUTPUT :   S I D D H A N T D E S H M U K H
   
*****************************************************************************************************/

package Assignment_26;

import java.lang.*;
import java.util.Scanner;

public class Assignment_26C {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str, rString;
	
		System.out.print("Enter String: ");
		str = sobj.nextLine();
	
		Siddhant26C sid26C = new Siddhant26C();
		sid26C.assign26C(str);
	}
}

class Siddhant26C 
{
	public void assign26C(String str) 
	{	
		String nString = new String();
		int iCnt=0, iCap=0;
		char ch;

		for(iCnt = 0; iCnt < str.length(); iCnt++)
		{
			ch = str.charAt(iCnt);
			if(( ch >='a') && (ch <= 'z'))
	        {
				ch = (char) (ch - 32);
				System.out.print(" " + ch);
	        }
	        else if(( ch >='A') && ( ch <= 'Z'))
	        {
	        	ch = (char) (ch + 32);
	        	System.out.print(" " + ch);
	        }
		}		
	}
}

/* OUTPUT:

Enter String: siddhant deshmukh
 S I D D H A N T D E S H M U K H
*/