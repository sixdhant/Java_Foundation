/*      Multiple Inheritance  Example	   */

package A_BasicConcept;
public class _35_Interface_Mutiple implements sid25, sid26
{
	public void show()
	{
		System.out.println("Interface A and B");
	}
	public static void main(String[] args) 
	{
		_35_Interface_Mutiple sid = new _35_Interface_Mutiple();
		sid.show();
	}
}

interface sid25
{
	void show();	// public + abstract
	
}

interface sid26
{
	void show();	// public + abstract
}

/* 

Interface A and B

*/