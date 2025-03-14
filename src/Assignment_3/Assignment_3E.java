/*********************************************** ASSIGNMENT NO - 3 *******************************************************
 
 STATEMENT: Accept on character from user and check whether that character is vowel (a,e,i,o,u) or not.
 
 INPUT :   a						x
 OUTPUT :  character is Vowels.		character is NOT Vowels.
 
***************************************************************************************************************************/

package Assignment_3;

import java.util.Scanner;

public class Assignment_3E {

	public static void main(String[] args) {
		
		Scanner Sobj = new Scanner(System.in);
		char cValue = '\0';
		boolean bRet = false;
						
		System.out.print("Enter character: ");
		cValue = Sobj.next().charAt(0);
		
		bRet = Siddhant3E.assign3E(cValue);	
		
		if(bRet==true)
		{
			System.out.println("character is Vowels.");
		}
		else
		{
			System.out.println("character is NOT Vowels.");
		}
	}
}
class Siddhant3E
{
	 public static boolean assign3E(char ch)
	 {
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ||
				(ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) 
			{
				return true;
			}	 
		return false;		
	 }
}

/* OUTPUT: 

Enter character: a
character is Vowels.

Enter character: x
character is NOT Vowels.

Enter character: U
character is Vowels.
*/

