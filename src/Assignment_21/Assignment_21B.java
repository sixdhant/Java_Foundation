/********************************************* ASSIGNMENT NO - 21B   ***************************************
 
 STATEMENT: Accept character from user. If character is small display its corresponding capital character,
  	    and if it small then display its corresponding capital. In other cases display as it is.
 
 INPUT :   A
 OUTPUT :  Toggle letter is: a
  
*********************************************************************************************************/
 
package Assignment_21;

import java.util.Scanner;

public class Assignment_21B {

	public static void main(String[] args) {
			
		Scanner Sobj = new Scanner(System.in);
		char cValue= '\0', cRet = '\0';
		
		System.out.println("Enter the character: ");  
		cValue = Sobj.next().charAt(0);
		
		cRet = Siddhant21B.assign21B(cValue);
		
		System.out.println("Toggle letter is: "+cRet);
	}
}

class Siddhant21B
{
	public static char assign21B(char ch)
	{
		if((ch >= 97)&&(ch <= 122))     
	      {
	        return (char) (ch - 32);
	      }
	    else if((ch >= 65)&&(ch <= 99))
	      {
	        return (char) (ch + 32);
	      }
		return ch;			  	 	
	}
}

/*OUTPUT: 

Enter the character: A
Toggle letter is: a

Enter the character: s
Toggle letter is: S

Enter the character: %
Toggle letter is: %

Enter the character: 5
Toggle letter is: 5

*/
