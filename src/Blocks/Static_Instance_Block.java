package Blocks;

public class Static_Instance_Block 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Siddhant14 sid = new Siddhant14();		// Object Creation
		sid.Show();
	}
}
class Siddhant14
{
	static int iNo1 = 0, iNo2= 0;
	Siddhant14() 	// Constructor
	{
		iNo1 = 100; iNo2 = 200;
		System.out.println("Output 1 : "+iNo1+" and "+iNo2);		//  Third Run Constructor
	}
	
	// Instance Block
	{
		iNo1 = 300; iNo2 = 400;
		System.out.println("Output 2 : "+iNo1+" and "+iNo2);		// 	Second Run Instance Block
	}
	
	static // Static Block
	{
		iNo1 = 500; iNo2 = 600;
		System.out.println("Output 3 : "+iNo1+" and "+iNo2);		// 	First Run Static Block
	}
	
	void Show()  // Method
	{
		iNo1 = 700; iNo2 = 800;
		System.out.println("Output 4 : "+iNo1+" and "+iNo2);		// 	Forth Run Method
	}
	
}

/*

Output 3 : 500 and 600
Output 2 : 300 and 400
Output 1 : 100 and 200
Output 4 : 700 and 800

*/