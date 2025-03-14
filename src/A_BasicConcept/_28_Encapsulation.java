/* 		Encapsulation Example		*/

package A_BasicConcept;
public class _28_Encapsulation 
{
	public static void main(String[] args) 
	{
		Siddhant28 sid = new Siddhant28();
		sid.setValue(100);
		System.out.println("Output : "+sid.getValue());
	}
}

class Siddhant28
{
	private int iValue;	// Data Hiding
	
	public void setValue(int iNo) // Data Abstraction
	{
		iValue = iNo; // 100
	}
	public int getValue()
	{
		
		return ++iValue;  // increase
	}
}

/*

Output : 101

*/