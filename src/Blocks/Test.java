package Blocks;

class Test
{

	public static void main(String arg[])
	{
		A t = new A(100);
		t.show();
	}		
}
class A
{
	void show()
	{
		System.out.println("I'm a Method Block");
	}

	static
	{
		System.out.println("I'm a static Block");
	}

	{
		System.out.println("I'm a Instance Block");
	}
	
	A()
	{
		System.out.println("I'm Default Constructor");
	}

	A(int n)
	{
		this();
		System.out.println("I'm Parameterise Constructor");
	}
}
