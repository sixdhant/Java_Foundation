/* 		Private   Constructor			*/


package A_BasicConcept;
public class _10_Private_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Siddhant10 sid = Siddhant10.createInstance();	// Object Creation
	}
}
class Siddhant10
{
	int iNo;
	String sName;
	boolean bValue;
	
	// Private constructor to restrict direct instantiation
	private Siddhant10()  
	{
		iNo = 100; 
		sName = "Siddhant Deshmukh"; 
		bValue = true;
		System.out.println("Output is : " + iNo + " / " + sName + " / " + bValue);
	}
	
	// Static factory method to create an instance
	public static Siddhant10 createInstance() {
		return new Siddhant10();
	}	
}

/* Output is :

Output is : 100 / Siddhant Deshmukh / true

*/