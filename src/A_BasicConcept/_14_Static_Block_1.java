/* 			Static Block Example			*/

package A_BasicConcept;
public class _14_Static_Block_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Siddhant12 sid = new Siddhant12();		// Object Creation
		sid.Show();
	}

}
class Siddhant12
{
	Siddhant12() 	// Constructor
	{
		int iNo1 = 100, iNo2 = 200;
		System.out.println("Output 1 : "+iNo1+" and "+iNo2);		// Second Run Constructor
	}
	
	static		// Static Block
	{
		int iNo1 = 300, iNo2 = 400;
		System.out.println("Output 2 : "+iNo1+" and "+iNo2);		// 	First Run Static Block
	}
	
	void Show()  // Method
	{
		int iNo1 = 500, iNo2 = 600;
		System.out.println("Output 3 : "+iNo1+" and "+iNo2);		// 	Third Run Method
	}
}

/*

Output 2 : 300 and 400
Output 1 : 100 and 200
Output 3 : 500 and 600


*/