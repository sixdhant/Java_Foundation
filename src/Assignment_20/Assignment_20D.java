/********************************************* ASSIGNMENT NO - 20D   ***************************************
 
 STATEMENT: Accept Character from user and check whether it is digit or not(0-9).
 
 INPUT :   s
 OUTPUT :  It is Small case Character.
  
*********************************************************************************************************/
 
package Assignment_20;

import java.util.Scanner;

public class Assignment_20D {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		boolean bRet= false;
		
		System.out.println("Enter the character: ");  
		char c = Sobj.next().charAt(0);   
			
		bRet = Siddhant20D.assign20D(c);
		
		if(bRet == true)
	    {
			System.out.println("It is Small case Character.");
	    }
	    else
	    {
	    	System.out.println("It is NOT Small case Character.");
	    }			 
	}
}

class Siddhant20D
{
	public static boolean assign20D(char ch)
	{
		if(ch >= 97 && ch<= 122)	  
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

Enter the character: 4
It is NOT Small case Character.

Enter the character: A
It is NOT Small case Character.

Enter the character: s
It is Small case Character.

Enter the character: p
It is Small case Character.

*/





