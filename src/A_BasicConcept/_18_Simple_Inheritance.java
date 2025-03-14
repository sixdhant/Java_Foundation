/* 		Simple Inheritance Example	*/

package A_BasicConcept;
public class _18_Simple_Inheritance extends Siddhant18
{
	public static void main(String[] args) 
	{
		Siddhant18 sid = new Siddhant18();
		_18_Simple_Inheritance sid1 = new _18_Simple_Inheritance();
		sid.Enter();
		sid1.Display();
	}
	
	void Display()
	{
		iRoll = 21; iMarks = 100; sName = "Siddhant Deshmukh";
		System.out.println("Output is : "+iRoll+" / "+iMarks+" / "+sName);
	}
	
}

class Siddhant18
{
	int iRoll, iMarks;
	String sName;
	
    void Enter()
    {
    	System.out.println("Please Enter Deatils: ");
    }
	
}

/*

Please Enter Deatils: 
Output is : 21 / 100 / Siddhant Deshmukh


*/