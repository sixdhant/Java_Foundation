package This_Keyword;

class Test
{
	int iNo1 = 0;

	Test()
	{
		System.out.println("I'm Default Constructor");
	}	

	Test(int iNo1)
	{
		this();
		this.iNo1 = iNo1 ;
	}
	
	void show()
	{
		System.out.println(this);
		System.out.println(iNo1);
	}
	public static void main(String arg[])
	{
		Test t =  new Test(50);
		System.out.println(t);
		t.show();
	}
		
}
