/* 		Parameterized	 Constructor accept values from user		*/

package A_BasicConcept;

import java.util.Scanner;

public class _07_Parameterized_Constructor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sobj = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int iNo1 = Sobj.nextInt();
		Sobj.nextLine();   // Consume the leftover newline
		
		System.out.print("Enter String : ");
		String sName = Sobj.nextLine();
		
		System.out.print("Enter Boolean Value (true/false): ");
		boolean isTrue = Sobj.nextBoolean();
		
		Siddhant7 sid = new Siddhant7(iNo1, sName, isTrue);   // Object Creation
		sid.Show();
		
	}
}
class Siddhant7
{
	int iNo1;
	String sName;
	boolean bValue;
	
	Siddhant7(int iValue1, String iValue2, boolean iValue3)   		// Parameterized Constructor
	{
		iNo1 = iValue1;
		sName = iValue2;
		bValue = iValue3;
	}
	
	void Show()  // Method
	{
		System.out.println("Output is : "+iNo1+" / "+sName+ " / "+bValue);
	}
	
}


/* Output is :

Output is : 100 / Siddhant Deshmukh

*/