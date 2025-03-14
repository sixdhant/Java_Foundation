/********************************************* ASSIGNMENT NO - 21E   ***************************************
 
 STATEMENT: Accept character from user and display its ASCII value in decimal, octal and hexadecimal format.
 
 INPUT :   
 OUTPUT :  
  
*********************************************************************************************************/
 
package Assignment_21;

import java.util.Scanner;

public class Assignment_21E {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);		
		
		System.out.print("Enter the character: ");  
		char c = Sobj.next().charAt(0);   
			
		Siddhant21E.assign21E(c);					 
	}
}

class Siddhant21E
{
	public static void assign21E(char ch)
	{
	   int iDecimal = ch;
	   String hex = String.format("%04x", (int) ch);
  
	   System.out.println("The Decimal value of " + ch + " is: " + iDecimal);
	   System.out.println("The character value of " + ch + " is: " + ch);  
	   System.out.println("The hexadecimal value of " + ch + " is: " + hex);  
	}
}

/*OUTPUT: 




*/






