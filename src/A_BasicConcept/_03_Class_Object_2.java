/* 			Class and Object Using Parametrized	 and Accept values from user  */

package A_BasicConcept;

import java.util.Scanner;

public class _03_Class_Object_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sobj = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int iNo1 = Sobj.nextInt();
		Sobj.nextLine();   // Consume the leftover newline
		
		System.out.print("Enter String : ");
		String sName = Sobj.nextLine();
		
		Siddhant3 sid = new Siddhant3();  // Object Creation
		sid.show(iNo1, sName);
	}
}
class Siddhant3 
{
	void show(int iValue1, String iValue2)
	{
		System.out.println("Output is : "+ iValue1  +" / " +iValue2);
	}
}

/* Output is :
 
Enter Number : 15
Enter String : Siddhant Deshmukh
Output is : 15 / Siddhant Deshmukh

*/

