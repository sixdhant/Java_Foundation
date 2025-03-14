package Super_Keyword;
class A
{
	int a=100;
	
	void display()
	{
		System.out.println("Siddhant");
	}
	
	A()
	{
		System.out.println("I'm Constructor of class A");
	}
	
}

class B extends A
{
	int a=200;
	void show()
	{
		System.out.println(a);	
		System.out.println(super.a);
	}
	
	void display()
	{
		super.display();
		System.out.println("Deshmukh");
	}
	
	B()
	{
		super();
		System.out.println("I'm Constructor of class B");
	}
}

class Test
{
	public static void main(String arg[])
	{
		B b = new B();
		b.show();
		b.display();
	}
}