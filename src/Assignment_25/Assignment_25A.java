/**************************************** ASSIGNMENT NO - 25A ***************************************
 
 STATEMENT: Write a program which accept string from user and copy the contents of that string into another string. 
function)
 
 INPUT :   siddhant deshmukh     -   suryakant
 OUTPUT :  siddhant suryakant deshmukh
  
*****************************************************************************************************/

package Assignment_25;

import java.util.Scanner;

public class Assignment_25A {

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		String str1, str2, rString;

		System.out.print("Enter String: ");
		str1 = sobj.nextLine();

		System.out.print("Enter String be inserted : ");
		str2 = sobj.nextLine();

		rString = Siddhant25A.assign25A(str1, str2);

		System.out.println("Modified String: " + rString);
	}
}

class Siddhant25A 
{
	public static String assign25A(String str1, String str2) 
	{
		String newString = new String();
		newString = str1 + " " +str2;
		return newString;
	}
}

/** OUTPUT:

Enter String: Siddhant Deshmukh
Enter String be inserted : Suryakant
Modified String: Siddhant Suryakant Deshmukh

*/