/********************************************* ASSIGNMENT NO - 20C   ***************************************
 
 STATEMENT: Accept Character from user and check whether it is digit or not(0-9).
 
 INPUT :   5
 OUTPUT :  It is not a Digit.
  
*********************************************************************************************************/
 
package Assignment_20;

import java.util.Scanner;

public class Assignment_20C {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		boolean bRet= false;
		
		System.out.print("Enter the character: ");  
		char c = Sobj.next().charAt(0);   
			
		bRet = Siddhant20C.assign20C(c);
		
		if(bRet == true)
	    {
			System.out.println("It is Digit.");
	    }
	    else
	    {
	    	System.out.println("It is not a Digit.");
	    }				 
	}
}

class Siddhant20C
{
	public static boolean assign20C(char ch)
	{
		if (ch >= 48 && ch <= 57) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
}

/*OUTPUT: 

Enter the character: s
It is not a Digit.

Enter the character: A
It is not a Digit.

Enter the character: 5
It is Digit.

Enter the character: 0
It is Digit.
*/





