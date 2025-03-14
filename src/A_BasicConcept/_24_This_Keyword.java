/* 		This Keyword 		*/

package A_BasicConcept;
public class _24_This_Keyword 
{
	public static void main(String[] args) 
	{
		_24_This_Keyword sid = new _24_This_Keyword(100);	// Object Creation
		 sid.Display();
	}
	
	int iNo1 = 0;
	
	_24_This_Keyword(int iNo1)
	{
		this.iNo1 = iNo1;		// Without This Keyword - Display Method print iNo1 = 0;
	}
	
	void Display() 	// Method
	{
		System.out.println("Output is : "+iNo1);  // Same Instance value
	}
}

/* OUTPUT :

Output is : 100

*/
