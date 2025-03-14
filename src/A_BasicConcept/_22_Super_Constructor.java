/* 		Super Keyword Using Constructor Example	*/

package A_BasicConcept;
public class _22_Super_Constructor 
{
	public static void main(String args[])
	{
		Siddhant222 sid = new Siddhant222(); // Object Creation
	}
}
class Siddhant22	// Super class
{
	int iNo1 = 100, iNo2 = 200, iResult = 0;
	
	Siddhant22()	// Constructor
	{
		iResult = iNo1 + iNo2;
		System.out.println("Super Class Constructor Addition is : "+iNo1+" and " +iNo2+ " is "+iResult);
	}
}

class Siddhant222 extends Siddhant22		// Inheritance - Sub_class
{
	int iNo1 = 300, iNo2 = 400, iResult = 0;
	
	Siddhant222()	// Constructor
	{
		//super();			// No Need to call super class Constructor - if Constructor is default / if not the we need to call like super(100,200)
		iResult = iNo1 + iNo2;
		System.out.println("Sub_Class Constructor Addition is : "+iNo1+" and " +iNo2+ " is "+iResult);   
	}
}
/* OUTPUT :

Super Class Constructor Addition is : 100 and 200 is 300
Sub_Class Constructor Addition is : 300 and 400 is 700

*/