/********************************************* ASSIGNMENT NO - 21D   ***************************************
 
 STATEMENT: Accept Character from user and check whether it is special symbol or not (!, @, #, $, %, ^, &, *).
 
 INPUT :   %
 OUTPUT :  It is a special Character
  
*********************************************************************************************************/
 
package Assignment_21;

import java.util.Scanner;

public class Assignment_21D {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		boolean bRet= false;
		
		System.out.print("Enter the character: ");  
		char c = Sobj.next().charAt(0);   
			
		bRet = Siddhant21D.assign21D(c);
		
		if(bRet == true)
	    {
			System.out.println("It is a special Character");
	    }
	    else
	    {
	    	System.out.println("It is not a special Character");
	    }				 
	}
}

class Siddhant21D
{
	public static boolean assign21D(char ch)
	{
	   
	   if(ch >= 33 && ch<= 47)	  
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

Enter the character: %
It is a special Character

Enter the character: a
It is not a special Character
*/





