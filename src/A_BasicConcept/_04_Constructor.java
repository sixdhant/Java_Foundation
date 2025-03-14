/* 			Constructor			*/

package A_BasicConcept;

public class _04_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Siddhant4 sid = new Siddhant4();  // Object Creation
		sid.Show();		
	}
}
class Siddhant4
{
	int iNo1;
	String sName;
	boolean bValue;
	/*
	Siddhant4()  // Constructor
	{
		iNo1 = 0;
		sName = null;
		bValue = false;
	}
	*/
	void Show() // Method
	{
		System.out.println("Output is : "+iNo1+" / "+sName+" / "+bValue);
	}
	
}


/* Output is :

Output is : 0 / null / false

*/