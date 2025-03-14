/* 		Private   Constructor			*/


package A_BasicConcept;

public class _11_Private_Constructor_1 {
	
	
	int iNo1; String sName; boolean bValue;
	private _11_Private_Constructor_1() 
	{
		iNo1 = 100; sName= "Siddhant Deshmukh"; bValue = false;
		System.out.println("Output is "+iNo1+ " / "+sName+" / "+bValue);
		
	}

	public static void main(String arg[])
	{
		_11_Private_Constructor_1 sid = new _11_Private_Constructor_1(); // Object Creation
	}

}

/* Output is :

Output is : 100 / Siddhant Deshmukh / true

*/