/* 		Super Keyword Using Method Example	*/

package A_BasicConcept;
public class _21_Super_Method 
{
	public static void main(String args[])
	{
		Siddhant221 sid = new Siddhant221(); // Object Creation
		sid.Display();
	}
}
class Siddhant21	// Super class
{
	int iNo1 = 100, iNo2 = 200, iResult = 0;
	
	void Addition()
	{
		iResult = iNo1 + iNo2;
		System.out.println("Super Class Addition is : "+iNo1+" and " +iNo2+ " is "+iResult);   
	}
}

class Siddhant221 extends Siddhant21		// Inheritance
{
	int iNo1 = 300, iNo2 = 400, iResult = 0;
	
	void Display()	// Method
	{
		super.Addition(); 	// Call Super class method in sub_class using "Super Keyword"
		iResult = iNo1 + iNo2;
		System.out.println("Sub_Class Addition is : "+iNo1+" and " +iNo2+ " is "+iResult);   
	}
}
/* OUTPUT :

Super_Class Addition is : 100 and 200 is 300
Sub_Class Addition is : 300 and 400 is 700

*/