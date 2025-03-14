/* 		This Keyword 		*/

package A_BasicConcept;
public class _25_This_Keyword 
{
	public static void main(String[] args) 
	{
		_25_This_Keyword sid = new _25_This_Keyword(100);	// Object Creation
	}
	
	_25_This_Keyword()	// Default Constructor
	{
		System.out.println("Siddhant Deshmukh");
	}
	
	int iNo1 = 0;
	_25_This_Keyword(int iNo1)	// Parameterized Constructor
	{
		this();			// Using "This Keyword: we call default Constructor
		System.out.println("OUTPUT is : "+iNo1);
	}
}

/* OUTPUT :

Siddhant Deshmukh
OUTPUT is : 100

*/
